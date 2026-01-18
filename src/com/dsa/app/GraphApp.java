package com.dsa.app;

import com.dsa.structure.Graph;

public class GraphApp {

	public static void main(String[] args) {
		Graph graph = new Graph();
		System.out.println(graph.addVertex("guntur"));
		System.out.println(graph.addVertex("ponnur"));
		System.out.println(graph.addVertex("vijayawada"));
		System.out.println(graph.addEdge("guntur", "ponnur"));
		System.out.println(graph.addEdge("guntur", "vijayawada"));
		System.out.println(graph.addEdge("ponnur", "vijayawada"));
		graph.printGraph();
		System.out.println(graph.removeEdje("ponnur", "vijayawada"));
		graph.printGraph();
	}

}
