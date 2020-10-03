package se.knowit.hackathon.restaurantsapi.handler;

import org.junit.jupiter.api.Test;
import se.knowit.hackathon.restaurantsapi.gatewayproxy.ApiGatewayProxyRequest;
import se.knowit.hackathon.restaurantsapi.gatewayproxy.ApiGatewayProxyResponse;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class RequestHandlerTest {

    private final RequestHandler handler = new RequestHandler();

    @Test
    void handleGet() {
        ApiGatewayProxyRequest request = new ApiGatewayProxyRequest();
        request.setQueryStringParameters(Map.of());
        ApiGatewayProxyResponse response = handler.handleGet(request, null);
        assertNotNull(response);
        assertEquals(200, response.getStatusCode());
        assertTrue(response.getBody().getResults().size() > 1);
    }
}