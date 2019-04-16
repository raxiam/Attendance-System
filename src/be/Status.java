/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be;

import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;


/**
 *
 * @author root
 */
public class Status{

    private final LocalDate date;
    private final String day;
    private final LocalTime time;
    private final Boolean wasPresent;


    public Status(LocalDate date, LocalTime time, Boolean wasPresent){
        this.date = date;
        this.day = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        this.time = time;
        this.wasPresent = wasPresent;
    }


    public LocalDate getDate(){
        return date;
    }

    public String getDay(){
        return day;
    }

    public LocalTime getTime(){
        return time;
    }

    public Boolean getPresence(){
        return wasPresent;
    }

}
