package com.abdulwali.subflowsaas_api.services;


import com.abdulwali.subflowsaas_api.model.Subscription;
import com.abdulwali.subflowsaas_api.payload.SubscriptionDTO;
import com.abdulwali.subflowsaas_api.payload.SubscriptionResponse;

import java.util.List;

public interface SubscriptionService {


    SubscriptionDTO addSubscription(Subscription subscription);

    SubscriptionResponse getAll();

    SubscriptionDTO updateSubscription(Long Id, SubscriptionDTO subscriptionDTO);

    SubscriptionDTO deleteSubscription(Long Id);

    SubscriptionDTO findSubscriptionById(Long Id);
}
