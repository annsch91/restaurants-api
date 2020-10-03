package se.knowit.hackathon.restaurantsapi.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import se.knowit.hackathon.restaurantsapi.model.GoogleNearbyPlaces;

import java.net.URISyntaxException;

public class GooglePlacesServiceImpl implements GooglePlacesService {

    @Override
    public GoogleNearbyPlaces findPlace(String lat, String lon, String radius) {
        CloseableHttpClient httpClient = HttpClients.createDefault();

        try {
            String url = createUrl(lat, lon, radius);
            CloseableHttpResponse response = httpClient.execute(new HttpGet(url));
            HttpEntity entity = response.getEntity();
            String jsonString = EntityUtils.toString(entity);
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            return mapper.readValue(jsonString, GoogleNearbyPlaces.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalStateException("Feet med fel");
        }
    }

    private String createUrl(String lat, String lon, String radius) throws URISyntaxException {
        URIBuilder builder = new URIBuilder();
        builder.setScheme("https");
        builder.setHost("maps.googleapis.com");
        builder.setPath("maps/api/place/nearbysearch/json");
        builder.addParameter("keyword", "restaurants");
        builder.addParameter("type", "establishment");
        builder.addParameter("key", "AIzaSyBop6MXi5r3LIjHH5Goo5a-Rn4VOF7ElRI");
        builder.addParameter("location", lat + "," + lon);
        builder.addParameter("radius", radius);
        builder.addParameter("opennow", "true");
        return builder.build().toString();
    }
}
