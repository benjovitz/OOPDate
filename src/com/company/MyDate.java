package com.company;

public class MyDate {
    private int day;
    private int month;
    private int year;
    private int[] daysInMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};

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
        if(checkLeapYear(this.year)==true){
            daysInMonth[2]=29;
            }
        else if (this.day>daysInMonth[this.month]){
            this.day=1;
            }else {
                setToNextMonth();
            }
        }

    private void setToNextMonth(){
        this.month++;
        if(this.month>12){
            this.month=1;
            setToNextYear();
        }
    }
    private void setToNextYear(){
        this.year++;
    }
    private boolean checkLeapYear(int year) {
        assert year >= 1583; // not valid before this date.
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }
}
