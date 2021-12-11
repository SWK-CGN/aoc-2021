package day00

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test


class Day00Test {

    @Test
    internal fun `solve first puzzle with sample input`() {
        val input = sample.lineSequence()

        solvePuzzle1(input) shouldBe 23 // length of first line
    }

    @Test
    internal fun `solve second puzzle with sample input`() {
        val input = sample.lineSequence()

        solvePuzzle2(input) shouldBe 2 // number of lines
    }

    val sample = """
        This is a sample input.
        It has two lines.
    """.trimIndent()
}
