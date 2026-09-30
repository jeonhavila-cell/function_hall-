package com.functionhall.booking.controller;
import com.functionhall.booking.model.Hall;
import com.functionhall.booking.repository.HallRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController @RequestMapping("/api/halls")
@CrossOrigin
public class HallController {
 private final HallRepository repo;
 public HallController(HallRepository repo){this.repo=repo;}
 @GetMapping public List<Hall> all(){return repo.findAll();}
 @GetMapping("/search") public List<Hall> search(@RequestParam String location){return repo.findByLocationContainingIgnoreCase(location);}
 @PostMapping public Hall add(@RequestBody Hall hall){return repo.save(hall);}
 @DeleteMapping("/{id}") public void delete(@PathVariable Long id){repo.deleteById(id);}
}
