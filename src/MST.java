import java.io.File;
import java.util.*;

class Vertex {
	int name;
	int dv;
	Vertex parent;
	int heapLoc;
	boolean isVisited;
	
	Vertex (int name) {
		this.name = name;
		this.dv = Integer.MAX_VALUE;
		this.isVisited = false;
	}
	
}

class Edge1 {
	Vertex from;
	Vertex to;
	int weight;
	
	Edge (int from, int to, int weight) {
		this.from = new Vertex(from);
		this.from.name = from;
		this.to = new Vertex(to);
		this.to.name = to;
		this.weight = weight;
	}
}

class Graph {
	private ArrayList<Vertex> allVertices = new ArrayList<>();
	private ArrayList<Edge> edgeList = new ArrayList<Edge>();
	
	public void addEdge(int from, int to, int weight) {
		Edge e = new Edge (from, to, weight);
		edgeList.add(e);
	}
	public ArrayList<Edge> getEdge() {
		return edgeList;
	}
}

public class MST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Graph graph = new Graph();

		try {
            Scanner input = null;
            File file = new File("C:\\Users\\Barath Eswer\\Downloads\\Barath\\Algo Plan\\HeapTree\\src\\test123");
            input = new Scanner(file);
            int vertices = input.nextInt();
            System.out.println(vertices);
            int edges = input.nextInt();
            while (input.hasNextLine()) {
            	graph.addEdge(input.nextInt(), input.nextInt(), input.nextInt());
            	if(input.hasNextLine())
            		input.nextLine();
            	else {
            		break;
            	}
            }
            input.close();
                    	
        } catch (Exception ex) {
            ex.printStackTrace();
        }
		Graph g = new Graph();
		g.getEdge();
		System.out.print(g.getEdge());

	}

}
