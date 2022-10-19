package Labyrinth;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class BoardVisual extends JPanel implements ActionListener {
	private Timer actionwait;
	private int fps = (int) (1000/30);
	private LabyrinthMap l;
	public BoardVisual() {
		l = new LabyrinthMap();
		actionwait = new Timer(fps,this);
		actionwait.start();
	}
	
	public void actionPerformed(ActionEvent e) {
		repaint();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		for(int y=0; y<14; y++)
		{
			for(int x=0; x<14; x++)
			{
				if(l.ReadTile(x,y).equals("e")) {
					g.drawImage(l.getEmpty(), x*32, y*32, null);
				}
				if(l.ReadTile(x,y).equals("w")) {
					g.drawImage(l.getWall(), x*32, y*32, null);
				}
				if(l.ReadTile(x,y).equals("s")) {
					g.drawImage(l.getStart(), x*32, y*32, null);
				}
				if(l.ReadTile(x,y).equals("g")) {
					g.drawImage(l.getGoal(), x*32, y*32, null);
				}
			}
		}
	}
}
