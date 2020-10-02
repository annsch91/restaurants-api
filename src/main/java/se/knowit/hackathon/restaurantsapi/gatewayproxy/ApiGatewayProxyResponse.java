package se.knowit.hackathon.restaurantsapi.gatewayproxy;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.With;

import java.util.Map;

@Data
@With
@AllArgsConstructor
public class ApiGatewayProxyResponse {
    private int statusCode;
    private Map<String, String> headers;
    private String body;
    private boolean isBase64Encoded;

    public ApiGatewayProxyResponse() {
    }

    public static ApiGatewayProxyResponse withBody(Object obj) throws JsonProcessingException {
        String body = new ObjectMapper().writer().writeValueAsString(obj);
        return new ApiGatewayProxyResponse(200, Map.of(), body, false);
    }
}
