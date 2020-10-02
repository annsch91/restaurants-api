package se.knowit.hackathon.restaurantsapi.service;

import org.junit.jupiter.api.Test;
import se.knowit.hackathon.restaurantsapi.model.GoogleNearbyPlaces;

import static org.junit.jupiter.api.Assertions.*;

class GooglePlacesServiceImplTest {
    private final GooglePlacesService service = new GooglePlacesServiceImpl();
    @Test
    void findPlace() {
        GoogleNearbyPlaces place = service.findPlace();
        assertNotNull(place);
    }
}