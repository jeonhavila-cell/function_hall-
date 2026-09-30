package com.functionhall.booking.config;
import com.functionhall.booking.model.Hall;
import com.functionhall.booking.repository.HallRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class DataLoader {
 @Bean CommandLineRunner load(HallRepository r){return args->{
  if(r.count()==0){
   r.save(new Hall("Royal Grand Palace","Tirupati",800,"Wedding","AC, Parking, Stage, Catering, Rooms",45000.0,""));
   r.save(new Hall("Green Leaf Convention","Nellore",500,"Birthday","AC, Parking, Decoration, Sound",28000.0,""));
   r.save(new Hall("Sunrise Banquet","Chittoor",300,"Corporate","Projector, Wi-Fi, AC, Parking",22000.0,""));
  }
 };}
}
