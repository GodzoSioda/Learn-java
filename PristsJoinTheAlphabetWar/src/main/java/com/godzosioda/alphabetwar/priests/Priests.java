package com.godzosioda.alphabetwar.priests;

import java.util.Arrays;
import java.util.Map;

public class Priests {

    public static final Map<Character, Integer> valueMap;
    public static final Map<Character, Character> rightReplacementMap;
    public static final Map<Character, Character> lefttReplacementMap;
    public static final char leftPriest = 't';
    public static final char rightPriest = 'j';
    public static final String leftWin = "Left side wins!";
    public static final String rightWin = "Right side wins!";
    public static final String draw = "Let's fight again!";

    static {
        valueMap = Map.of(
                'w', -4,
                'p', -3,
                'b', -2,
                's', -1,
                'm', 4,
                'q', 3,
                'd', 2,
                'z', 1
        );
        rightReplacementMap = Map.of(
                'w', 'm',
                'p', 'q',
                'b', 'd',
                's', 'z'
        );
        lefttReplacementMap = Map.of(
                'm', 'w',
                'q', 'p',
                'd', 'b',
                'z', 's'
        );
    }

    public static void main(String[] args) {
        String problem = "jbmtteaqjejawmwdattjtbjcdttczwbjbj";
        System.out.println("    " + whoWins(problem));
    }

    public static String whoWins(String fight) {
        char[] chAr = fight.toCharArray();
        searchPriests(chAr);
        int sum = 0;
        for (char c : chAr) {
            if (valueMap.containsKey(c)) {
                sum += valueMap.get(c);
            }
        }
        return awardWinner(sum);
    }

    public static void searchPriests(char[] chAr) {
        for (int index = 0; index < chAr.length; index++) {
            if (chAr[index] == leftPriest || chAr[index] == rightPriest) {
                processAdjacent(chAr, index);
            }
        }
    }

    public static void processAdjacent(char[] chAr, int index) {
        boolean isLeftPriest = chAr[index] == leftPriest;
        char aim = chAr[index];
        if (index == 0 && chAr.length > 1) {
            processChar(chAr, index + 1, isLeftPriest);
        } else if (index == chAr.length - 1) {
            processChar(chAr, index - 1, isLeftPriest);
        } else {
            processChar(chAr, index - 1, isLeftPriest);
            processChar(chAr, index + 1, isLeftPriest);
        }
    }

    public static void processChar(char[] chAr, int index, boolean isLeftPriest) {
        char key = chAr[index];
        if (isLeftPriest && lefttReplacementMap.containsKey(key)) {
            chAr[index] = lefttReplacementMap.get(key);
        } else if (!isLeftPriest && rightReplacementMap.containsKey(key)) {
            chAr[index] = rightReplacementMap.get(key);
        } else {
            return;
        }
    }

    private static String awardWinner(int sum) {
        String winner;
        if (sum < 0) {
            winner = leftWin;
        } else if (sum > 0) {
            winner = rightWin;
        } else {
            winner = draw;
        }
        return winner;
    }

}
