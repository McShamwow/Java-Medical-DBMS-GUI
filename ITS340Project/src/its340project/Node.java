package its340project;

public class Node {
    public int nodeID;
    public String question;
    public Node yesBranch;
    public Node noBranch;
    
    public Node(int newNodeID, String newQuestion){
        this.nodeID = newNodeID;
        this.question = newQuestion;
    }
    
    public void displayNode(){
        System.out.println("NodeID = " + nodeID + ", " + question);
    }
}
