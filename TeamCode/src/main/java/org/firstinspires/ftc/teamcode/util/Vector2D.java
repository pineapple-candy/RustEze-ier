package org.firstinspires.ftc.teamcode.util;

import androidx.annotation.NonNull;

public class Vector2D {

    // Magnitude and Direction values
    private double i;
    private double j;

    public Vector2D(double na, double nb, boolean isCart) {
        if (!isCart) {
            i = na * Math.cos(Math.toRadians(nb));
            j = na * Math.sin(Math.toRadians(nb));
        } else {
            i = na;
            j = nb;
        }
    }

    public double getMag() {
        double m = Math.sqrt(Math.pow(j,2) + Math.pow(i,2));
        return m; // <-- calculate M
    }

    public double getDir(){
        double d = Math.toDegrees(Math.atan2(j, i)); // hopefully fixed
        return d;
    }

    public Vector2D rot(double rot) {
        return new Vector2D(getMag(), (getDir() + rot)%360, false);
    }

    public Vector2D mul(Vector2D vector1){
        return new Vector2D(i * vector1.i, j * vector1.j, true);
    }

    public Vector2D vecrot(Vector2D vector1){
        return new Vector2D(getMag(),(vector1.getDir() + getDir())%360, false);
    }
    public Vector2D add(Vector2D vector1){
        return new Vector2D(i + vector1.getX(), j + vector1.getY(), true);
    }
    public Vector2D sub(Vector2D vector1) {
        return new Vector2D(i - vector1.getX(), j - vector1.getY(), true);
    }

    public double getX() {
        return i;
    }

    public double getY() {
        return j;
    }


    @NonNull
    public String toString() {
        return "(" + i + "," + j + ")";
    }

}
