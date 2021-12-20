package com.company;
import java.io.*;
import java.lang.Math;
import java.util.*;

public class Main {
    public static void main(String args[]){
        int n = 0;
        List <Double> arr = new ArrayList<Double>();
        Scanner scan = new Scanner(System.in);
        String input = "";
        System.out.println("Введите элементы массива:");
        while(!input.equals("quit")) {
            input = scan.next();
            if(!input.equals("quit")) {
                arr.add(Double.parseDouble(input));
                n++;
            }
        }
        System.out.print("Исходный массив" + ": ");
        for(int i = 0; i < arr.size(); i++)
            System.out.print(arr.get(i) + " ");
        double prevNum = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) <= prevNum) {
                arr.remove(i);
                i--;
            }
            else
                prevNum = arr.get(i);
        }
        System.out.print("\nРезультат сглаживания:");
        for(int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}