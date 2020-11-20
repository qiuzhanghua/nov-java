package com.example.talent.nov;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ProblemTests {

    @DisplayName("0+0=0")
    @Test
    public void test_solvable() {
        Problem problem = new Problem();
        assertTrue(problem.solvable(List.of("A", "A"), "A"));
    }

    @DisplayName("X+0=X")
    @Test
    public void test_solvable_02() {
        Problem problem = new Problem();
        assertTrue(problem.solvable(List.of("A", "B"), "A"));
    }

    @DisplayName("0+0=00")
    @Test
    public void test_solvable_03() {
        Problem problem = new Problem();
        assertFalse(problem.solvable(List.of("A", "A"), "AA"));
    }

    @DisplayName("XXX+00=XXX")
    @Test
    public void test_solvable_04() {
        Problem problem = new Problem();
        assertFalse(problem.solvable(List.of("AAA", "BB"), "BB"));
    }

    @DisplayName("SIX + SEVEN + SEVEN = TWENTY")
    @Test
    public void test_solvable_05() {
        Problem problem = new Problem();
        assertTrue(problem.solvable(List.of("SIX", "SEVEN", "SEVEN"), "TWENTY"));

    }

    @DisplayName("I + THINK + IT + BE + THINE = INDEED")
    @Test
    public void test_solvable_06() {
        Problem problem = new Problem();
        assertTrue(problem.solvable(List.of("I", "THINK", "IT", "BE", "THINE"), "INDEED"));
    }

    @DisplayName("SEND + MORE = MONEY")
    @Test
    public void test_solvable_07() {
        Problem problem = new Problem();
        assertTrue(problem.solvable(List.of("SEND", "MORE"), "MONEY"));
    }


    @DisplayName("I + YOU = LOVE")
    @Test
    public void test_solvable_08() {
        Problem problem = new Problem();
        assertFalse(problem.solvable(List.of("I", "YOU"), "LOVE"));
    }

}