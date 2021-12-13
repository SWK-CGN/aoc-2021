package day00

import utils.solvePuzzle

data class Point(val x: Int, val y: Int)
data class Line(val from: Point, val to: Point)

val Line.isHorizontalOrVertical: Boolean get() = from.x == to.x || from.y == to.y

fun Line.allPoints(): Collection<Point> =
    if (isHorizontalOrVertical)
        (from.x..to.x).fix().flatMap { x ->
            (from.y..to.y).fix().map { y -> Point(x, y) }
        }
    else
        TODO()

fun IntRange.fix():IntRange = if(start > endInclusive) endInclusive..start else this

fun solvePuzzle1(input: Sequence<String>): Int {
    val lines = input.map {
        val (f, t) = it.split(" -> ")
        Line(f.createPoint(), t.createPoint())
    }.toList()
    val hvLines = lines.filter { it.isHorizontalOrVertical }


    val map = hvLines.flatMap { it.allPoints().also { println (it) }


    }.groupingBy { it }.eachCount()

    return map.filter {  (_, v) -> v > 1}.size
}

private fun String.createPoint() =
    split(",").let { (x, y) -> Point(x.toInt(), y.toInt()) }


fun solvePuzzle2(input: Sequence<String>): Int {
    return input.toList().size
}

fun main() {
//    check(solvePuzzle(0, ::solvePuzzle1) == 5)
    println("Answer 1: ${solvePuzzle(0, ::solvePuzzle1)}")
    println("Answer 2: ${solvePuzzle(0, ::solvePuzzle2)}")
}
