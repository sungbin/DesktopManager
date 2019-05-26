package paints;


import java.awt.Point;
import java.util.Stack;
import java.util.Vector;

public class Sketch {
	public static Vector<Point> sketch = new Vector<Point>();
	public static Stack<Integer> start = new Stack<Integer>();
	public static Stack<Integer> end = new Stack<Integer>();
	
	public static Stack<Integer> redoStart = new Stack<Integer>();
	public static Stack<Integer> redoEnd = new Stack<Integer>();
	
	int next;
	
}
