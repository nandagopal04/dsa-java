package com.dsa.structure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

	private Map<String, List<String>> adjList;

	public Graph() {
		super();
		this.adjList = new HashMap<String, List<String>>();
	}

	public boolean addVertex(String vertex) {
		if (!adjList.containsKey(vertex)) {
			adjList.put(vertex, new ArrayList<String>());
			return true;
		}
		return false;
	}

	public void printGraph() {
		System.out.println(adjList);
	}

}
