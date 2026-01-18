package com.dsa.app;

import com.dsa.structure.Graph;

public class GraphApp {

	public static void main(String[] args) {
		Graph graph = new Graph();
		System.out.println(graph.addVertex("guntur"));
		graph.printGraph();
	}

}
