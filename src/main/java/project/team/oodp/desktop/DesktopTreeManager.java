package project.team.oodp.desktop;

import java.util.*;
public class DesktopTreeManager {
	DesktopTree root;
	DesktopTree current;
	HashMap<DFolder,DesktopTree> map;
	public void init() {
		root = new DesktopTree();
		current = root;
		map = new HashMap<DFolder,DesktopTree>();
	}
	
	public void add(DFile f) {
		current.segments.add(f);
	}
	
	public void add(DFolder f) {
		current.segments.add(f);
		DesktopTree one = new DesktopTree(current);
		current.children.add(one);
	}
}
