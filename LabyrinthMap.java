package Labyrinth;
import java.awt.*;
import java.io.*;
import java.util.*;

import javax.swing.ImageIcon;
public class LabyrinthMap {
	private Scanner reader;
	private String map[] = new String[14];
	private Image player,empty,wall,start,goal;
	
	public LabyrinthMap()
	{
		ImageIcon tile = new ImageIcon("C://Users//Lukas//Desktop//Labyrinth of Algorithms Tile Assets/EmptyTile.png");
		empty = tile.getImage();
		tile = new ImageIcon("C://Users//Lukas//Desktop//Labyrinth of Algorithms Tile Assets/PlayerTile.png");
		player = tile.getImage();
		tile = new ImageIcon("C://Users//Lukas//Desktop//Labyrinth of Algorithms Tile Assets/WallTile.png");
		wall = tile.getImage();
		tile = new ImageIcon("C://Users//Lukas//Desktop//Labyrinth of Algorithms Tile Assets/StartTile.png");
		start = tile.getImage();
		tile = new ImageIcon("C://Users//Lukas//Desktop//Labyrinth of Algorithms Tile Assets/GoalTile.png");
		goal = tile.getImage();
		openFile();
		readFile();
		closeFile();
	}
	public Image getEmpty()
	{
		return empty;
	}
	public Image getPlayer()
	{
		return player;
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
	public String ReadTile(int xloc,int yloc)
	{
		String index = map[yloc].substring(xloc,xloc+1);
		return index;
	}
	
	public void openFile()
	{
		try {
			reader = new Scanner(new File("C://Users//Lukas//Desktop//Labyrinth of Algorithms Tile Assets/DemoLab.txt"));
		}catch (Exception e) {
			System.out.println("Labyrinth failed to load.");
		}
	}
	public void readFile()
	{
		while(reader.hasNext()) {
			for(int i=0;i<14;i++) {
				map[i] = reader.next();
			}
		}
	}
	public void closeFile()
	{
		reader.close();
	}
}
