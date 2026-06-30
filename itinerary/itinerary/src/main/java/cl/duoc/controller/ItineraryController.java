public class ItineraryController {
    package cl.duoc.itinerary.controller;

import cl.duoc.itinerary.model.Iterany;
import cl.duoc.itinerary.service.ItineraryService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/itinerary")
public class ItineraryController {
    private final ItineraryService service;

    public ItineraryController(ItineraryService service) {
        this.service = service;
    }

    @GetMapping
    public List<Iterany> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Iterany create(@RequestBody Iterany itinerary) {
        return service.save(itinerary);
    }
}

}
