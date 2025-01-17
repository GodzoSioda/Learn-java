package com.godzo;

import java.util.Arrays;

public class Flipper {

	public static int[] flipAr(int[] ar) {
		for(int finishPos = ar.length -1; finishPos > 0; finishPos--) {
			int maxValuePos = findMaxValuePos(ar, finishPos);
			if(maxValuePos == finishPos) {
				continue;
			} else if(maxValuePos == 0) {
				reverseArPart(ar, finishPos);
			} else {
				reverseArPart(ar, maxValuePos);
				reverseArPart(ar, finishPos);
			}
		}
		return ar;
	}
	
	public static int findMaxValuePos(int[] ar, int finishPos) {
		int maxValuePos = -1;
		int maxValue = -1;
		for(int i = 0; i <= finishPos; i++) {
			if(ar[i] >= maxValue) {
				maxValue = ar[i];
				maxValuePos = i;
			}
		}
		return maxValuePos;
	}
	
	public static void reverseArPart(int[] ar, int finishPos) {
		int[] tempAr = Arrays.copyOf(ar, finishPos +1);
		int countPos = 0;
		for(int i = tempAr.length -1; i >= 0; i--) {
			ar[countPos] = tempAr[i];
			countPos += 1;
		}
	}
}
