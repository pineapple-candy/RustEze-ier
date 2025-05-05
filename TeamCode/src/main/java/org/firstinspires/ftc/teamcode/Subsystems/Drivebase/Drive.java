package org.firstinspires.ftc.teamcode.Subsystems.Drivebase;

import com.qualcomm.robotcore.hardware.DcMotor;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Drive {
    protected ArrayList<DcMotor> driveMotors = new ArrayList<>();
    public Drive(DcMotor Left, DcMotor Right) {
        driveMotors.add(Left);
        driveMotors.add(Right);
    }

    public Drive(DcMotor FR, DcMotor FL, DcMotor BR, DcMotor BL) {
        driveMotors.add(FR);
        driveMotors.add(FL);
        driveMotors.add(BR);
        driveMotors.add(BL);
    }

    public void powerMotors(double speed) {
        for (DcMotor motor : driveMotors) {
            motor.setPower(speed);
        }
    }
    public void setMotorNeutral(DcMotor.ZeroPowerBehavior mode) {
        for (DcMotor motor : driveMotors) {
            motor.setZeroPowerBehavior(mode);
        }
    }
    public void brakeMotors() {
        setMotorNeutral(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    public void stop(double speed) {
        powerMotors(0);
    }
}
