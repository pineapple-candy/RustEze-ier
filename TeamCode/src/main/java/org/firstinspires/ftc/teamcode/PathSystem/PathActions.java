package org.firstinspires.ftc.teamcode.PathSystem;

import org.firstinspires.ftc.teamcode.PathSystem.Nodes.MoveNode;
import org.firstinspires.ftc.teamcode.PathSystem.Nodes.Node;
import org.firstinspires.ftc.teamcode.PathSystem.Nodes.WaitNode;

public class PathActions extends Path.PathBuilder {
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

    @Override
    public PathActions addNode(Node node) {  // Override to return PathActions
        super.addNode(node);
        return this;
    }
}
