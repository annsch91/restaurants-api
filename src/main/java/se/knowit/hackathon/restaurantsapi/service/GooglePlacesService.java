package se.knowit.hackathon.restaurantsapi.service;

import se.knowit.hackathon.restaurantsapi.model.GoogleNearbyPlaces;

public interface GooglePlacesService {

    GoogleNearbyPlaces findPlace(String lat, String lon, String radius);

}
