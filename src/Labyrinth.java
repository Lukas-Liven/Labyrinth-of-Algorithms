package Labyrinth;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 
public class Labyrinth {
	public static void main(String[] args){
		new Labyrinth();
	}
	
	public Labyrinth() {
		JFrame Lab = new JFrame();
		Lab.setTitle("Labyrinth of Algorithms Demo Map");
		Lab.add(new BoardVisual());
		Lab.setSize(560, 460);
		Lab.setLocationRelativeTo(null);
		Lab.setVisible(true);
		Lab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
