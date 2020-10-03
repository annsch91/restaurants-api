package se.knowit.hackathon.restaurantsapi.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import se.knowit.hackathon.restaurantsapi.gatewayproxy.ApiGatewayProxyRequest;
import se.knowit.hackathon.restaurantsapi.gatewayproxy.ApiGatewayProxyResponse;
import se.knowit.hackathon.restaurantsapi.model.GoogleNearbyPlaces;
import se.knowit.hackathon.restaurantsapi.service.GooglePlacesService;
import se.knowit.hackathon.restaurantsapi.service.GooglePlacesServiceImpl;

import java.util.Map;

public class FindPlaceRequestHandler implements RequestHandler<ApiGatewayProxyRequest, ApiGatewayProxyResponse> {

    private final GooglePlacesService service = new GooglePlacesServiceImpl();

    @Override
    public ApiGatewayProxyResponse handleRequest(ApiGatewayProxyRequest request, Context context) {
        System.out.println("request: " + request);
        Map<String, String> parameters = request.getQueryStringParameters();
        String lat = parameters.getOrDefault("lat", "40.396410");
        String lon = parameters.getOrDefault("long", "49.883788");
        String radius = parameters.getOrDefault("radius", "3000");

        GoogleNearbyPlaces place = service.findPlace(lat, lon, radius);
        return new ApiGatewayProxyResponse(200, place);
    }

}
