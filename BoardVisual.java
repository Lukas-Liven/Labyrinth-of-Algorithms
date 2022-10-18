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
		g.setColor(Color.blue);
		g.fillRect(0, 0, 3, 3);
	}
}
