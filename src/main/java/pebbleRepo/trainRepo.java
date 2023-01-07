package pebbleRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import pebbleModel.trainBookingPOJO;

public interface trainRepo extends JpaRepository < trainBookingPOJO, Long> {
}