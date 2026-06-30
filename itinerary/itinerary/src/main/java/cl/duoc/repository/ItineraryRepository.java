public class ItineraryRepository {
package cl.duoc.itinerary.repository;

import cl.duoc.itinerary.model.Iterany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItineraryRepository extends JpaRepository<Iterany, Long> {
}
}
