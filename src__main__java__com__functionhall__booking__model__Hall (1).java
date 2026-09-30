package com.functionhall.booking.model;
import jakarta.persistence.*;
@Entity
public class Hall {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 private String name, location, eventType, facilities, imageUrl;
 private Integer capacity;
 private Double pricePerDay;
 public Hall(){}
 public Hall(String name,String location,Integer capacity,String eventType,String facilities,Double pricePerDay,String imageUrl){
  this.name=name;this.location=location;this.capacity=capacity;this.eventType=eventType;this.facilities=facilities;this.pricePerDay=pricePerDay;this.imageUrl=imageUrl;
 }
 public Long getId(){return id;} public String getName(){return name;} public void setName(String v){name=v;}
 public String getLocation(){return location;} public void setLocation(String v){location=v;}
 public Integer getCapacity(){return capacity;} public void setCapacity(Integer v){capacity=v;}
 public String getEventType(){return eventType;} public void setEventType(String v){eventType=v;}
 public String getFacilities(){return facilities;} public void setFacilities(String v){facilities=v;}
 public Double getPricePerDay(){return pricePerDay;} public void setPricePerDay(Double v){pricePerDay=v;}
 public String getImageUrl(){return imageUrl;} public void setImageUrl(String v){imageUrl=v;}
}
