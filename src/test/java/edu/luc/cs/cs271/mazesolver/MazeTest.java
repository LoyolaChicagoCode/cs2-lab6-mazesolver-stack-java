package edu.luc.cs.cs271.mazesolver;

import org.junit.Test;

import static org.junit.Assert.*;

public class MazeTest {

  @Test
  public void testMazeGeta() {
    final var data = new String[] {"***", "*..", "***"};
    final var sut = new Maze(data);
    assertEquals(Maze.EMPTY, sut.get(1, 1));
    assertEquals(Maze.WALL, sut.get(0, 0));
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void testMazeGetb() {
    final var data = new String[] {"***", "*..", "***"};
    final var sut = new Maze(data);
    sut.get(3, 4);
  }

  @Test
  public void testMaze1x1a() {
    final var data = new String[] {"*"};
    final var sut = new Maze(data);
    assertFalse(sut.solve(0, 0));
  }

  @Test
  public void testMaze1x1b() {
    final var data = new String[] {"."};
    final var sut = new Maze(data);
    assertTrue(sut.solve(0, 0));
  }

  @Test
  public void testMaze3x3a() {
    final var data = new String[] {"***", "*.*", "***"};
    final var sut = new Maze(data);
    assertFalse(sut.solve(1, 1));
  }

  @Test
  public void testMaze3x3b() {
    final var data = new String[] {"***", "*..", "***"};
    final var sut = new Maze(data);
    assertTrue(sut.solve(1, 1));
    assertEquals(Maze.VISITED, sut.get(1, 2));
  }

  // TODO add at least four tests:
  // one for maze1 and and one for a copy of maze1 but with the exit blocked
  // one for your own maze2,
  // which should have at least two exits and size 10x10 or larger,
  // and and one for a copy of maze2 but with all exits blocked
}
