package se.knowit.hackathon.restaurantsapi.service;

import org.junit.jupiter.api.Test;
import se.knowit.hackathon.restaurantsapi.model.GoogleNearbyPlaces;

import static org.junit.jupiter.api.Assertions.*;

class GooglePlacesServiceImplTest {

    private final GooglePlacesService service = new GooglePlacesServiceImpl();

    @Test
    void findPlace() {
        GoogleNearbyPlaces place = service.findPlace("40.396410", "49.883788", "3000");
        System.out.println("Place: " + place);
        assertNotNull(place);
    }
}