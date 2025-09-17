package com.example.Gateway.Controllers;


import com.example.Gateway.DTOs.UserDTO;
import com.example.Gateway.Services.GatewayService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class GatewayController {
    GatewayService gatewayService;
    public GatewayController(GatewayService userService){
        this.userService = userService;
    }
    @QueryMapping
    public UserDTO getUser(@Argument long id){
        UserDTO userDTO = gatewayService.getUser(id);
        return userDTO;
    }
}
