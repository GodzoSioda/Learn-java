package myNewProject;

import java.util.*;

public class LearnHashMap {

	public static void main(String[] args) {
		
		DaysOfWeek sun = new DaysOfWeek("Sunday", "weekend", 4);
		DaysOfWeek mon = new DaysOfWeek("Monday", "workday", 5);
		DaysOfWeek tue = new DaysOfWeek("Tuesday", "workday", 6);
		DaysOfWeek wed = new DaysOfWeek("Wednesday", "workday", 7);
		DaysOfWeek thu = new DaysOfWeek("Thursday", "workday", 8);
		DaysOfWeek fri = new DaysOfWeek("Friday", "workday", 9);
		DaysOfWeek sat = new DaysOfWeek("Saturday", "weekend", 10);
		
		ArrayList<DaysOfWeek> week = new ArrayList<>();
		week.add(sun);
		week.add(mon);
		week.add(tue);
		week.add(wed);
		week.add(thu);
		week.add(fri);
		week.add(sat);
		DaysOfWeek fal = new DaysOfWeek("Saturday", "weekend", 17);
		week.add(fal);
		DaysOfWeek tal = new DaysOfWeek("Saturday", "weekend", 24);
		week.add(tal);
		
		//Collections.sort(week, (o1, o2)->o1.partOfWeek.compareTo(o2.partOfWeek));
		for (DaysOfWeek integer: week) {
		System.out.println(integer);
		}
		
		
	}

}
