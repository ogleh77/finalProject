package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Mohamed", null);

        System.out.println(person.getEmail().map(String::toLowerCase).orElseGet(() -> {
            return "Email not avilable..";
        }));


//        Optional<String> empty = Optional.ofNullable("Heee");
//
//        String world = empty.map(String::toUpperCase).orElseGet(() -> {
//            String threat = "What you want";
//            return threat;
//
//        });
//
//        System.out.println(world);
//
//        empty.ifPresentOrElse(em -> {
//            System.out.println(em);
//        }, () -> {
//            System.out.println("No value");
//        });
//        Stream<String> names=Stream.of("MOHAMED","AHMED","MUSSA");
//
//        System.out.println(names.count());

    }
}
