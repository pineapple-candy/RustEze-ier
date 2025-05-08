package org.firstinspires.ftc.teamcode.PathSystem;

import org.firstinspires.ftc.teamcode.PathSystem.Nodes.MoveNode;
import org.firstinspires.ftc.teamcode.PathSystem.Nodes.Node;
import org.firstinspires.ftc.teamcode.PathSystem.Nodes.WaitNode;

import java.util.ArrayList;

public class Path {
    private ArrayList<Node> nodeArray; // This variable w
    Path(ArrayList<Node> builtPath) {
        this.nodeArray = builtPath;
    }

    public void addNode(Node node) {
        nodeArray.add(node);
    }

    public int getSize() {
        return nodeArray.size();
    }

    public ArrayList<Node> getArray() {
        return nodeArray;
    }

    public Node getNode(int index) { return nodeArray.get(index); }

    // Path logic

    int currentIndex = 0;

    public boolean update() {
        Node currentNode = nodeArray.get(currentIndex);
        if (currentNode.update()) {
            return true;
        } else {
            currentIndex += 1;

            if (currentIndex >= nodeArray.size()) {
                return false;
            }

            return true;
        }
    }
}
