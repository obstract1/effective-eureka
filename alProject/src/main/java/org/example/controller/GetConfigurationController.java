package org.example.controller;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ResourceBundle;


@RestController
public class GetConfigurationController {

//    @Autowired
//    ProprttiesConfiguration proprttiesConfiguration;
//    @Value("${app.version}")
//    private String appVersion;


    @GetMapping("/proprttiesConfiguration")
    public String proprttiesConfiguration() {
        ResourceBundle res = ResourceBundle.getBundle("application");
        String username=res.getString("username");
        System.out.println(username);
        return "appVersion";
    }
}
