package se.knowit.hackathon.restaurantsapi.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.fasterxml.jackson.core.JsonProcessingException;
import se.knowit.hackathon.restaurantsapi.gatewayproxy.ApiGatewayProxyRequest;
import se.knowit.hackathon.restaurantsapi.gatewayproxy.ApiGatewayProxyResponse;
import se.knowit.hackathon.restaurantsapi.model.GoogleNearbyPlaces;
import se.knowit.hackathon.restaurantsapi.service.GooglePlacesService;
import se.knowit.hackathon.restaurantsapi.service.GooglePlacesServiceImpl;

public class RequestHandler {

    private final GooglePlacesService service = new GooglePlacesServiceImpl();

    public ApiGatewayProxyResponse handleGet(ApiGatewayProxyRequest request, Context context) {
        GoogleNearbyPlaces place = service.findPlace();
        try {
            return ApiGatewayProxyResponse.withBody(place);
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException();
        }
    }
}
