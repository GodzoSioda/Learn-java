package com.godzosioda.alphabetwar.priests;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PriestsTest {

    public static final Map<String, String> testMap = Map.of(
            "aeu", "Let's fight again!",
            "z", "Right side wins!",
            "ts", "Left side wins!",
            "jz", "Right side wins!",
            "st", "Left side wins!",
            "ast", "Left side wins!",
            "tzj", "Right side wins!",
            "zjttetww", "Left side wins!",
            "zbmzjqamwa", "Right side wins!",
            "jbmtteaqjejawmwdattjtbjcdttczwbjbj", "Let's fight again!"
    );


    @org.junit.jupiter.api.Test
    void whoWins() {
        testMap.forEach((key, value) -> {
            assertEquals(value, Priests.whoWins(key), "Test fails on key: " + key);
        });
    }
}