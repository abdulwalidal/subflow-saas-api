package com.abdulwali.subflowsaas_api.services;


import com.abdulwali.subflowsaas_api.model.Subscription;

import java.util.List;

public interface SubscriptionService {
    List<Subscription> getALlSubscriptions();
    String addSubscription (Subscription subscription);
}
