package com.company;

public class Application {

    public void start(){
        UserInterface ui = new UserInterface();
        ui.start();
    }

    public static void main(String[] args) {
	Application app = new Application();
	app.start();
    }
}
