package com.goscale2.assignment.DERestService.service;

import com.goscale2.assignment.DERestService.model.DEModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public class DEService {
    public List<DEModel> getDEdetails() {
        List<Double> latlong1 = new ArrayList<>();
        latlong1.add(12.987860);
        latlong1.add(77.73706);

        DEModel de1=new DEModel(123,latlong1,"23/08/2018");
        DEModel de2=new DEModel(345,latlong1,"24/07/2018");
        DEModel de3=new DEModel(365,latlong1,"24/07/2018");
        DEModel de4=new DEModel(4566,latlong1,"24/07/2018");
        DEModel de5=new DEModel(567,latlong1,"24/07/2018");

        List<DEModel> de= new ArrayList<>();
        de.add(de1);
        de.add(de2);
        de.add(de3);
        de.add(de4);
        de.add(de5);
        return de;
    }


}
