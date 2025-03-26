package org.firstinspires.ftc.teamcode.PathSystem;

import org.firstinspires.ftc.teamcode.PathSystem.Nodes.MoveNode;
import org.firstinspires.ftc.teamcode.PathSystem.Nodes.Node;
import org.firstinspires.ftc.teamcode.PathSystem.Nodes.WaitNode;

import java.util.ArrayList;

public class Path {
    private ArrayList<Node> nodeArray = new ArrayList<Node>(); // This variable w
    public Path(ArrayList<Node> builtPath) {
        this.nodeArray = builtPath;
    }

    private void addNode(Node node) {
        nodeArray.add(node);
    }

    private int getSize() {
        return nodeArray.size();
    }

    private ArrayList<Node> getArray() {
        return nodeArray;
    }

//    public static class PathBuilder {
//        private ArrayList<Node> builderPath;
//
//
//        public PathBuilder addNode(Node node) {
//            builderPath.add(node);
//            return this;
//        }
//
//        public Path build() {
//            return new Path(builderPath);
//        }
//
//    }
}
