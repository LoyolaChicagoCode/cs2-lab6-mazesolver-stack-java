package edu.luc.cs.cs271.mazesolver;

import java.io.PrintStream;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Maze {

  public static final char WALL = '*', EMPTY = '.', VISITED = '+', DEADEND = '-', START = '0';

  /** Representation of maze as a mutable char array. */
  private final char[][] mazeData;

  /**
   * Constructs a maze instance from a nonempty list of same-length strings. Each string represents
   * a row in the maze.
   *
   * @param rawData a nonempty list of same-length strings
   * @throws IllegalArgumentException if rawData is empty or some strings are longer than others
   */
  public Maze(final List<String> rawData) {
    this(rawData.toArray(new String[0]));
  }

  /**
   * Constructs a maze instance from a nonempty array of same-length strings. Each string represents
   * a row in the maze.
   *
   * @param rawData a nonempty array of same-length strings
   * @throws IllegalArgumentException if rawData is empty or some strings are longer than others
   */
  public Maze(final String[] rawData) {
    // TODO your job
    // make sure raw data is not empty

    // initialize char array
    mazeData = null;

    // populate char array from raw data, checking consistent width in the process

  }

  /**
   * Prints the maze to the given destination.
   *
   * @param output the output destination
   */
  public void print(final PrintStream output) {
    // TODO your job
    // print row by row

  }

  /**
   * Attempts to find a way out of this maze from the given starting position.
   *
   * @param row the row (y) index of the starting position
   * @param col the row (x) index of the starting position
   * @return whether or not there is a way out
   * @throws IllegalArgumentException if the starting position is outside the maze
   */
  public boolean solve(final int startRow, final int startCol) {

    // TODO
    // validate arguments: ensure position is within maze area

    // TODO create local class for row/col positions
    class Position {
      // TODO add instance variables
      public Position(final int row, final int col) {
        // TODO
      }
      // TODO toString if desired
    }

    // TODO define the stack (work queue)
    final var queue = Collections.asLifoQueue(new LinkedList<Position>());

    // TODO put starting position in queue
    queue.add(new Position(startRow, startCol));

    // look for a way out of the maze from the current position
    while (! queue.isEmpty()) {
      final var pos = queue.remove();

      // if we've already visited this position, do not visit again

      // otherwise mark this place as visited (drop a breadcrumb)

      // if we're already on the perimeter, then this is a way out and we should return success (true) right away

      // else try each of our four neighbors (cardinal directions) by adding them to the stack
    }

    // mark starting position

    // if we've looked everywhere but haven't gotten out, then return failure (false)
    return false;
  }

  /**
   * Returns the char at the given row and column. Mainly for testing.
   *
   * @param row the row
   * @param col the column
   * @return the char at the given row and column
   * @throws IndexOutOfBoundsException if the row or column are outside the valid range
   */
  public char get(final int row, final int col) {
    // TODO your job
    return '?';
  }
}
