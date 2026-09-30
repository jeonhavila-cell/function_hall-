package com.functionhall.booking.controller;
import com.functionhall.booking.model.*;
import com.functionhall.booking.repository.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
@RestController @RequestMapping("/api/bookings") @CrossOrigin
public class BookingController {
 private final BookingRepository bookings; private final HallRepository halls;
 public BookingController(BookingRepository b,HallRepository h){bookings=b;halls=h;}
 @GetMapping public List<Booking> all(){return bookings.findAll();}
 @GetMapping("/customer") public List<Booking> customer(@RequestParam String email){return bookings.findByCustomerEmailIgnoreCase(email);}
 @GetMapping("/availability") public boolean available(@RequestParam Long hallId,@RequestParam LocalDate date){
  return !bookings.existsByHallIdAndBookingDateAndBookingStatus(hallId,date,"CONFIRMED");
 }
 @PostMapping public ResponseEntity<?> create(@RequestBody Booking b){
  if(!halls.existsById(b.getHallId())) return ResponseEntity.badRequest().body("Hall not found");
  if(bookings.existsByHallIdAndBookingDateAndBookingStatus(b.getHallId(),b.getBookingDate(),"CONFIRMED"))
   return ResponseEntity.status(HttpStatus.CONFLICT).body("Hall is already booked for this date");
  b.setBookingStatus("CONFIRMED"); b.setPaymentStatus("PENDING");
  return ResponseEntity.ok(bookings.save(b));
 }
 @PostMapping("/{id}/test-payment")
 public ResponseEntity<?> testPayment(@PathVariable Long id){
  return bookings.findById(id).map(b->{b.setPaymentStatus("PAID-TEST");b.setPaymentReference("TEST-"+UUID.randomUUID().toString().substring(0,8).toUpperCase());return ResponseEntity.ok(bookings.save(b));})
   .orElse(ResponseEntity.notFound().build());
 }
 @DeleteMapping("/{id}") public void cancel(@PathVariable Long id){
  bookings.findById(id).ifPresent(b->{b.setBookingStatus("CANCELLED");bookings.save(b);});
 }
}
