package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Kazakhstan {
    private String name;
    @Autowired
    private Circus circus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Circus getCircus() {
        return circus;
    }

    public void setCircus(Circus circus) {
        this.circus = circus;
    }
}
