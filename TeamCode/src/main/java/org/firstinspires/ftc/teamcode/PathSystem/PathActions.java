package org.firstinspires.ftc.teamcode.PathSystem;

import org.firstinspires.ftc.teamcode.PathSystem.Nodes.MoveNode;
import org.firstinspires.ftc.teamcode.PathSystem.Nodes.Node;
import org.firstinspires.ftc.teamcode.PathSystem.Nodes.WaitNode;

import java.util.ArrayList;

public class PathActions /*extends Path.PathBuilder*/ {

    private ArrayList<Node> builderPath;

    public PathActions moveForward(double distance, double speed) {
        addNode(new MoveNode(distance,speed,0));
        return this;
    }

    public PathActions strafeRight(double distance, double speed) {
        addNode(new MoveNode(distance, speed, 90));
        return this;
    }

    public PathActions moveInDirection(double distance, double speed, double trueNorthDir) {
        addNode(new MoveNode(distance,speed,trueNorthDir));
        return this;
    }

    public PathActions rotatePath(double radius, double speed) {
        addNode(new MoveNode(radius,speed,90));
        addNode(new MoveNode(radius,speed,180));
        addNode(new MoveNode(radius,speed,270));
        addNode(new MoveNode(radius,speed,360));
        return this;
    }

    public PathActions waitSeconds(double seconds) {
        addNode(new WaitNode(seconds*1000));
        return this;
    }


    public PathActions addNode(Node node) {  // Override to return PathActions
        builderPath.add(node);
        return this;
    }

    public Path build() {
        return new Path(builderPath);
    }
}
