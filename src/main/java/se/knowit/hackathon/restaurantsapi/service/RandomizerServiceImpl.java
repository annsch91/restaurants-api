package se.knowit.hackathon.restaurantsapi.service;

import se.knowit.hackathon.restaurantsapi.model.Result;

import java.util.List;
import java.util.Random;

public class RandomizerServiceImpl implements RandomizerService {
    @Override
    public Result getRandomResult(List<Result> results) {
        Random random = new Random();
        int index = random.nextInt(results.size());
        return results.get(index);
    }
}
