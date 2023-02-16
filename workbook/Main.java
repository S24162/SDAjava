package pl.sdacademy.java.workbook;

import pl.sdacademy.java.workbook.car.Car;
import pl.sdacademy.java.workbook.car.CarApplication;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static java.lang.Math.*;
import static javax.print.attribute.Size2DSyntax.MM;

public class Main {

    //    main method
    public static void main(String[] args) {
        System.out.println("Start :" + "\n");

//        TypyDanych.main();
//        Loops.main();
//        ArraysTest.main();
//        EndTasks.main();
        LocalDateTime localTime= LocalDateTime.now();
        String formattedLocalTime = localTime.format(DateTimeFormatter.ofPattern("M:y:d"));
        System.out.println(formattedLocalTime); // 21:11:00.024

    }
}