package org.firstinspires.ftc.teamcode.PathSystem.Nodes;

public class MoveNode extends Node {
    private double distance;
    private double direction;
    private double speed;

    public MoveNode(double distance, double speed, double direction) {
        this.distance = distance;
        this.direction = direction;
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
