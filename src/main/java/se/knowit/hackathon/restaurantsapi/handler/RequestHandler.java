package se.knowit.hackathon.restaurantsapi.handler;

import com.amazonaws.services.lambda.runtime.Context;
import se.knowit.hackathon.restaurantsapi.gatewayproxy.ApiGatewayProxyRequest;
import se.knowit.hackathon.restaurantsapi.gatewayproxy.ApiGatewayProxyResponse;
import se.knowit.hackathon.restaurantsapi.model.GoogleNearbyPlaces;
import se.knowit.hackathon.restaurantsapi.service.GooglePlacesService;
import se.knowit.hackathon.restaurantsapi.service.GooglePlacesServiceImpl;

import java.util.Map;

public class RequestHandler {

    private final GooglePlacesService service = new GooglePlacesServiceImpl();

    public ApiGatewayProxyResponse handleGet(ApiGatewayProxyRequest request, Context context) {
        Map<String, String> parameters = request.getQueryStringParameters();
        String lat = parameters.getOrDefault("lat","40.396410");
        String lon = parameters.getOrDefault("long","49.883788");
        String radius = parameters.getOrDefault("radius", "3000");

        GoogleNearbyPlaces place = service.findPlace(lat, lon, radius);
        return new ApiGatewayProxyResponse(200, place);
    }
}
