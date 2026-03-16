package com.abdulwali.subflowsaas_api.repository;

import com.abdulwali.subflowsaas_api.model.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {

}
