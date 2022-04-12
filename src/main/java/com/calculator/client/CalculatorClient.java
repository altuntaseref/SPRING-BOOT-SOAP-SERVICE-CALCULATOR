package com.calculator.client;

import com.soap.client.gen.*;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class CalculatorClient extends WebServiceGatewaySupport {

    public AddResponse addResponse(Add addResult){
        AddResponse response = (AddResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx",addResult,
                new SoapActionCallback("http://tempuri.org/Add"));
        return response;
    }

    public DivideResponse divideResponse(Divide request){

        DivideResponse response = (DivideResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx",request
        , new SoapActionCallback("http://tempuri.org/Divide"));
        return response;

    }

    public MultiplyResponse multiplyResponse(Multiply request){
        MultiplyResponse response= (MultiplyResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx",request
                , new SoapActionCallback("http://tempuri.org/Multiply"));
        return response;
    }


    public SubtractResponse subtractResponse(Subtract request){
        SubtractResponse response = (SubtractResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx",request
                , new SoapActionCallback("http://tempuri.org/Subtract"));
        return response;
    }

}
