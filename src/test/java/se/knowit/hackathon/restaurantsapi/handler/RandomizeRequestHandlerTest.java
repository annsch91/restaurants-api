package se.knowit.hackathon.restaurantsapi.handler;

import org.junit.jupiter.api.Test;
import se.knowit.hackathon.restaurantsapi.dto.RandomizeRequest;
import se.knowit.hackathon.restaurantsapi.dto.RandomizeResponse;
import se.knowit.hackathon.restaurantsapi.model.Result;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class RandomizeRequestHandlerTest {

    private final RandomizeRequestHandler randomizeRequestHandler = new RandomizeRequestHandler();

    @Test
    void handleRequest() {
        RandomizeRequest randomizeRequest = new RandomizeRequest();
        var input = List.of(
                new Result("1", 5.0, "A"),
                new Result("2", 5.0, "B"),
                new Result("3", 5.0, "C")
        );
        randomizeRequest.setResults(input);
        RandomizeResponse randomizeResponse = randomizeRequestHandler.handleRequest(randomizeRequest, null);
        assertNotNull(randomizeResponse);
    }

}