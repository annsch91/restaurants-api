package se.knowit.hackathon.restaurantsapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;
import se.knowit.hackathon.restaurantsapi.model.GoogleNearbyPlaces;

@Data
@With
@AllArgsConstructor
@NoArgsConstructor
public class FindPlaceResponse {
    private int statusCode;
    private GoogleNearbyPlaces body;
}
