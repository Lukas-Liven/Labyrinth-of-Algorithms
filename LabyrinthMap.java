package Labyrinth;
import java.awt.*;
import java.io.*;
import java.util.*;
public class LabyrinthMap {
	private Scanner reader;
	private String map[] = new String[14];
	
	public LabyrinthMap()
	{
		openFile();
		readFile();
		closeFile();
	}
	
	public String ReadTile(int xloc,int yloc)
	{
		String index = map[yloc].substring(xloc,xloc+1);
		return index;
	}
	
	public void openFile()
	{
		try {
			reader = new Scanner(new File("C://test//tutorial//DemoLab.txt"));
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
