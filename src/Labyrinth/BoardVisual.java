package Labyrinth.Labyrinth;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class BoardVisual extends JPanel implements ActionListener {

	private Timer actionwait;
	private int fps = (int) (1000/30);
	private LabyrinthMap l;
	private Pointer p;

	public BoardVisual() {
		l = new LabyrinthMap();
		p = new Pointer();
		addKeyListener(new Al());
		setFocusable(true);
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
		g.drawImage(p.getPlayer(),p.getXtile()*32,p.getYtile()*32,null);
	}
	
	
	public class Al extends KeyAdapter{
		
		public void keyPressed(KeyEvent e) {
			int keycode = e.getKeyCode();
			if(keycode== KeyEvent.VK_W) {
				if(!l.ReadTile(p.getXtile(),p.getYtile()-1).equals("w"))
				p.move(0, -1);
			}
			if(keycode== KeyEvent.VK_A) {
				if(!l.ReadTile(p.getXtile()-1,p.getYtile()).equals("w"))
				p.move(-1, 0);
			}
			if(keycode== KeyEvent.VK_S) {
				if(!l.ReadTile(p.getXtile(),p.getYtile()+1).equals("w"))
				p.move(0, 1);
			}
			if(keycode== KeyEvent.VK_D) {
				if(!l.ReadTile(p.getXtile()+1,p.getYtile()).equals("w"))
				p.move(1, 0);
			}
		}
		
		public void keyReleased(KeyEvent e) {
			
		}
		
		public void keyTyped(KeyEvent e) {
			
		}
	}
}
