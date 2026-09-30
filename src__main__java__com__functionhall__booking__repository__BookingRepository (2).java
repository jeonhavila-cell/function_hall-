package com.functionhall.booking.repository;
import com.functionhall.booking.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;
public interface BookingRepository extends JpaRepository<Booking,Long>{
 boolean existsByHallIdAndBookingDateAndBookingStatus(Long hallId,LocalDate date,String status);
 List<Booking> findByCustomerEmailIgnoreCase(String email);
}
