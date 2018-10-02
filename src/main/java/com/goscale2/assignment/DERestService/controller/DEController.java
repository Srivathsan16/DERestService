package com.goscale2.assignment.DERestService.controller;

import com.goscale2.assignment.DERestService.model.DEModel;
import com.goscale2.assignment.DERestService.service.DEService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DEController {

    DEService deService= new DEService();

    @RequestMapping(value="/de", produces="application/json")
    public List<DEModel> viewDEdetails(){
       return deService.getDEdetails();
    }

}
