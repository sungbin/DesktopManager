package paints;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JToolBar;

import paints.drawbuttons.DrawButton;

public class Buttons implements MouseListener {
	JButton[] toolbuttons = new JButton[9];
	static CanvasGroup canvas = new CanvasGroup();
	Stroke stroke = new Stroke();
	static boolean clear;
	static boolean erase;
	static boolean text;
	
//	static boolean[] draw = new boolean[4]; 얘네 디자인 적용 
//	JButton[] drawbuttons = new JButton[4];
	
	static DrawButton[] drawbuttons = new DrawButton[4];
	
	
	int canvasNum = 0;

	Buttons() {

		for(int i = 0; i < toolbuttons.length; i++) {
//			toolbuttons[i] = new JButton(new ImageIcon("icon/"+i+".png"));
			toolbuttons[i] = new JButton(new ImageIcon("red.png"));
			toolbuttons[i].setBorderPainted(true);
			toolbuttons[i].addMouseListener(this);
		}


		paints.drawbuttons.Eclipse eclipseButton = new paints.drawbuttons.Eclipse(this);
		paints.drawbuttons.Erase eraseButton = new paints.drawbuttons.Erase(this);
		paints.drawbuttons.Line lineButton = new paints.drawbuttons.Line(this);
		paints.drawbuttons.Rectangle rectangleButton = new paints.drawbuttons.Rectangle(this);
		
		
		drawbuttons[0] = eraseButton;
		drawbuttons[1] = lineButton;
		drawbuttons[2] = rectangleButton;
		drawbuttons[3] = eclipseButton;
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		JButton button = (JButton)e.getSource();

		if (button == toolbuttons[0]) { //sb	
			undo();
		}

		if (button == toolbuttons[1]) { //sb
			redo();
		}

		if (button == toolbuttons[2]) {
			setInit();
			addCanvas();
		}
		
		if (button == toolbuttons[3]) {
			ColorFrame colorFrame = new ColorFrame();
		}
		

		if (button == toolbuttons[5]) {
			setEraser();
		}

		if (button == toolbuttons[6]) {
			setText();
			TextBoard textBoard = new TextBoard();
		}

		if (button == toolbuttons[7]) {
			setInit();
			clear = true;
			canvas.getSelectedComponent().repaint();
		}

		if (button == toolbuttons[8]) {
			setInit();
			CheckFrame check = new CheckFrame();
		}

		if (button == drawbuttons[0].getButton()) {
			setDraw(button);
		}

		if (button == drawbuttons[1].getButton()) {
			setDraw(button);
		}

		if (button == drawbuttons[2].getButton()) {
			setDraw(button);
		}

		if (button == drawbuttons[3].getButton()) {
			setDraw(button);
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	private void setEraser() {
		erase = true;
		text = false;

		toolbuttons[5].setBorderPainted(true);
		toolbuttons[6].setBorderPainted(false);

		for(int i = 0; i < drawbuttons.length; i++) {
			drawbuttons[i].off();
			drawbuttons[i].getButton().setBorderPainted(false);
		}

	}

	private void setText() {
		erase = false;
		text = true;

		toolbuttons[5].setBorderPainted(false);
		toolbuttons[6].setBorderPainted(true);

		for(int i = 0; i < drawbuttons.length; i++) {
			drawbuttons[i].off();
			drawbuttons[i].getButton().setBorderPainted(false);
		}
	}

	private void setDraw(JButton button) {
		erase = false;
		text = false;

		toolbuttons[5].setBorderPainted(false);
		toolbuttons[6].setBorderPainted(false);

		for(int i = 0; i < drawbuttons.length; i++) {
			if (button == drawbuttons[i].getButton()) {
				drawbuttons[i].on();
				drawbuttons[i].getButton().setBorderPainted(true);
			}
			else {
				drawbuttons[i].off();
				drawbuttons[i].getButton().setBorderPainted(false);
			}
		}

	}

	private void setInit() {
		erase = false;
		text = false;

		toolbuttons[5].setBorderPainted(false);
		toolbuttons[6].setBorderPainted(false);
		
		for(int i = 0; i < drawbuttons.length; i++) {
			drawbuttons[i].off();
			drawbuttons[i].getButton().setBorderPainted(false);
		}

	}

	private void addCanvas() {
		Canvas newCanvas = new Canvas();

		newCanvas.setBackground(Color.white);
		newCanvas.setOpaque(true);

		canvas.add("canvas"+canvasNum, newCanvas);
		canvasNum++;
	}

	private void undo() {
		ColorFrame.colorChange = true;
		
		if(Memory.memory.isEmpty() == true)
			;
		else {
			if(Memory.memory.peek() == null) {
				Sketch.redoStart.push(Sketch.start.pop());
				Sketch.redoEnd.push(Sketch.end.pop());
			}
			
			Memory.redoMemory.push(Memory.memory.pop());
			Memory.redoColorMemory.push(Memory.colorMemory.pop());
			Memory.redoThicknessMemory.push(Memory.thicknessMemory.pop());
			
			canvas.getSelectedComponent().repaint();
		}
	}
	
	private void redo() {
		ColorFrame.colorChange = true;
		
		if(Memory.redoMemory.isEmpty() == true)
			;
		else {
			if(Memory.redoMemory.peek() == null) {
				Sketch.start.push(Sketch.redoStart.pop());
				Sketch.end.push(Sketch.redoEnd.pop());
			}
			
			Memory.memory.push(Memory.redoMemory.pop());
			Memory.colorMemory.push(Memory.redoColorMemory.pop());
			Memory.thicknessMemory.push(Memory.redoThicknessMemory.pop());
			
			canvas.getSelectedComponent().repaint();
		}
	}
	
}
