package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("We have beans like : socks - cellophane bag - box - cupboard - circus");
        System.out.println("The information below proves the the beans are connected to each other and work correctly");
        System.out.println();

        Socks socks = (Socks) context.getBean(Socks.class);
        socks.setColor("blue");
        System.out.println("The socks color:");
        System.out.println(socks.getColor());

        CellophaneBag cellophaneBag = (CellophaneBag) context.getBean("cellophaneBag");
        cellophaneBag.setSize(2);
        cellophaneBag.setSocks(socks);
        System.out.println("The cellophane bag's size:");
        System.out.println(cellophaneBag.getSize());
        System.out.println("The cellophane bag's socks color:");
        System.out.println(cellophaneBag.getSocks().getColor());

        Box box = (Box) context.getBean(Box.class);
        box.setHeight(10);
        box.setWidth(10);
        box.setColor("red");
        box.setCelophaneBag(cellophaneBag);
        System.out.println("The box's color:");
        System.out.println(box.getColor());
        System.out.println("The box's cellophane bag size:");
        System.out.println(box.getCelophaneBag().getSize());

        Cupboard cupboard = (Cupboard) context.getBean(Cupboard.class);
        cupboard.setHeight(3);
        cupboard.setWidth(1);
        cupboard.setBox(box);
        System.out.println("The cupboard's height:");
        System.out.println(cupboard.getHeight());
        System.out.println("The cupboard's box color:");
        System.out.println(cupboard.getBox().getColor());

        Circus circus = (Circus) context.getBean(Circus.class);
        circus.setName("First Circus in the World");
        circus.setAddress("Karaganda");
        circus.setCupboard(cupboard);
        System.out.println("The circus's name:");
        System.out.println(circus.getName());
        System.out.println("The circus's cupboard height:");
        System.out.println(circus.getCupboard().getHeight());

        Kazakhstan Kazakhstan = context.getBean(Kazakhstan.class);
        Kazakhstan.setName("KZ");
        Kazakhstan.setCircus(circus);
        System.out.println(Kazakhstan.getCircus());



    }
}