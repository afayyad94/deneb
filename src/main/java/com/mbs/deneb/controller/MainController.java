package com.mbs.deneb.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/afayyad/{id}")
    public String getCategory(@PathVariable int id) {
        return  "This is the id : " + id;
    }

}
