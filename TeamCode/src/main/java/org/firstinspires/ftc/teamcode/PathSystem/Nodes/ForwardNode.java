package org.firstinspires.ftc.teamcode.PathSystem.Nodes;

public class ForwardNode extends Node {
    private double distance;
    private double speed;

    public ForwardNode(double distance, double speed) {
        this.distance = distance;
        this.speed = speed;
    }

    private boolean started = false;

    @Override
    public boolean update() {
        if (!started) {
            started = true;
        }

        return false;
    }
}
