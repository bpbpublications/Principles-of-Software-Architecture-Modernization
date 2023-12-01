package com.github.diegopacheco.fixingmonoliths.contracts;

import java.math.BigDecimal;
import java.util.Calendar;

public class TaxProcessor {

    public BigDecimal computeSalesTax(Long salesID,BigDecimal value,String state){
        // use salesID to fetch specific sale from the Database...
        // filter by state and consider different rates per state...
        // let's say by default it's 30%
        return BigDecimal.valueOf(value.longValue() * 1.3);
    }

    public String getDayOfTheWeek(int year,int month,int day){
        Calendar cal = getCalendar();
        cal.set(year, month -1, day, 0, 0);
        return switch(cal.get(Calendar.DAY_OF_WEEK)){
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> throw new RuntimeException("IDK this day of the week!");
        };
    }

    private Calendar getCalendar(){
        Calendar cal = Calendar.getInstance();
        return cal;
    }

    private void internalMethodHardToTest(){
        System.out.println("I do nothing!");
    }

    private void anotherMethodHardToTest(){
        System.out.println("I do nothing too!");
    }

}