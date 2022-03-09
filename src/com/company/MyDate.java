package com.company;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day,int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
    public void setToNextDay(){
        this.day++;
    }
}
