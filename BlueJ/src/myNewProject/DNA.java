package myNewProject;

public class DNA {

	public static void main(String[] args) {
		
		
		String str = "xATGTGAzyyTAGyTAAzz";
		//System.out.println();
		//System.out.println();
		System.out.println(findGene(str));
	}
	
	public static String findGene(String dna) {
		String[] genes = new String[3];
		genes[0] = findSimpleGene(dna, "ATG", "TAA");
		genes[1] = findSimpleGene(dna, "ATG", "TAG");
		genes[2] = findSimpleGene(dna, "ATG", "TGA");
		int minLength = dna.length();
		int endIndex = 0;
		for (int i = 0; i < genes.length; i++) {
			if (genes[i].length() > 0 && genes[i].length() < minLength) {
				minLength = genes[i].length();
				endIndex = i;
			}
		}
		return genes[endIndex];
	}

	public static String findSimpleGene(String dna) {
		String result = "";
		int startIndex = dna.indexOf("ATG");
		int finishIndex = dna.indexOf("TAA", startIndex + 3);
		if (startIndex != -1 && finishIndex != -1) {
			String temp = dna.substring(startIndex, finishIndex + 3);
			if (temp.length() % 3 == 0) {
				result = temp;
			}
		}
		return result;
	}

	public static String findSimpleGene(String dna, String startCodon, String stopCodon) {
		String result = "";
		int startIndex = dna.indexOf(startCodon);
		int finishIndex = dna.indexOf(stopCodon, startIndex + 3);
		if (startIndex != -1 && finishIndex != -1) {
			String temp = dna.substring(startIndex, finishIndex + 3);
			if (temp.length() % 3 == 0) {
				result = temp;
			}
		}
		return result;
	}

}
