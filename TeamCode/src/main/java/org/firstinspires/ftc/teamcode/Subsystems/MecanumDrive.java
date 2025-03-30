package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class MecanumDrive {
    private DcMotor LF;
    private DcMotor LB;
    private DcMotor RF;
    private DcMotor RB;

    public MecanumDrive(HardwareMap hardwareMap) {
        this.LF = hardwareMap.get(DcMotor.class,"1");
        this.LB = hardwareMap.get(DcMotor.class,"2");
        this.RF = hardwareMap.get(DcMotor.class,"3");
        this.RB = hardwareMap.get(DcMotor.class,"4");

        LF.setDirection(DcMotorSimple.Direction.REVERSE);

        LF.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        LB.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        RF.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        RB.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    public void setMotor(double power) {
        LF.setPower(power);
        LB.setPower(power);
        RF.setPower(power);
        RB.setPower(power);
    }

    public void moveDir(double power, double trueNorthDir) {
        // Empty methods for now
    }
}
