package se.knowit.hackathon.restaurantsapi.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import se.knowit.hackathon.restaurantsapi.dto.FindPlaceRequest;
import se.knowit.hackathon.restaurantsapi.dto.FindPlaceResponse;
import se.knowit.hackathon.restaurantsapi.model.GoogleNearbyPlaces;
import se.knowit.hackathon.restaurantsapi.service.GooglePlacesService;
import se.knowit.hackathon.restaurantsapi.service.GooglePlacesServiceImpl;

public class FindPlaceRequestHandler implements RequestHandler<FindPlaceRequest, FindPlaceResponse> {

    private final GooglePlacesService service = new GooglePlacesServiceImpl();

    @Override
    public FindPlaceResponse handleRequest(FindPlaceRequest request, Context context) {
        System.out.println("request: " + request);
        System.out.println("context: " + context);
        String lat = request.getLatitude().isEmpty() ? "40.396410" : request.getLatitude();
        String lon = request.getLongitude().isEmpty() ? "49.883788" : request.getLongitude();
        String radius = request.getRadius().isEmpty() ? "3000" : request.getRadius();

        GoogleNearbyPlaces place = service.findPlace(lat, lon, radius);
        return new FindPlaceResponse(200, place);
    }

}
