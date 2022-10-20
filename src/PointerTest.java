package Labyrinth;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;

class PointerTest {

	@Test
	public void testMove() {

		Pointer s = new Pointer();
		s.move(1, 1);
		assertEquals(s.getXtile(), 1);
		assertEquals(s.getYtile(), 1);

		s.move(-2, -2);
		assertEquals(s.getXtile(), -1);
		assertEquals(s.getYtile(), -1);
	}

	@Test
	public void testGetXtile() {

		Pointer s = new Pointer();
		assertEquals(s.getXtile(), 0);
	}

	@Test
	public void testGetYtile() {

		Pointer s = new Pointer();
		assertEquals(s.getYtile(), 0);
	}

	@Test
	public void testGetPlayer() {

		Pointer s = new Pointer();
		ImageIcon tile = new ImageIcon("PlayerTile.png");
		Image player = tile.getImage();

		assertEquals(s.getPlayer(), player);
	}
}
