package datastructure;

import java.util.ArrayList;
import java.util.HashMap;

public class Project {
	private ArrayList<Project> children = new ArrayList<>();
	private HashMap<String, Project> map = new HashMap<>();
	
	private String name;
	private int dependencies = 0;
	
	public Project (String n) { name = n; }
	
	public void addNeighbour(Project node) {
		if (!map.containsKey(node.getName())) {
			children.add(node);
			map.put(node.getName(), node);
			node.incrementDependencies();
		}
	}
	
	public void incrementDependencies() { ++dependencies; }
	
	public void decrementDependencies() { --dependencies; }
	
	public String getName() { return name; }
	
	public ArrayList<Project> getChildren() { return children; }
	
	public int getNumberOfDependencies() { return dependencies; }
}
