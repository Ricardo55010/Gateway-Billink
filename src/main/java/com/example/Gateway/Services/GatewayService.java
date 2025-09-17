package com.example.Gateway.Services;


import com.example.Gateway.DTOs.UserDTO;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GatewayService {
    public UserDTO getUser(int userId){
        return new UserDTO(1l,"ss",1,1);
    }
}
