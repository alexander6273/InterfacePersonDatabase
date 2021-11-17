package com.company;

public class Person implements Comparable {
    private String firstName;
    private String lastName;


    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /*public Person(String firstName, String null){
        super th
    }*/

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public int compareTo(Object other){
        Person secondPerson = (Person) other;
        String firstPerson = firstName;
        String secondName = secondPerson.firstName;
        if (firstPerson.compareTo(secondName) <= 0){
            return -1;
        } else {
            return 1;
        }
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }


}
