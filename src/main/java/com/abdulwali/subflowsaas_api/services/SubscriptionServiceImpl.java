package com.abdulwali.subflowsaas_api.services;

import com.abdulwali.subflowsaas_api.model.Subscription;
import com.abdulwali.subflowsaas_api.repository.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    @Override
    public List<Subscription> getALlSubscriptions() {
        return subscriptionRepository.findAll();
    }

    @Override
    public String addSubscription(Subscription subscription) {
        subscriptionRepository.save(subscription);
        return "Your subscription is added";
    }
}
