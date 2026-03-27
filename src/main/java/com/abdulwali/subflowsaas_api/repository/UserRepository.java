package com.abdulwali.subflowsaas_api.repository;

import com.abdulwali.subflowsaas_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
