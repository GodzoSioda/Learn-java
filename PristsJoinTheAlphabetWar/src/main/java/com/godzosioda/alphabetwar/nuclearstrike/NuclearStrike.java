package com.godzosioda.alphabetwar.nuclearstrike;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NuclearStrike {

    public static String handleBattlefield(String battlefield) {
        int amountStrikes = countStrikes(battlefield);
        return switch (amountStrikes) {
            case 0 -> noStrike(battlefield);
            case 1 -> oneStrike(battlefield);
            default -> {
                battlefield = middleStrikes(battlefield);
                battlefield = tripleStrike(battlefield);
                battlefield = surroundStrikes(battlefield);
                battlefield = beginningStrikes(battlefield);
                battlefield = endStrikes(battlefield);
                battlefield = oneStrike(battlefield);
                yield battlefield;
            }
        };
    }

    public static int countStrikes(String battlefield) {
        return (int) battlefield.chars().filter(i -> i == '#').count();
    }

    public static String noStrike(String battlefield) {
        return battlefield.replaceAll("[\\[\\]]", "");
    }

    public static String oneStrike(String battlefield) {
        Matcher matcher = Pattern.compile("(\\[\\w+\\])").matcher(battlefield);
        StringBuilder builder = new StringBuilder();
        while (matcher.find()) {
            builder.append(matcher.group());
        }
        return noStrike(builder.toString());
    }

    public static String middleStrikes(String battlefield) {
        Matcher matcher = Pattern.compile("(\\[\\w+\\])#?\\w*#+\\w*#+\\w*#?(\\[\\w+\\])").matcher(battlefield);
        while (matcher.find()) {
            battlefield = matcher.replaceAll("");
        }
        return battlefield;
    }

    public static String beginningStrikes(String battlefield) {
        Matcher matcher = Pattern.compile("^\\w*#+\\w*#+\\w*(\\[\\w+\\])").matcher(battlefield);
        while (matcher.find()) {
            battlefield = matcher.replaceAll("");
        }
        return battlefield;
    }

    public static String surroundStrikes(String battlefield) {
        Matcher matcher = Pattern.compile("#{1}\\w*(\\[\\w+\\])\\w*#{1}").matcher(battlefield);
        while (matcher.find()) {
            battlefield = matcher.replaceAll("");
        }
        return battlefield;
    }

    public static String tripleStrike(String battlefield) {
        Matcher matcher = Pattern.compile("#{1}\\w*(\\[\\w+\\])\\w*#{1}\\w*(\\[\\w+\\])\\w*#{1}").matcher(battlefield);
        while (matcher.find()) {
            battlefield = matcher.replaceAll("");
        }
        return battlefield;
    }

    public static String endStrikes(String battlefield) {
        Matcher matcher = Pattern.compile("(\\[\\w+\\])\\w*#+\\w*#+\\w*$").matcher(battlefield);
        while (matcher.find()) {
            battlefield = matcher.replaceAll("");
        }
        return battlefield;
    }
}
