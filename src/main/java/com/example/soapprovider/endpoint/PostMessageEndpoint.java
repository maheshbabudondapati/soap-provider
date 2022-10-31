package com.example.soapprovider.endpoint;

import com.mahesh.spring.soap.api.inputrequest.Acknowledgement;
import com.mahesh.spring.soap.api.inputrequest.SoapRequest;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PostMessageEndpoint {

    private static final String NAMESPACE = "http://www.mahesh.com/spring/soap/api/inputRequest";

    @PayloadRoot(namespace = NAMESPACE, localPart = "SoapRequest")
    @ResponsePayload
    public Acknowledgement processRequest(@RequestPayload SoapRequest request) {
        Acknowledgement ac = new Acknowledgement();
        ac.setResultcode(1234);
        return ac;
    }
}