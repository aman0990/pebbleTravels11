package pebbleController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pebbleRepo.busRepo;

@RestController
@RequestMapping
public class BusBookingController {
    @Autowired
    busRepo repo;

    @GetMapping("/")

}
