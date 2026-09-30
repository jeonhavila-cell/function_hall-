package com.functionhall.booking.repository;
import com.functionhall.booking.model.Hall;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface HallRepository extends JpaRepository<Hall,Long>{
 List<Hall> findByLocationContainingIgnoreCase(String location);
}
