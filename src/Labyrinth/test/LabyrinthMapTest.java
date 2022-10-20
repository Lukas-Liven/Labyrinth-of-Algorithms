package Labyrinth.Labyrinth.test;

import static org.junit.jupiter.api.Assertions.*;

import Labyrinth.Labyrinth.LabyrinthMap;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.lang.model.type.ErrorType;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;

class LabyrinthMapTest {

	@Test
	public void testGetEmpty() {

		LabyrinthMap m = new LabyrinthMap();
		ImageIcon tile = new ImageIcon("EmptyTile.png");

		assertEquals(m.getEmpty(), tile.getImage());

	}

	@Test
	public void testGetWall() {

		LabyrinthMap m = new LabyrinthMap();
		ImageIcon tile = new ImageIcon("WallTile.png");

		assertEquals(m.getWall(), tile.getImage());
	}

	@Test
	public void testGetStart() {

		LabyrinthMap m = new LabyrinthMap();
		ImageIcon tile = new ImageIcon("StartTile.png");

		assertEquals(m.getStart(), tile.getImage());
	}

	@Test
	public void testGetGoal() {

		LabyrinthMap m = new LabyrinthMap();
		ImageIcon tile = new ImageIcon("GoalTile.png");

		assertEquals(m.getGoal(), tile.getImage());
	}

	@Test
	public void testReadTile() {

		// Using our default map with the following tile types and their respective coordinates:
		LabyrinthMap m = new LabyrinthMap();

		// Start Tile located at (0, 0)
		assertEquals(m.ReadTile(0, 0), "s");

		// Goal Tile located at (13, 13)
		assertEquals(m.ReadTile(13, 13), "g");

		// Empty Tiles located at (1, 0) and (2, 1)
		assertEquals(m.ReadTile(1, 0), "e");
		assertEquals(m.ReadTile(2, 1), "e");

		// Wall Tiles located at (0, 1) and (4, 4)
		assertEquals(m.ReadTile(0, 1), "w");
		assertEquals(m.ReadTile(4, 4), "w");
	}

	@Test
	public void testOpenFileThrow() {

		LabyrinthMap m = new LabyrinthMap();
		LabyrinthMap.LabMap = new File("Fake Map.txt");
		m.openFile(); // Opening fake map created above
	}
}
