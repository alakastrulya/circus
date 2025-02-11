package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Circus {
    private String name;
    private String address;
    @Autowired
    private Cupboard cupboard;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cupboard getCupboard() {
        return cupboard;
    }

    public void setCupboard(Cupboard cupboard) {
        this.cupboard = cupboard;
    }
}
