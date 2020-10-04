package se.knowit.hackathon.restaurantsapi.service;

import org.junit.jupiter.api.Test;
import se.knowit.hackathon.restaurantsapi.model.Result;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RandomizerServiceImplTest {

    @Test
    void getRandomResult() {
        // given
        RandomizerService service = new RandomizerServiceImpl();
        var input = List.of(
                new Result("1", 5.0, "A"),
                new Result("2", 5.0, "B"),
                new Result("3", 5.0, "C")
        );
        // when
        var result = service.getRandomResult(input);
        // then
        assertTrue(input.contains(result));
    }
}