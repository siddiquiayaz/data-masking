package com.simon_code.pii_data_masking.service;

import com.simon_code.pii_data_masking.dto.AccountDetails;
import com.simon_code.pii_data_masking.dto.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
public class UserService {
    public List<User> getAllUser(){
        User user = new User( 12,"Siddiqui","97519jkjfa","9511100809",20,"khanayaz" ,
               List.of(new AccountDetails("9090909090","Ayaz khan" ,"saving"))
        );
        User user1 = new User( 1,"khan","9751941f234","9817431342",21,"mushahid" ,
                List.of(new AccountDetails("87887878787","Mushahid khan" ,"current")));

        return Stream.of(user,user1).toList();
    }

    public User getUser(int id){

        return getAllUser().stream().filter(finduser -> finduser.getId()==id).findFirst().orElseThrow(() -> new RuntimeException("user not found"));


    }
}
