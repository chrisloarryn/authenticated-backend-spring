package com.chrisloarryn.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
@CrossOrigin("*")
public class AdminController {

        @RequestMapping
        public String helloAdminController() {
            return "Admin access granted!";
        }
}
