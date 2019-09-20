package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        ServiceWindow window1 = new ServiceWindow();
        ServiceWindow window2 = new ServiceWindow();
        ServiceWindow window3 = new ServiceWindow();

        int next_client_hour, next_client_min;
        FileReader file = new FileReader("time.txt");
        Scanner sc = new Scanner(file);
        int n_client = sc.nextInt();

        for (int i = 0; i < n_client; ++i) {
            next_client_hour = sc.nextInt();
            next_client_min = sc.nextInt();

            if (window1.hasFree(next_client_hour, next_client_min)) {
                window1.setNewStartTime(next_client_hour, next_client_min);
                System.out.format("%d %d\n", window1.getEndHour(), window1.getEndMin());
            } else if (window2.hasFree(next_client_hour, next_client_min)) {
                window2.setNewStartTime(next_client_hour, next_client_min);
                System.out.format("%d %d\n", window2.getEndHour(), window2.getEndMin());
            } else if (window2.hasFree(next_client_hour, next_client_min)) {
                window3.setNewStartTime(next_client_hour, next_client_min);
                System.out.format("%d %d\n", window3.getEndHour(), window3.getEndMin());
            }
        }

        file.close();
    }
}

class ServiceWindow {
    private int start_hour, start_min;
    private static final int service_time_min = 30;

    private int end_hour, end_min;

    ServiceWindow() {
        this.start_hour = 23;
        this.start_min = 59;
    }

    ServiceWindow(int start_hour, int start_min) {
        this.start_hour = start_hour;
        this.start_min = start_min;
        calculateEndTime();
    }

    void setNewStartTime(int new_start_hour, int new_start_min) {
        start_hour = new_start_hour;
        start_min = new_start_min;
        this.calculateEndTime();
    }

    private void calculateEndTime() {
        int end_time = start_hour * 60 + start_min + service_time_min;
        end_hour = end_time / 60;
        end_min = end_time % 60;
    }

    boolean hasFree(int cur_hour, int cur_min) {
        int cur_time = cur_hour * 60 + cur_min;
        int end_time = end_hour * 60 + end_min;
        if (end_time > cur_time) {
            return false;
        } else
            return true;

    }

    int getEndHour() {
        return end_hour;
    }

    int getEndMin() {
        return end_min;
    }

}
