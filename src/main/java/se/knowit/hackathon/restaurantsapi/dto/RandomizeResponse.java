package se.knowit.hackathon.restaurantsapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import se.knowit.hackathon.restaurantsapi.model.Result;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RandomizeResponse {
    private Result result;
}
