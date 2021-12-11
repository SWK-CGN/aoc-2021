package utils;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Utils {

    public static List<String> readResource(String path) {
        var url = Utils.class.getClassLoader().getResource(path);
        if (url == null) {
            throw new IllegalArgumentException(String.format("resource %s not found.", path));
        }
        try (Stream<String> lines = Files.lines(Path.of(url.toURI()))) {
            return lines.collect(toList());
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public static List<String> inputForDay(int day) {
        try (Stream<String> lines = Files.lines(Path.of(String.format("./input/day%d.txt", day)))) {
            return lines.collect(toList());
        } catch (IOException error) {
            throw new UncheckedIOException(error);
        }
    }

}
