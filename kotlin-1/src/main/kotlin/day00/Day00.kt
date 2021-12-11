package day00

import utils.solvePuzzle


fun solvePuzzle1(input: Sequence<String>): Int =
    input.first().length

fun solvePuzzle2(input: Sequence<String>): Int =
    input.toList().size

fun main() {
    println("Answer 1: ${solvePuzzle(0, ::solvePuzzle1)}")
    println("Answer 2: ${solvePuzzle(0, ::solvePuzzle2)}")
}
