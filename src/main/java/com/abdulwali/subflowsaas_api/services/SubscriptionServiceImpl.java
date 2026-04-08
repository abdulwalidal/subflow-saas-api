package com.abdulwali.subflowsaas_api.services;

import com.abdulwali.subflowsaas_api.model.Subscription;
import com.abdulwali.subflowsaas_api.model.User;
import com.abdulwali.subflowsaas_api.payload.SubscriptionDTO;
import com.abdulwali.subflowsaas_api.payload.SubscriptionResponse;
import com.abdulwali.subflowsaas_api.payload.UserDTO;
import com.abdulwali.subflowsaas_api.repository.SubscriptionRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {

    @Autowired
    private SubscriptionRepository subscriptionRepository;
    @Autowired
    private ModelMapper modelMapper;



    @Override
    public SubscriptionDTO addSubscription(Subscription subscription) {
        Subscription savedSubscription =  subscriptionRepository.save(subscription);
        return modelMapper.map(savedSubscription, SubscriptionDTO.class);

    }

    @Override
    public SubscriptionResponse getAll() {
      List<Subscription> subscriptions = subscriptionRepository.findAll();
      List<SubscriptionDTO> subscriptionDTOS = subscriptions.stream() // [Sub1, Sub2, Sub3] → conveyor belt → Sub1 → Sub2 → Sub3
              // for each subscription coming down
              //→ convert it to a SubscriptionDTO using modelMapper
              .map(subscription -> modelMapper.map(subscription, SubscriptionDTO.class))
              .toList(); // After every item is transformed, collect them all back into a new list.
                         // [DTO1, // DTO2, DTO3] ← collected back into a list
      SubscriptionResponse subscriptionResponse = new SubscriptionResponse();
      subscriptionResponse.setContent(subscriptionDTOS);
      return subscriptionResponse;

    }

    @Override
    public SubscriptionDTO updateSubscription(Long Id, SubscriptionDTO subscriptionDTO) {
        //  Finds the existing user by ID; throws Exception if it doesn’t exist.
      Subscription subFromDB = subscriptionRepository.findById(Id)
                .orElseThrow(() -> new RuntimeException("Subscription does not exist"));

      Subscription subscription = modelMapper.map(subscriptionDTO, Subscription.class);
      subscription.setId(Id);
      subFromDB = subscriptionRepository.save(subscription);
      return modelMapper.map(subFromDB, SubscriptionDTO.class);


    }

    @Override
    public SubscriptionDTO deleteSubscription(Long Id) {
        //  Finds the existing user by ID; throws Exception if it doesn’t exist.
        Subscription subFromDB = subscriptionRepository.findById(Id)
                .orElseThrow(() -> new RuntimeException("Subscription does not exist"));

        subscriptionRepository.delete(subFromDB);
        return modelMapper.map(subFromDB, SubscriptionDTO.class);

    }

    @Override
    public SubscriptionDTO findSubscriptionById(Long Id) {
        //  Finds the existing user by ID; throws Exception if it doesn’t exist.
        Subscription subFromDB = subscriptionRepository.findById(Id)
                .orElseThrow(() -> new RuntimeException("Subscription does not exist"));

        return modelMapper.map(subFromDB, SubscriptionDTO.class);

    }
}
