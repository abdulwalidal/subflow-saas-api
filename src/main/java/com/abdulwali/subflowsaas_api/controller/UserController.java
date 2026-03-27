package com.abdulwali.subflowsaas_api.controller;

import com.abdulwali.subflowsaas_api.model.User;
import com.abdulwali.subflowsaas_api.payload.UserDTO;
import com.abdulwali.subflowsaas_api.payload.UserResponse;
import com.abdulwali.subflowsaas_api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public ResponseEntity<UserDTO> addUser(@RequestBody User user) {
        UserDTO userDTO = userService.addUser(user);
        return new ResponseEntity<>(userDTO, HttpStatus.CREATED);
    }

    @GetMapping("admin/all")
    public ResponseEntity<UserResponse> getAll() {
        UserResponse userResponse = userService.getAll();
        return new ResponseEntity<>(userResponse, HttpStatus.OK);

    }



}
