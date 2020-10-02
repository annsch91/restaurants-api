package se.knowit.hackathon.restaurantsapi.handler;

import com.amazonaws.services.lambda.runtime.Context;
import se.knowit.hackathon.restaurantsapi.gatewayproxy.ApiGatewayProxyRequest;
import se.knowit.hackathon.restaurantsapi.gatewayproxy.ApiGatewayProxyResponse;

public class RequestHandler {

    public ApiGatewayProxyResponse handleGet(ApiGatewayProxyRequest request, Context context) {
        return null;
    }
}
