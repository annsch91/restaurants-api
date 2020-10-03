package se.knowit.hackathon.restaurantsapi.handler;

import org.junit.jupiter.api.Test;
import se.knowit.hackathon.restaurantsapi.gatewayproxy.ApiGatewayProxyRequest;
import se.knowit.hackathon.restaurantsapi.gatewayproxy.ApiGatewayProxyResponse;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FindPlaceRequestHandlerTest {

    private final FindPlaceRequestHandler handler = new FindPlaceRequestHandler();

    @Test
    void handleGet() {
        ApiGatewayProxyRequest request = new ApiGatewayProxyRequest();
        request.setQueryStringParameters(Map.of());
        ApiGatewayProxyResponse response = handler.handleRequest(request, null);
        assertNotNull(response);
        assertEquals(200, response.getStatusCode());
        assertTrue(response.getBody().getResults().size() > 1);
    }
}