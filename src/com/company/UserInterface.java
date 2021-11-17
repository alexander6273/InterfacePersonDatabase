package com.company;

import java.util.*;

public class UserInterface {

    private Scanner sc = new Scanner(System.in);
    private ArrayList<Person> studentDataBase = new ArrayList<>();

    public void start(){
        System.out.println("Hello and welcome to your student database");
        mainMenu();
    }

    public void mainMenu(){
        boolean isRunning = true;
        while (isRunning){
            System.out.println("""
                    Select your option:
                    1. List students
                    2. Add a student
                    3. Remove a student
                    0. Exit program""");
            int selection = sc.nextInt();
            sc.nextLine();
            switch (selection){
                case 0 :
                    System.out.println("Closing the program");
                    isRunning = false;
                    break;
                case 1:
                    listAllStudnets();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    System.out.println("remove a student");
                    int input = sc.nextInt();
                    Person person = findPerson(input);
                    removeStudent(person);
                    break;
            }
        }
    }

    public void listAllStudnets(){
        System.out.println("Student list:");
        Collections.sort(studentDataBase);
        System.out.println(studentDataBase);
    }

    public Person addStudent(){
        System.out.println("Enter students first name:");
        String firstName = sc.next();
        System.out.println("Enter students last name:");
        String lastName = sc.next();
        Person student = new Person(firstName, lastName);
        studentDataBase.add(student);
        return student;

    }

    public Person findPerson(int num){
        for (int i = 0; i < studentDataBase.size(); i++) {
            if (studentDataBase.indexOf(studentDataBase.get(i)) == num){
                return studentDataBase.get(i);
            }
        }
        return null;
    }

    public void removeStudent(Person person){
        studentDataBase.remove(person);
    }

    /*public void removeStudent(){
        System.out.println("Which student do you want to remove:");
        String firstname = sc.next();
        Person student = new Person(firstname);
        StudentDataBase.remove(student);
    }*/
}
