package project.team.oodp.desktop;

import java.util.*;
public class DesktopTree {
	public ArrayList<DesktopTree> children;
	public ArrayList<DSegment> segments;
	public DesktopTree parent;
	
	DesktopTree(DesktopTree parent) {
		this.parent = parent;
		children = new ArrayList<DesktopTree>();
		segments = new ArrayList<DSegment>();
	} 
	DesktopTree() {
		this(null);
	}
}
