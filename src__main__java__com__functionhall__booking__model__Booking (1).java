package com.functionhall.booking.model;
import jakarta.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name="bookings")
public class Booking {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 private Long hallId; private String customerName, customerEmail, eventType;
 private LocalDate bookingDate;
 private Double amount;
 private String bookingStatus="CONFIRMED", paymentStatus="PENDING", paymentReference;
 public Booking(){}
 public Long getId(){return id;} public Long getHallId(){return hallId;} public void setHallId(Long v){hallId=v;}
 public String getCustomerName(){return customerName;} public void setCustomerName(String v){customerName=v;}
 public String getCustomerEmail(){return customerEmail;} public void setCustomerEmail(String v){customerEmail=v;}
 public String getEventType(){return eventType;} public void setEventType(String v){eventType=v;}
 public LocalDate getBookingDate(){return bookingDate;} public void setBookingDate(LocalDate v){bookingDate=v;}
 public Double getAmount(){return amount;} public void setAmount(Double v){amount=v;}
 public String getBookingStatus(){return bookingStatus;} public void setBookingStatus(String v){bookingStatus=v;}
 public String getPaymentStatus(){return paymentStatus;} public void setPaymentStatus(String v){paymentStatus=v;}
 public String getPaymentReference(){return paymentReference;} public void setPaymentReference(String v){paymentReference=v;}
}
