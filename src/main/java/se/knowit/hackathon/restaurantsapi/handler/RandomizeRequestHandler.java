package se.knowit.hackathon.restaurantsapi.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import se.knowit.hackathon.restaurantsapi.dto.RandomizeRequest;
import se.knowit.hackathon.restaurantsapi.dto.RandomizeResponse;
import se.knowit.hackathon.restaurantsapi.service.RandomizerServiceImpl;

public class RandomizeRequestHandler implements RequestHandler<RandomizeRequest, RandomizeResponse> {

    private RandomizerServiceImpl service = new RandomizerServiceImpl();

    @Override
    public RandomizeResponse handleRequest(RandomizeRequest randomizeRequest, Context context) {
        var results = randomizeRequest.getResults();
        var result = service.getRandomResult(results);
        return new RandomizeResponse(result);
    }
}
