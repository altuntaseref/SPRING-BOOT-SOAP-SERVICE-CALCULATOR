package com.calculator.endpoint;

import com.calculator.client.CalculatorClient;
import com.soap.client.gen.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CalculatorEndpoint {

    private static final String NAMESPACE_URI="http://tempuri.org/";

    private CalculatorClient client;

    @Autowired
    public CalculatorEndpoint(CalculatorClient client) {
        this.client = client;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "Add")
    @ResponsePayload
    public AddResponse response(@RequestPayload Add requestType){

        AddResponse responseType = new AddResponse();
        responseType = client.addResponse(requestType);
        return responseType;

    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "Divide")
    @ResponsePayload
    public DivideResponse response (@RequestPayload Divide requestType){
        DivideResponse responseType = new DivideResponse();
        responseType = client.divideResponse(requestType);
        return responseType;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "Multiply")
    @ResponsePayload
    public MultiplyResponse response (@RequestPayload Multiply requestType){
        MultiplyResponse responseType = new MultiplyResponse();
        responseType=client.multiplyResponse(requestType);
        return responseType;
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "Subtract")
    @ResponsePayload
    public  SubtractResponse response (@RequestPayload Subtract requestType){
        SubtractResponse response = new SubtractResponse();
        response = client.subtractResponse(requestType);
        return  response;

    }

}
