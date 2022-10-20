package Labyrinth.test;

import static org.junit.jupiter.api.Assertions.*;

import Labyrinth.Pointer;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;

class PointerTest {

	@Test
	public void testGetXtile() {

		Pointer p = new Pointer();  // Expected Pointer location at (0, 0)
		assertEquals(p.getXtile(), 0);
	}

	@Test
	public void testGetYtile() {

		Pointer p = new Pointer();  // Expected Pointer location at (0, 0)
		assertEquals(p.getYtile(), 0);
	}

	@Test
	public void testMove() {

		Pointer p = new Pointer();  // Expected Pointer location at (0, 0)

		p.move(1, 1);  // Expected Pointer location at (1, 1)
		assertArrayEquals(new int[] {p.getXtile(), p.getYtile()}, new int[]{1, 1});

		p.move(-2, -2);  // Expected Pointer location at (-1, -1)
		assertArrayEquals(new int[] {p.getXtile(), p.getYtile()}, new int[]{-1, -1});
	}

	@Test
	public void testGetPlayer() {

		Pointer p = new Pointer();

		ImageIcon tile = new ImageIcon("PlayerTile.png");
		Image playerTile = tile.getImage();

		assertEquals(p.getPlayer(), playerTile);
	}
}
