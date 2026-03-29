package com.abdulwali.subflowsaas_api.services;

import com.abdulwali.subflowsaas_api.model.User;
import com.abdulwali.subflowsaas_api.payload.UserDTO;
import com.abdulwali.subflowsaas_api.payload.UserResponse;

public interface UserService {

    UserDTO addUser(User user);

    UserResponse getAll();

    UserDTO findUserById(Long userId);

    UserDTO updateUser(UserDTO userDTO, Long userId);

    UserDTO deleteUser(Long userId);
}
