package utils

import java.io.File
import java.nio.charset.StandardCharsets


fun solvePuzzle(day: Int, solver: (Sequence<String>) -> Int): Int =
    File("./kotlin-1/input/day$day.txt").useLines(StandardCharsets.UTF_8, solver)
