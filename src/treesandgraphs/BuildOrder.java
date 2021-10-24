package treesandgraphs;

import java.util.ArrayList;
import java.util.Stack;

import datastructure.Graph;
import datastructure.Project;

public class BuildOrder {
	private static Graph buildGraph(String[] projects, String[][] dependencies) {
		Graph graph = new Graph();
		for (String project : projects)
			graph.getOrCreateNode(project);
		for (String[] dependency : dependencies) 
			graph.addEdge(dependency[0], dependency[1]);
		return graph;
	}
	
	private static Stack<Project> orderProjects(ArrayList<Project> projects) {
		return null;
	}
	
	public static Stack<Project> findBuildOrder(String[] projects, String[][] dependencies) {
		Graph graph = buildGraph(projects, dependencies);
		return orderProjects(graph.getNodes());
	}
}
