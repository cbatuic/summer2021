package NonLinear.Graphs;

/*
1. Specification
Data - a collection of vertices and edges connecting vertices. Array Implementation
Operations - 
 * Graph()
 * Graph(numofNodes, isDirected, isWeighted)
 * addEdge (source, destination)
 * addEdge (source, destination, weight)
 * hasEdge (source, destination)
 * getEdgeValue (source, destination)
 * toString()
*/

/*
2. Representation - Adjacency Matrix
    a. One Dimensional Array - info about vertices
    b. Two Dimensional Array - info about edges
*/

public class GraphOps {
    private boolean directed;
    private boolean weighted;
    private int numOfNodes;
    // 1D for vertices
    private String[] vertices;
    // 2D for vertices - Adjacency Matrix
    private int[][] edges;
    
    //private boolean[][] isSetMatrix;
    
    // Constructors
    GraphOps(){
        directed = false;
        weighted = false;
        numOfNodes = 10;
        vertices = new String[numOfNodes];
        edges = new int[numOfNodes][numOfNodes];
    }
    
    GraphOps(int num, boolean isDirected, boolean isWeighted){
        directed = isDirected;
        weighted = isWeighted;
        numOfNodes = num;
        vertices = new String[numOfNodes];
        edges = new int[numOfNodes][numOfNodes]; 
        
        //assign initial values to all elements (numOfNodes x numOfNodes)
        for(int i=0;i<numOfNodes;i++){
            for(int j=0;j<numOfNodes;j++){
                edges[i][j] = Integer.MAX_VALUE;
            }
        }
    }
    
    public void addEdge(int source, int destination){
        edges[source][destination] = 1;
        if(!directed){
            edges[destination][source] = 1;
        }
    }
    
    public void addEdge(int source, int destination, int weight){
        edges[source][destination] = weight;
        if(!directed){
            edges[destination][source] = weight;
        }        
    }
    
    @Override
    public String toString(){
        String s = "";
        for (int i = 0; i < numOfNodes; i++) {
            for(int j=0; j< numOfNodes; j++) {
                if(edges[i][j]==Integer.MAX_VALUE)
                    s = s + "oo" + " ";
                else
                    s = s + edges[i][j] + " ";
            }
            s = s + "\n";
        }        
        return s;
        /*
            0 1 0
            1 0 1
            0 1 0
        */
    }
    
}

/*
3. Implementation
*/
class GraphOpsTest{
    public static void main(String[] args) {
        // directed unweighted graph
        GraphOps g1 = new GraphOps(3, true, false);
        g1.addEdge(0, 1);
        g1.addEdge(1, 2);
        g1.addEdge(2, 1);
        System.out.printf("%s\n", g1.toString());
        /*
            0 1 0
            0 0 1
            0 1 0
        */
        
        System.out.println("==========");
        
        // undirected unweighted graph
        GraphOps g2 = new GraphOps(3, false, false);
        g2.addEdge(0, 1);
        g2.addEdge(1, 2);
        System.out.printf("%s\n", g2.toString());
    }
}















