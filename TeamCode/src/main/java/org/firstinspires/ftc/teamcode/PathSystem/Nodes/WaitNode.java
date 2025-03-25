package org.firstinspires.ftc.teamcode.PathSystem.Nodes;

public class WaitNode extends Node {
    private double time;
    public WaitNode(double ms) {
        this.time = ms;
    }
    @Override
    public boolean update() {
        return false;
    }
}
