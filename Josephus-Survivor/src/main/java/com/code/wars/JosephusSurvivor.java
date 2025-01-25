package com.code.wars;

import java.util.ArrayList;
import java.util.List;

public class JosephusSurvivor {

	public static <T>List<T> findOutSequence(final List<T> items, int k) {
		List<T> resultList = new ArrayList<>(items.size());
		int startPos = 0;
		while(items.stream().anyMatch(t -> t != null)) {
			int outPos = findOutPos(items, k, startPos, 0);
			resultList.add(items.get(outPos));
			items.set(outPos, null);
			startPos = outPos +1;
					}
		return resultList;
	}
	
	public static <T> int findOutPos(List<T> items, int k, int startPos, int posCounter) {
		for(int i = startPos; i < items.size(); i++) {
			if(items.get(i) != null) {
				posCounter += 1;
			}
			if(posCounter == k) {
				return i;
			}
		}
		return findOutPos(items, k, 0, posCounter);
	}
}
