package day00;

import org.junit.jupiter.api.Test;
import utils.Utils;

import static org.assertj.core.api.Assertions.assertThat;

class Day00Test {

    @Test
    void solveFirstPuzzle() {
        var day00 = new Day00(Utils.readResource("samples/sample0.txt"));

        assertThat(day00.solvePuzzle1()).isEqualTo(23); // length of first line
    }

    @Test
    void solveSecondPuzzle() {
        var day00 = new Day00(Utils.readResource("samples/sample0.txt"));

        assertThat(day00.solvePuzzle2()).isEqualTo(2); // number of lines
    }

}
