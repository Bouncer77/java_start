package com.bouncer77.advanced_java.collection;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(Main.class.getName());

        Logger loggerB = Logger.getLogger(DemoLogger.class.getName());
        loggerB.setLevel(Level.ALL);

    }
}
