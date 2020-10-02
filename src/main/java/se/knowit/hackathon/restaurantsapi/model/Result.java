package se.knowit.hackathon.restaurantsapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private String name;
    private double rating;
    private String vicinity;
}
