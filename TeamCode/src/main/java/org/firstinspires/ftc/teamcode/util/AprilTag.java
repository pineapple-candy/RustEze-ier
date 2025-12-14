package org.firstinspires.ftc.teamcode.util;

public class AprilTag {

    private int aprilTagID;
    private Vector2D positionVector;

    public AprilTag(int id, Vector2D positionVector) {
        aprilTagID = id;
        this.positionVector = positionVector;
    }

    public int getID() {
        return aprilTagID;
    }

    public Vector2D getVector() {
        return positionVector;
    }
}
