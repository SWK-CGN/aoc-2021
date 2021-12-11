package day00;

import utils.Utils;

import java.util.List;

public class Day00 {

    private final List<String> input;

    public Day00(List<String> input) {
        this.input = input;
    }

    public int solvePuzzle1() {
        return input.stream().findFirst().orElse("").length();
    }

    public int solvePuzzle2() {
        return (int) input.size();
    }

    public static void main(String[] args) {
        var solver = new Day00(Utils.inputForDay(0));
        System.out.printf("Answer 1: %d%n", solver.solvePuzzle1());
        System.out.printf("Answer 2: %d%n", solver.solvePuzzle2());
    }

}
