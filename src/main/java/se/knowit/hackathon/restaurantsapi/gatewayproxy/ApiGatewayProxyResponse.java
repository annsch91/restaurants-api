package se.knowit.hackathon.restaurantsapi.gatewayproxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;
import se.knowit.hackathon.restaurantsapi.model.GoogleNearbyPlaces;

@Data
@With
@AllArgsConstructor
@NoArgsConstructor
public class ApiGatewayProxyResponse {
    private int statusCode;
    private GoogleNearbyPlaces body;
}
