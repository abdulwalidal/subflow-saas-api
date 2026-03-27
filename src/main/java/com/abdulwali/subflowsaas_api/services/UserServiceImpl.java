package com.abdulwali.subflowsaas_api.services;

import com.abdulwali.subflowsaas_api.model.User;
import com.abdulwali.subflowsaas_api.payload.UserDTO;
import com.abdulwali.subflowsaas_api.payload.UserResponse;
import com.abdulwali.subflowsaas_api.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.internal.bytebuddy.utility.nullability.UnknownNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements  UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;


    @Override
    public UserDTO addUser(User user) {
     User savedUser =  userRepository.save(user);
     return modelMapper.map(savedUser, UserDTO.class);
    }

    @Override
    public UserResponse getAll() {
        List<User> users = userRepository.findAll();
        List <UserDTO> userDTOS = users.stream()
                .map(user -> modelMapper.map(user, UserDTO.class))
                .toList();
        UserResponse userResponse = new UserResponse();
        userResponse.setContent(userDTOS);
        return userResponse;
    }


}
