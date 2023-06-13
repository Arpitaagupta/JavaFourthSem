package Assignment1;
import java.util.*;

class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean isValidMonth() {
        return (month >= 1 && month <= 12);
    }

    public boolean isValidDay() {
        if (month == 2) {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                return (day >= 1 && day <= 29);
            } else {
                return (day >= 1 && day <= 28);
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return (day >= 1 && day <= 30);
        } else {
            return (day >= 1 && day <= 31);
        }
    }

    public void nextDay() {
        day++;
        if (!isValidDay()) {
            day = 1;
            month++;
            if (!isValidMonth()) {
                month = 1;
                year++;
            }
        }
    }

    public String toString() {
        return day + "/" + month + "/" + year;
    }
}

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(5, 3, 2023);
        System.out.println("Current date: " + date);
        if (date.isValidMonth()) {
            System.out.println("Valid month");
        } else {
            System.out.println("Invalid month");
        }
        if (date.isValidDay()) {
            System.out.println("Valid day for month");
        } else {
            System.out.println("Invalid day for month");
        }
        date.nextDay();
        System.out.println("Next day: " + date);
    }
}