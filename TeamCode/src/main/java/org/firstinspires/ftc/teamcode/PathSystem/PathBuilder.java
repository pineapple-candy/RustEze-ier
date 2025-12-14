package org.firstinspires.ftc.teamcode.PathSystem;

import org.firstinspires.ftc.teamcode.PathSystem.Nodes.ForwardNode;
import org.firstinspires.ftc.teamcode.PathSystem.Nodes.Node;
import org.firstinspires.ftc.teamcode.PathSystem.Nodes.WaitNode;

import java.util.ArrayList;

public class PathBuilder /*extends Path.PathBuilder*/ {

    private ArrayList<Node> builderPath = new ArrayList<>();

    public PathBuilder moveForward(double distance, double speed) {
        addNode(new ForwardNode(distance,speed));
        return this;
    }

    public PathBuilder waitSeconds(double seconds) {
        addNode(new WaitNode(seconds*1000));
        return this;
    }

    public PathBuilder addNode(Node node) {  // Override to return PathActions
        builderPath.add(node);
        return this;
    }

    public Path build() {
        return new Path(builderPath);
    }
}
