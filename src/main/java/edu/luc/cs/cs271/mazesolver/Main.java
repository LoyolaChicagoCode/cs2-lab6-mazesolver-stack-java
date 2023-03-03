package edu.luc.cs.cs271.mazesolver;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(final String[] args) {

    // create scanner for data input
    final var input = new Scanner(System.in);

    // TODO read row and column for the starting point
    final var startRow = -1;
    final var startCol = -1;

    // TODO read maze data one row (line) at a time into rawData
    final var rawData = new ArrayList<String>();

    // attempt to solve the maze and print the result
    final var maze = new Maze(rawData);
    final var result = maze.solve(startRow, startCol);
    maze.print(System.out);
    System.out.println();
    System.out.println(result ? "We're so out of here!" : "Bummer, we're stuck...");
  }
}
