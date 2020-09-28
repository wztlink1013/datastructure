package com.wztlink1013.al._图_BFS_DFS_拓扑排序_;

import com.wztlink1013.al._图_BFS_DFS_拓扑排序_.graph.*;

public class Main {
    public static void main(String[] args) {
        Graph<String, Integer> graph = new ListGraph<>();
        graph.addEdge("v1", "v0", 9);
        graph.addEdge("v1", "v2", 3);
        graph.addEdge("v2", "v0", 2);
        graph.addEdge("v2", "v3", 5);
        graph.addEdge("v3", "v4", 1);
        graph.addEdge("v0", "v4", 6);
        graph.print();

    }
}
