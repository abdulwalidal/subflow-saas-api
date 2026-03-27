package com.abdulwali.subflowsaas_api.controller;

import com.abdulwali.subflowsaas_api.model.Subscription;
import com.abdulwali.subflowsaas_api.payload.SubscriptionDTO;
import com.abdulwali.subflowsaas_api.payload.SubscriptionResponse;
import com.abdulwali.subflowsaas_api.services.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Sub")
public class SubscriptionController {

    @Autowired
    private SubscriptionService subscriptionService;

    @PostMapping("sub/add")
    public ResponseEntity<SubscriptionDTO> addSubscription(@RequestBody Subscription subscription) {
        SubscriptionDTO subscriptionDTO = subscriptionService.addSubscription(subscription);
        return new ResponseEntity<>(subscriptionDTO, HttpStatus.CREATED);
    }

    @GetMapping("sub/all")
    public ResponseEntity<SubscriptionResponse> getALlSubscription() {
        SubscriptionResponse subscriptionResponse = subscriptionService.getAll();
        return new ResponseEntity<>(subscriptionResponse, HttpStatus.OK);
    }



}
