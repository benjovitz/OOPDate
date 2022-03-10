package com.company;

public class Main {

    public static void main(String[] args) {
        MyDate date = new MyDate(28,2,2024);
        date.setToNextDay();
        System.out.println(date.toString());
    }
}
