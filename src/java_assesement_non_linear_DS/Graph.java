package java_assesement_non_linear_DS;
import java.util.ArrayList;
/*
This question will assess your ability to add edges to undirected or directed graphs.

You are provided with:

A Graph class with a vertices attribute, an isDirected attribute, an addVertex() method, and a print() method for debugging.
A Vertex class with a data attribute, an edges attribute, a print() method, and an addEdge() method.
An Edge class with a start attribute, and an end attribute.
Given the provided classes, implement the functionality to add Edges between Vertices within a Graph. This means that you will have to implement an addEdge() method for Graph which adds an Edge between the two Vertex parameters.

Requirements and Assumptions:

If the Graph is undirected, calling addEdge() should add the Edge to each Vertex, each going the other way.
If the Graph is directed, calling addEdge() should add the Edge between the two Vertexs (Vertices) to only the first parameter.
If the Graph is unweighted, the weight should be added as null.
 */
import java.util.ArrayList;

public class Graph {
    private ArrayList<Vertex> vertices;
    private boolean isWeighted;
    private boolean isDirected;

    public Graph(boolean inputIsWeighted, boolean inputIsDirected) {
        this.vertices = new ArrayList<Vertex>();
        this.isWeighted = inputIsWeighted;
        this.isDirected = inputIsDirected;
    }

    public Vertex addVertex(String data) {
        Vertex newVertex = new Vertex(data);
        this.vertices.add(newVertex);
        return newVertex;
    }

    public void addEdge(Vertex vertex1, Vertex vertex2, Integer weight) {
        if (!this.isWeighted) {
            weight = null;
        }
        vertex1.addEdge(vertex2, weight);

        if (!this.isDirected) {
            vertex2.addEdge(vertex1, weight);
        }
    }

    public ArrayList<Vertex> getVertices() {
        return this.vertices;
    }

    public boolean isWeighted() {
        return this.isWeighted;
    }

    public boolean isDirected() {
        return this.isDirected;
    }

    public Vertex getVertexByValue(String value) {
        for(Vertex v: this.vertices) {
            if (v.getData() == value) {
                return v;
            }
        }

        return null;
    }

    public void print() {
        for(Vertex v: this.vertices) {
            v.print(isWeighted);
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(true, false);

        Vertex vertexA = graph.addVertex("A");
        Vertex vertexB = graph.addVertex("B");
        Vertex vertexC = graph.addVertex("C");

        graph.addEdge(vertexA, vertexB, 10);
        graph.addEdge(vertexB, vertexC, 5);

        graph.print();
    }
}

class Vertex {
    private String data;
    private ArrayList<Edge> edges;

    public Vertex(String inputData) {
        this.data = inputData;
        this.edges = new ArrayList<Edge>();
    }

    public void addEdge(Vertex endVertex, Integer weight) {
        this.edges.add(new Edge(this, endVertex, weight));
    }

    public String getData() {
        return this.data;
    }

    public ArrayList<Edge> getEdges() {
        return this.edges;
    }

    public void print(boolean showWeight) {
        String message = "";

        if (this.edges.size() == 0) {
            System.out.println(this.data + " -->");
            return;
        }

        for (int i = 0; i < this.edges.size(); i++) {
            if (i == 0) {
                message += this.edges.get(i).getStart().data + " -->  ";
            }

            message += this.edges.get(i).getEnd().data;

            if (showWeight) {
                message += " (" + this.edges.get(i).getWeight() + ")";
            }

            if (i != this.edges.size() - 1) {
                message += ", ";
            }
        }
        System.out.println(message);
    }

}

class Edge {
    private Vertex start;
    private Vertex end;
    private Integer weight;

    public Edge(Vertex startV, Vertex endV, Integer inputWeight) {
        this.start = startV;
        this.end = endV;
        this.weight = inputWeight;
    }

    public Vertex getStart() {
        return this.start;
    }

    public Vertex getEnd() {
        return this.end;
    }

    public Integer getWeight() {
        return this.weight;
    }

}
