package com.godzosioda.alphabetwar.nuclearstrike;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NuclearStrikeTest {

    public static final Map<String, String> testMap = Map.of(
            "abide[fgh]ijk", "abidefghijk",
            "ab#de[fgh]ijk", "fgh",
            "ab#de[fgh]ij#k", "",
            "##abde[fgh]ijk", "",
            "##abde[fgh]ijk[mn]op", "mn",
            "#ab#de[fgh]ijk[mn]op", "mn",
            "#abde[fgh]i#jk[mn]op", "mn",
            "[a]#[b]#[c]", "ac",
            "[a]#b#[c][d]", "d",
            "##a[a]b[c]#", "c"
    );

    @Test
    public void handleBattlefieldTest() {
        testMap.forEach((String key, String value) -> {
            assertEquals(value, NuclearStrike.handleBattlefield(key));
        });
    }

    @Test
    public void countStrikesTest() {
        Map<String, Integer> testStrikes = Map.of(
                "abide[fgh]ijk", 0,
                "ab#de[fgh]ijk", 1,
                "ab#de[fgh]#ij#k", 3,
                "##ab#de[fgh]#ijk#", 5,
                "##abde[fgh]ijk#[mn]#op", 4,
                "#ab#de#[fgh]#ij#k[mn]op#", 6,
                "#abde[fgh]i#jk[mn]op", 2,
                "[a]#b#[c][d]", 2,
                "[a][b][c]", 0,
                "##a[a]b[c]#", 3
        );
        testStrikes.forEach(((String key, Integer value) -> {
            assertEquals(value, NuclearStrike.countStrikes(key));
        }));
    }

    @Test
    public void noStrikeTest() {
        assertEquals("abidefghijk", NuclearStrike.noStrike("abide[fgh]ijk"));
        assertEquals("abc", NuclearStrike.noStrike("[a][b][c]"));
        assertEquals("ababagalamaga", NuclearStrike.noStrike("ababagalamaga"));
    }
}