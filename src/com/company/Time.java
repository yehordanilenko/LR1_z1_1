package com.company;

import java.time.LocalTime;
import java.util.Scanner;

public class Time {
    Scanner scanner= new Scanner(System.in);
    String number_flight;
    String time_departue;
    String time_arrival;
    String direction;
    String mark_plane;
    double distance,MIN_DISTANCE=0;
    public void Setinputdistance(double distance){
        double correctdistance=distance;
        if(correctdistance<MIN_DISTANCE ){
            do{
                System.out.println("Try again. Input correct distance:");
                correctdistance=scanner.nextByte();
            }while(correctdistance<MIN_DISTANCE);
        }

        this.distance = correctdistance;
    }
    public double GetInputdistance(){return distance;}

}
