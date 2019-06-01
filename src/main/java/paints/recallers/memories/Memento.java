package paints.recallers.memories;

import java.awt.Color;

public class Memento {
	private Object memory;
	private Color colorMemory;
	private Integer thicknessMemory;
	
	public Memento(Object memory, Color colorMemory, Integer thicknessMemory) {
		super();
		this.memory = memory;
		this.colorMemory = colorMemory;
		this.thicknessMemory = thicknessMemory;
	}
	public Object getMemory() {
		return memory;
	}
	public void setMemory(Object memory) {
		this.memory = memory;
	}
	public void setColorMemory(Color colorMemory) {
		this.colorMemory = colorMemory;
	}
	public void setThicknessMemory(Integer thicknessMemory) {
		this.thicknessMemory = thicknessMemory;
	}
	public Color getColorMemory() {
		return colorMemory;
	}
	public Integer getThicknessMemory() {
		return thicknessMemory;
	}
}
