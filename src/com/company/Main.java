package com.company;

import java.awt.geom.Arc2D;
import java.nio.charset.StandardCharsets;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        //task2();
    }

    public static void task1(){
        /*Вариант 9
* Определить средний возраст футболистов и вывести
сведения о футболистах, возраст которых меньше 25
лет.*/
        int sum=0;
        int amountfootb;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Input amount footballers:");
            amountfootb = in.nextInt();
            in.nextLine();
        }while(amountfootb<=0);
        footb[] array1=new footb[amountfootb];
        for (int i = 0; i < amountfootb; i++) {
            array1[i]=new footb();
            System.out.println("Input Surname:");
            array1[i].surname=in.nextLine();
            System.out.println("Input Yearsold:");
            array1[i].SetYearsold(in.nextByte());
            System.out.println("Input numbergames:");
            array1[i].SetNumbergames(in.nextShort());
            System.out.println("Input numbergoals:");
            array1[i].SetNumbergoals(in.nextShort());
            in.nextLine();//делаем эту команду чтобы строка после ввода числа шорт не брало пробел после него
            sum+=array1[i].yearsold;//считает сумму всех возрастов футболистов
        }
        double avarage_years=(sum/amountfootb);//считает средний возраст футболистов
        System.out.println("Avarage age: " + avarage_years);
        for (int i = 0; i < amountfootb; i++) {
            if(array1[i].yearsold<25){
                System.out.println("Surname: " + array1[i].surname);
                System.out.println("Yearsold: " + array1[i].yearsold);
                System.out.println("Numbergames: " + array1[i].numbergames);
                System.out.println("Numbergoals: " + array1[i].numbergoals);
            }
        }
    }
    public static void task2(){

        /*Вариант 9
        Вывести данные об авиарейсе с максимальной скоростью.*/
        Scanner scanner= new Scanner(System.in);
        double max_speed=0;
        int amountflights;
        do {
            System.out.println("Input amount amountflights:");
            amountflights = scanner.nextInt();
            scanner.nextLine();
        }while(amountflights<=0);
        Time[] array2=new Time[amountflights];
        double[] arraySPEED=new double[amountflights];
        double[]arrayTIMES=new double[amountflights];
        for (int i = 0; i < amountflights; i++) {
            array2[i]=new Time();
            System.out.println("Input number flight: ");
            array2[i].number_flight= scanner.nextLine();

            System.out.println("Input time departure( hh:mm:ss ):");
            array2[i].time_departue= scanner.next();
            LocalTime timed = LocalTime.parse(array2[i].time_departue);//Переводим строку в переменную времени
            double seconds_DEPARTURE = timed.toSecondOfDay();
            System.out.println("Input time arrival( hh:mm:ss ):");
            array2[i].time_arrival = scanner.next();
            LocalTime timea = LocalTime.parse(array2[i].time_arrival);
            double secondsArrival = timea.toSecondOfDay();
            scanner.nextLine();
            System.out.println("Input direction: ");
            array2[i].direction= scanner.nextLine();

            System.out.println("Input mark plane: ");
            array2[i].mark_plane= scanner.nextLine();

            System.out.println("Input distance(km): ");
            array2[i].Setinputdistance(scanner.nextDouble());
            scanner.nextLine();
            if((secondsArrival-seconds_DEPARTURE)<0){
                arrayTIMES[i] = seconds_DEPARTURE-secondsArrival;
            }
            else{
                arrayTIMES[i]=secondsArrival - seconds_DEPARTURE;
            }

            arraySPEED[i]= (array2[i].distance/arrayTIMES[i]);

        }
        int number=0;
        for (int i = 0; i < amountflights-1; i++) {
            if(arraySPEED[i]>arraySPEED[i+1]){
                max_speed=arraySPEED[i];
                number = i;
            }
            else{
                max_speed=arraySPEED[i+1];
                number=i+1;
            }

        }
        System.out.println("flight: " + array2[number].number_flight);
        System.out.println("time departure : " + array2[number].time_departue);
        System.out.println("time arrival : " + array2[number].time_arrival);
        System.out.println("direction : " + array2[number].direction);
        System.out.println("mark_plane : " + array2[number].mark_plane);
        System.out.println("distance : " + array2[number].distance);
    }
}

