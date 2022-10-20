package Labyrinth.Labyrinth;
import javax.swing.ImageIcon;
import java.awt.Image;

public class Pointer {
	private int tilex, tiley;
	private Image player;

	public Pointer() {
		ImageIcon tile = new ImageIcon("PlayerTile.png");
		player = tile.getImage();
		tilex = 0;
		tiley = 0;
	}

	public Image getPlayer() {
		return player;
	}

	public int getXtile() {
		return tilex;
	}

	public int getYtile() {
		return tiley;
	}

	public void move(int dx, int dy) {
		tilex += dx;
		tiley += dy;
	}
}
