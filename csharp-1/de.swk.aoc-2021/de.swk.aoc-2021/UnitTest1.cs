using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using FluentAssertions;
using NUnit.Framework;

namespace de.swk.aoc_2021
{
    public class Test
    {
        [SetUp]
        public void Setup()
        {
        }

        [Test]
        public void Test1()
        {
            var result = 0;
            string[] lines = File.ReadAllLines("example-input.txt");
            var input = lines[0];

            var boards = new List<Board>();

            var boardLines = lines.Skip(1);
            for (int boardCount = 0; boardCount < lines.Length / 6; boardCount++)
            {
                var board = new Board();

                for (int rowCount = 1; rowCount < 6; rowCount++)
                {
                    var row = new List<Cell>();
                    var rowNumber = boardCount * 6 + rowCount;
                    var currentLine = boardLines.ToArray()[rowNumber].Split(' ', StringSplitOptions.RemoveEmptyEntries);
                    foreach (var numberAsString in currentLine)
                    {
                        var number = int.Parse(numberAsString);
                        var cell = new Cell {Number = number};
                        row.Add(cell);
                    }

                    board.Cells.Add(row);
                }

                boards.Add(board);
            }

            // jede Zahl durchgehen
            // markierte, ob die Zahl gefunden wurde
            // finde heraus, je Board, ob eine Zeile oder eine Reihe komplett ist
            // wenn ja, Sieger gefunden

            // Score berechnen (Sieger Board)
            // summiere unmarkierte Zahlen
            // multipliziere mit letzter Zahl

            result.Should().Be(4512);
        }
    }

    public class Cell
    {
        public int Number { get; set; }
        public bool Marked { get; set; }
    }

    public class Board
    {
        public List<List<Cell>> Cells { get; set; }

        public Board()
        {
            Cells = new List<List<Cell>>();
        }
    }
}