package org.firstinspires.ftc.teamcode.Subsystems.Drivebase;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Gamepad;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Drive {

    protected HashMap<String,DcMotor> driveMotors = new HashMap<>();

    public Drive(HashMap<String,DcMotor> initMotors) {
        for (String motorName : initMotors.keySet()) {
            driveMotors.put(motorName,initMotors.get(motorName));
        }
    }
    public void powerMotors(double speed) {
        for (DcMotor motor : driveMotors.values()) {
            motor.setPower(speed);
        }
    }
    public void setMotorNeutral(DcMotor.ZeroPowerBehavior mode) {
        for (DcMotor motor : driveMotors.values()) {
            motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        }
    }
    public void brakeMotors() {
        setMotorNeutral(DcMotor.ZeroPowerBehavior.BRAKE);
    }
    public void reverseMotor(String motorName) {
        driveMotors.get(motorName).setDirection(DcMotorSimple.Direction.REVERSE);
    }
    public void stop(double speed) {
        powerMotors(0);
    }
    public abstract void drive(Gamepad gamepad);

}
