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
		
		Collections.sort(week, new Comparator<DaysOfWeek>() {
			public int compare(DaysOfWeek o1, DaysOfWeek o2) {
				int result = -(o1.partOfWeek.compareTo(o2.partOfWeek));
				if (result == 0) {
					return o1.weekday.compareTo(o2.weekday);
				}
				return result;
			}
		});
		for (DaysOfWeek integer: week) {
		System.out.println(integer);
		}
		/*TreeMap<DaysOfWeek, Integer> treeweek = new TreeMap<>();
		treeweek.put(fal, 17);
		treeweek.put(fri, 9);
		treeweek.put(sun, 4);
		treeweek.put(wed, 7);
		treeweek.put(sat, 9);
		treeweek.put(tue, 6);
		treeweek.put(mon, 5);
		treeweek.put(tal, 24);
		treeweek.put(thu, 8);*/
		
		
		
		
		
		
		

	}

}
