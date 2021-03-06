
/*
 * Released under MIT License.
 * Copyright 2018 Alejandro Pérez-Sanjuán.
 */

package GraphADT.Directed;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * 
 * @author Alejandro Pérez-Sanjuán
 */
public interface Graph {

    /**
     * Returns a list of the vertices that form the graph
     * @return 
     */
    ArrayList <Vertex> getVertices ();
    
    /**
     * Creates a new edge in this graph, going from the source vertex to the destination vertex.
     * @param source
     * @param destination
     * @param weight
     * @throws IllegalStateException 
     */
    void addEdge (int source, int destination, Integer weight) throws IllegalStateException;
    
    /**
     * Removes an edge going from source vertex to destination vertex, if such vertices and such edge exist in this graph.
     * @param source
     * @param destination
     * @throws NoSuchElementException 
     */
    void removeEdge (int source, int destination) throws NoSuchElementException;
    
    /**
     * Returns true if this graph contains the specified edge.
     * @param source
     * @param destination
     * @return Returns true if this graph contains the specified edge.
     */
    boolean containsEdge (int source, int destination);
    
    /**
     * Returns the target vertex of an edge.
     * @param source
     * @param destination
     * @return
     * @throws NoSuchElementException 
     */
    int getEdge (int source, int destination) throws NoSuchElementException;    
    
}
