package com.abdulwali.subflowsaas_api.controller;

import com.abdulwali.subflowsaas_api.model.Subscription;
import com.abdulwali.subflowsaas_api.services.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Sub")
public class SubscriptionController {

    @Autowired
    SubscriptionService subscriptionService;

    @GetMapping
    List<Subscription> getAllSubscriptions() {
        return subscriptionService.getALlSubscriptions();
    }

    @PostMapping
    String addSubscription(@RequestBody Subscription subscription) {
        return subscriptionService.addSubscription(subscription);

    }


}
