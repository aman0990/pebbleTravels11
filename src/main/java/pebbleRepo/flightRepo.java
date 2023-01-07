package pebbleRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import pebbleModel.flightBookingPOJO;

public interface flightRepo extends JpaRepository < flightBookingPOJO, Long> {
}
