package BFS;


import java.util.*;
import java.util.stream.Collectors;

public class BFSUsingNeighbour {


    static ArrayList<Node> nodes = new ArrayList<Node>();
    private Queue<Node> queue;

    public BFSUsingNeighbour() {
        queue = new LinkedList<Node>();
    }

    public static void main(String arg[]) {

        Node node40 = new Node(40);
        Node node10 = new Node(10);
        Node node20 = new Node(20);
        Node node30 = new Node(30);
        Node node60 = new Node(60);
        Node node50 = new Node(50);
        Node node70 = new Node(70);

        node40.addneighbours(node10);
        node40.addneighbours(node20);
        node10.addneighbours(node30);
        node20.addneighbours(node10);
        node20.addneighbours(node30);
        node20.addneighbours(node60);
        node20.addneighbours(node50);
        node30.addneighbours(node60);
        node60.addneighbours(node70);
        node50.addneighbours(node70);
        System.out.println("The BFS traversal of the graph is ");
        BFSUsingNeighbour bfsExample = new BFSUsingNeighbour();
        bfsExample.bfs(node40);

        System.out.println();
        System.out.println("using java 8");

        bfsExample.searchByBreadth(node40).stream().forEach(System.out::println);

    }

    public void bfs(Node node) {
        queue.add(node);
        node.visited = true;
        while (!queue.isEmpty()) {

            Node element = queue.remove();
            System.out.print(element.data + " ");
            List<Node> neighbours = element.getNeighbours();
            for (int i = 0; i < neighbours.size(); i++) {
                Node n = neighbours.get(i);
                if (n != null && !n.visited) {
                    queue.add(n);
                    n.visited = true;

                }
            }

        }
    }


    public LinkedHashSet<Node> searchByBreadth(Node n) {
        List<Node> visitedNodes = new LinkedList<>();
        List<Node> unvisitedNodes = Arrays.asList(n);

        while (!unvisitedNodes.isEmpty()) {
            List<Node> newNodes = unvisitedNodes
                    .stream()
                    .map(Node::getNeighbours)
                    .flatMap(List::stream)
                    .filter(node -> !visitedNodes.contains(node))
                    .collect(Collectors.toList());

            visitedNodes.addAll(unvisitedNodes);
            unvisitedNodes = newNodes;
        }

        return new LinkedHashSet<>(visitedNodes);


    }

    @Override
    public String toString() {
        return "BFSUsingNeighbour [queue=" + queue + "]";
    }

    static class Node {
        int data;
        boolean visited;
        List<Node> neighbours;

        Node(int data) {
            this.data = data;
            this.neighbours = new ArrayList<>();

        }

        public void addneighbours(Node neighbourNode) {
            this.neighbours.add(neighbourNode);
        }

        public List<Node> getNeighbours() {
            return neighbours;
        }

        public void setNeighbours(List<Node> neighbours) {
            this.neighbours = neighbours;
        }

        @Override
        public String toString() {
            return String.valueOf(data);
        }
    }
}


