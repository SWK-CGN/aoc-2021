package day01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("A SonarSweep")
public class Day01Test {

    @Test
    @DisplayName("returns 0 for empty measurements.")
    void returns0ForEmptyMeasurements() {
        assertEquals(0, SonarSweep.countIncreases(List.of()));
    }

    @Test
    @DisplayName("returns 0 for single measurement.")
    void returns0ForSingleMeasurement() {
        assertEquals(0, SonarSweep.countIncreases(List.of(200)));
    }

    @Test
    @DisplayName("returns zero for single decrease.")
    void returnsZeroForSingleDecrease() {
        assertEquals(0, SonarSweep.countIncreases(List.of(210, 200)));
    }

    @Test
    @DisplayName("returns zero for two equal measurements.")
    void returnsZeroForTwoEqualMeasurements() {
        assertEquals(0, SonarSweep.countIncreases(List.of(200, 200)));
    }

    @Test
    @DisplayName("returns one for single increase.")
    void returnsOneForSingleIncrease() {
        assertEquals(1, SonarSweep.countIncreases(List.of(200, 201)));
    }

    @Test
    @DisplayName("returns 0 for two decreases.")
    void returnsO0ForTwoDecreases() {
        assertEquals(0, SonarSweep.countIncreases(List.of(200, 199, 180)));
    }

    @Test
    @DisplayName("returns 2 for two increases.")
    void returnsO0ForTwoIncreases() {
        assertEquals(2, SonarSweep.countIncreases(List.of(200, 210, 230)));
    }

    @Test
    @DisplayName("returns 7 for sample.")
    void returns7forSample() {
        List<Integer> inst = List.of(199, 200, 208, 210, 200, 207, 240, 269, 260, 263);
        assertEquals(7, SonarSweep.countIncreases(inst));
    }
}
