/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication43;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author A308443
 */
public class JavaApplication43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // LocalDateTime dateTime = LocalDateTime.now();
       // System.out.println(String.format("%tF %tT", dateTime, dateTime));

       System.out.println(LocalDateTime.parse(
        "2022-11-24T20:09:02.000+00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSz")));
    //        2022-11-24T20:44:31.452+0000
    //   System.out.println(LocalDateTime.parse(
    //    "2022-11-24T20:09:02.000+00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

       
       
    //    LocalDateTime presentationDateTime = LocalDateTime.parse(
    //    "2022-11-24T20:44:31.452+0000", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
    //    System.out.println("presentationDateTime: " + presentationDateTime);
    }

}
