package se.knowit.hackathon.restaurantsapi.handler;

import org.junit.jupiter.api.Test;
import se.knowit.hackathon.restaurantsapi.gatewayproxy.ApiGatewayProxyResponse;

import static org.junit.jupiter.api.Assertions.*;

class RequestHandlerTest {

    private RequestHandler handler = new RequestHandler();

    @Test
    void handleGet() {
        ApiGatewayProxyResponse response = handler.handleGet(null, null);
        assertNotNull(response);
    }
}