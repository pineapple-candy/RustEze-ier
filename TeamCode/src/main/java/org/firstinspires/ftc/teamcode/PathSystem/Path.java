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

}
