package se.knowit.hackathon.restaurantsapi.dto;

import lombok.Data;
import se.knowit.hackathon.restaurantsapi.model.Result;

import java.util.List;

@Data
public class RandomizeRequest {
    private List<Result> results;
}
