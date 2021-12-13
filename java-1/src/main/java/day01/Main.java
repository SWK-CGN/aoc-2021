package day01;

import static java.util.stream.Collectors.toList;
import static utils.Utils.inputForDay;

public class Main {
    public static void main(String[] args) {
        var strings = inputForDay(1);
        var ints = strings.stream().map(Integer::parseInt).collect(toList());
        System.out.println(SonarSweep.countIncreases(ints));
    }
}
