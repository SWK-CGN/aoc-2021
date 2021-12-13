package day01;

import java.util.List;

public class SonarSweep {

    public static int countIncreases(final List<Integer> measurements) {
        int count = 0;
        for (int i = 1; i < measurements.size(); i++) {
            int firstElement = measurements.get(i - 1);
            int secondElement = measurements.get(i);
            if (firstElement < secondElement) {
                count++;
            }
        }
        return count;
    }
}
