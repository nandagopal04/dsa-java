package com.dsa.app;

import com.dsa.structure.Graph;

public class GraphApp {

	public static void main(String[] args) {
		Graph graph = new Graph();
		System.out.println(graph.addVertex("guntur"));
		System.out.println(graph.addVertex("ponnur"));
		System.out.println(graph.addEdge("guntur", "ponnur"));
		System.out.println(graph.addEdge("guntur", "guntur"));
		graph.printGraph();
	}

}
