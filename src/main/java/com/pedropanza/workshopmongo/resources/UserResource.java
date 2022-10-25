package com.pedropanza.workshopmongo.resources;

import com.pedropanza.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        User maria = new User("1","maria silva", "maria@gmail.com");
        User alex = new User("2","alex sotan", "alex@gmail.com");
        User gabriel = new User("3","gabi gol", "gabi_matador@gmail.com");

        List<User> list = new ArrayList<>();

        list.addAll(Arrays.asList(maria, alex, gabriel));

        return ResponseEntity.ok().body(list);


    }

}
