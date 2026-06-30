public class ItineraryService {
package cl.duoc.itinerary.service;

import cl.duoc.itinerary.model.Iterany;
import cl.duoc.itinerary.repository.ItineraryRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ItineraryService {
    private final ItineraryRepository repository;

    public ItineraryService(ItineraryRepository repository) {
        this.repository = repository;
    }

    public List<Iterany> findAll() {
            return repository.findAll();
    }

    public Iterany save(Iterany itinerary) {
        return repository.save(itinerary);
    }
}
}
