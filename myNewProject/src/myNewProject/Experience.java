package myNewProject;

public class Experience {

	public static void main(String[] args) {

		String x = "░"; //9617
		String black = "█"; //9608
		System.out.println(x.codePointAt(0));
		System.out.println(black.codePointAt(0));
		char ch = (char) 9608;
		System.out.println(ch);
		/*String field = fillField();
		printField(field);
		floodField(field);*/
	}

	public static void floodField(String field) {
		if (!field.contains("X")) {
			return;
		} else {
			char[] source = field.toCharArray();
			char[] result = field.toCharArray();
			for (int i = 0; i < source.length; i++) {
				if (source[i] == 'O') {
					if (i - 1 >= 0 && source[i - 1] == 'X') {
						result[i - 1] = 'O';
					}
					if (i - 5 >= 0 && source[i - 5] == 'X') {
						result[i - 5] = 'O';
					}
					if (i + 1 < source.length && source[i + 1] == 'X') {
						result[i + 1] = 'O';
					}
					if (i + 5 < source.length && source[i + 5] == 'X') {
						result[i + 5] = 'O';
					}
				}
			}
			String nextStep = new String(result);
			printField(nextStep);
			floodField(nextStep);
		}
	}

	public static String fillField() {
		int water1 = -1;
		int water2 = 16;
		int start = 4;
		int step = 5;
		int arrayLength = 19;
		char[] array = new char[arrayLength];
		for (int i = 0; i < array.length; i++) {
			if (i == start) {
				array[i] = (char) 10;
				start += step;
			} else if (i == water1 || i == water2) {
				array[i] = (char) 79;
			} else {
				array[i] = (char) 88;
			}
		}
		return new String(array);
	}

	public static void printField(String field) {
		System.out.println(field);
		System.out.println();
	}
}
