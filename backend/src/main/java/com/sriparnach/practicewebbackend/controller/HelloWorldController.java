package com.sriparnach.practicewebbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HelloWorldController {

    @GetMapping("/getuser")
    public ArrayList<String> getuser(){
        ArrayList<String> userList = new ArrayList<>();
        userList.add("A");
        userList.add("B");
        return userList;
    }

}