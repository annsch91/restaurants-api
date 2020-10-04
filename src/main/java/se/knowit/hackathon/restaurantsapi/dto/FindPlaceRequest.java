package se.knowit.hackathon.restaurantsapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FindPlaceRequest {
    private String latitude;
    private String longitude;
    private String radius;
}
