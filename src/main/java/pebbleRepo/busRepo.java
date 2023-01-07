package pebbleRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import pebbleModel.busBookingPOJO;

public interface busRepo extends JpaRepository< busBookingPOJO, Long> {
}
