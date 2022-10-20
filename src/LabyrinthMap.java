package Labyrinth;
import java.awt.*;
import java.io.*;
import java.util.*; 
import javax.swing.ImageIcon;
public class LabyrinthMap {

	private Scanner m;
	private String[] map = new String[14];
	private final Image empty, wall, start, goal;
	public static File LabMap = new File("Lab.txt");

	public LabyrinthMap()
	{

		ImageIcon tile = new ImageIcon("EmptyTile.png");
		empty = tile.getImage();

		tile = new ImageIcon("WallTile.png");
		wall = tile.getImage();

		tile = new ImageIcon("StartTile.png");
		start = tile.getImage();

		tile = new ImageIcon("GoalTile.png");
		goal = tile.getImage();

		openFile();
		readFile();
		closeFile();
	}

	public Image getEmpty()
	{
		return empty;
	}
	public Image getWall()
	{
		return wall;
	}
	public Image getStart()
	{
		return start;
	}
	public Image getGoal()
	{
		return goal;
	}

	public String ReadTile(int xloc, int yloc)
	{
		return map[yloc].substring(xloc,xloc+1);
	}
	
	public void openFile()
	{
		try {
			m = new Scanner(LabMap);
		} catch (Exception e) {
			System.out.println("Labyrinth failed to load.");
		}
	}
	public void readFile()
	{
		while(m.hasNext()) {
			for(int i=0; i<14; i++) {
				map[i] = m.next();
			}
		}
	}
	public void closeFile()
	{
		m.close();
	}
}
