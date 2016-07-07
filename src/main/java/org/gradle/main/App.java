package org.gradle.main;

import org.gradle.Person;

public class App {

    public static void main(String[] args) {
        
        Person person = new Person(); 
        System.out.println(person.getName());

    }

}
