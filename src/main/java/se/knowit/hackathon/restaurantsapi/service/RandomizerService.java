package se.knowit.hackathon.restaurantsapi.service;

import se.knowit.hackathon.restaurantsapi.model.Result;

import java.util.List;

public interface RandomizerService {
    Result getRandomResult(List<Result> results);
}
