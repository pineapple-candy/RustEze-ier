package org.firstinspires.ftc.teamcode.util;

public class LocalisationCalculator {

    public static Vector2D getPositionVector(AprilTag aprilTag, Vector2D toTagVector) {
        return aprilTag.getVector().sub(toTagVector);
    }
}
