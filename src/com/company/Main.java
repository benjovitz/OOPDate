package com.company;

public class Main {

    public static void main(String[] args) {
        MyDate date = new MyDate(7,2,2022);
        System.out.println(date.toString());
        date.setToNextDay();
        System.out.println(date.toString());
    }
}
