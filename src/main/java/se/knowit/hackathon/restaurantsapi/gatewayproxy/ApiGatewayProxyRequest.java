package se.knowit.hackathon.restaurantsapi.gatewayproxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiGatewayProxyRequest {
    private String latitude;
    private String longitude;
    private String radius;
}
