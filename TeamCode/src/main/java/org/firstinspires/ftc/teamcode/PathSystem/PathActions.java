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
