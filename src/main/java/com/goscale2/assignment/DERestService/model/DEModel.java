package com.goscale2.assignment.DERestService.model;

import java.util.List;

public class DEModel {
    public int order_id;
    public List<Double> latlong;
    public String deliveryTime;

    public DEModel(int order_id, List<Double> latlong, String deliveryTime) {
        this.order_id = order_id;
        this.latlong = latlong;
        this.deliveryTime = deliveryTime;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public List<Double> getLatlong() {
        return latlong;
    }

    public void setLatlong(List<Double> latlong) {
        this.latlong = latlong;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
}
