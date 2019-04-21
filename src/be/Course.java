/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be;

import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
/**
 *
 * @author root
 */
public class Course {
    
    public final int id;
    public final String name;
    public List<LocalDate> courseDays;
    public HashMap<Integer, List<Status>> presence;
    
    
    public Course(int id, String name, LocalDate start, LocalDate end, DayOfWeek[] weekDays){
        this.id = id;
        this.name = name;
        this.presence = new HashMap<>();
	    this.courseDays = new ArrayList();
	    genDates(start, end, weekDays);
    }

    public int getId(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }

    public HashMap<Integer, List<Status>> getPresence(){
    	return this.presence;
    }
   
    public List<LocalDate> getDays(){
    	return this.courseDays;
    }

    public void addPresence(int studentId, List<Status> status){
        this.presence.put(studentId, status);
    }

    private void genDates(LocalDate s, LocalDate e, DayOfWeek[] weekDays){

        LocalDate t = s;
        List<LocalDate> days = new ArrayList<LocalDate>();

        //Generate all days from start to end of semester
        while(t.isBefore(e) || t.isEqual(e)){
            days.add(t);
            t = t.plusDays(1L);
        }

        //Take out the days matching the course's school days and add to course day list
        for(LocalDate day : days){
            if(Arrays.asList(weekDays).contains(day.getDayOfWeek())){
                courseDays.add(day);
            }
        }
    }
    
}
