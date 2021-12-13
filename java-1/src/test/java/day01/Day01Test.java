package day01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("A SonarSweep")
public class Day01Test {
	
	@Test @DisplayName("returns 0 for empty measurements.")
	void returns0ForEmptyMeasurements() {
		assertEquals(0, SonarSweep.countIncreases(List.of()));
	}
	
	@Test @DisplayName("returns 0 for single measurement.")
	void returns0ForSingleMeasurement() {
		assertEquals(0, SonarSweep.countIncreases(List.of(200)));
	}
	
	@Test @DisplayName("returns zero for single decrease.")
	void returnsZeroForSingleDecrease() {
		assertEquals(0, SonarSweep.countIncreases(List.of(210, 200)));
	}
	
	@Test @DisplayName("returns zero for two equal measurements.")
	void returnsZeroForTwoEqualMeasurements() {
		assertEquals(0, SonarSweep.countIncreases(List.of(200, 200)));
	}
	
	@Test @DisplayName("returns one for single increase.")
	void returnsOneForSingleIncrease() {
		assertEquals(1, SonarSweep.countIncreases(List.of(200, 201)));
	}
}
