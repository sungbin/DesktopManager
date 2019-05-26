package paints;


import java.awt.Color;
import java.util.Stack;

public class Memory {
	public static Stack<Object> memory = new Stack<Object>();
	public static Stack<Color> colorMemory = new Stack<Color>();
	public static Stack<Integer> thicknessMemory = new Stack<Integer>();
	
	public static Stack<Object> redoMemory = new Stack<Object>();
	public static Stack<Color> redoColorMemory = new Stack<Color>();
	public static Stack<Integer> redoThicknessMemory = new Stack<Integer>();
}
