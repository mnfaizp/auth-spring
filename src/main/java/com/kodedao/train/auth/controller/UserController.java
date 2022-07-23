package com.kodedao.train.auth.controller;

import com.kodedao.train.auth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/v1/users/")
public class UserController {

    @Autowired
    public UserRepository userRepository;

    @GetMapping("")
    @ResponseBody
    public ResponseEntity<Map> helloWorld() {
        Map map = new HashMap();
        map.put("data", "Hello");
        return new ResponseEntity<Map>(map, HttpStatus.OK);
    }
}
