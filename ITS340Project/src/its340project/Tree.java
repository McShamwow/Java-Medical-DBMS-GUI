package its340project;
import java.util.Scanner;
import javax.swing.*;
import java.util.ArrayList;

public class Tree {
    Node root;
    Scanner input = new Scanner(System.in);
    
    public Tree(){
        root = null;
    }
    
    public Node getRoot(){
        return this.root;
    }
    
    public void createRoot(int newRootNodeID, String newQuestion){
        root = new Node(newRootNodeID, newQuestion);
    }
    
    public void addYesNode(int existingNodeID, int newNodeID, String newQuestion){
        if(root == null){
            //System.out.println("ERROR: no root node." + " Try using the createNode method");
        }
        else{
            if(searchTreeAndAddYesNode(root, existingNodeID, newNodeID, newQuestion)){
                //System.out.println("Added node " + newNodeID + " to Yes branch ");
            }
            else{
                //System.out.println("Node " + existingNodeID + " not found.");
            }
        }
    }
    
    public void addNoNode(int existingNodeID, int newNodeID, String newQuestion){
        if(root == null){
            //System.out.println("ERROR: no root node." + " Try using the createNode method");
        }
        else{
            if(searchTreeAndAddNoNode(root, existingNodeID, newNodeID, newQuestion)){
                //System.out.println("Added node " + newNodeID + " to Yes branch ");
            }
            else{
                //System.out.println("Node " + existingNodeID + " not found.");
            }
        }
    }    
    
    private boolean searchTreeAndAddYesNode(Node currentNode, int existingNodeID, int newNodeID, String question){
        if(currentNode.nodeID == existingNodeID){
            if(currentNode.yesBranch == null){
                currentNode.yesBranch = new Node(newNodeID, question);
            }
            else{
                System.out.println("WARNING: Overwritting previous Yes node.");
                currentNode.yesBranch = new Node(newNodeID, question);
            }
            return true;
        }
        else{ // if node not found, walk through tree to next node
            if(currentNode.yesBranch != null){
                if(searchTreeAndAddYesNode(currentNode.yesBranch, existingNodeID, newNodeID, question)){
                    return true;
                }
                else{
                    if(currentNode.noBranch != null){ // explore No branch
                        return searchTreeAndAddYesNode(currentNode.noBranch, existingNodeID, newNodeID, question);
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return false;
    }
    
    private boolean searchTreeAndAddNoNode(Node currentNode, int existingNodeID, int newNodeID, String question){
        if(currentNode.nodeID == existingNodeID){
            if(currentNode.noBranch == null){
                currentNode.noBranch = new Node(newNodeID, question);
            }
            else{
                System.out.println("WARNING: Overwritting previous No node.");
                currentNode.noBranch = new Node(newNodeID, question);
            }
            return true;
        }
        else{ // if node not found, walk through tree to next node
            if(currentNode.yesBranch != null){
                if(searchTreeAndAddNoNode(currentNode.yesBranch, existingNodeID, newNodeID, question)){
                    return true;
                }
                else{
                    if(currentNode.noBranch != null){ // explore Yes branch
                        return searchTreeAndAddNoNode(currentNode.noBranch, existingNodeID, newNodeID, question);
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return false;
    }
    
    public void queryBTree(ArrayList list){ 
        queryBTree(root, list);
        
    }
    
    public void queryBTree(Node currentNode, ArrayList list){ // walk through tree, ask questions
//        if(currentNode.yesBranch == null){
//            if(currentNode.noBranch == null){
//                System.out.println(currentNode.question);
//            }
//            else{
//                System.out.println("ERROR: Missing yes branch at " + currentNode.question);
//            }
//            return;
//        }
//        if(currentNode.noBranch == null){
//            System.out.println("ERROR: Missing no branch at " + currentNode.question);
//            return;
//        }
        try{
            askQuestion(currentNode, list);
        }
        catch(Exception e){           
        }
        
    }
    
    private void askQuestion(Node currentNode, ArrayList list){
        int reply = JOptionPane.showConfirmDialog(null, currentNode.question, "Interview question", JOptionPane.YES_NO_OPTION);
        if(reply == JOptionPane.YES_OPTION){
            queryBTree(currentNode.yesBranch, list);
            list.add(currentNode.question + ", " + "YES");
        }
        else{
            queryBTree(currentNode.noBranch, list);
            list.add(currentNode.question + ", " + "NO");
        }

    }

}

