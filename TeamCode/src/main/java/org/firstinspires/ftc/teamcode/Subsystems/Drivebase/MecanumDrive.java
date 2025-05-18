package org.firstinspires.ftc.teamcode.Subsystems.Drivebase;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.util.Util;

import java.util.HashMap;
import java.util.Map;

public class MecanumDrive extends Drive {

    private boolean FOD = false;

    private static String LBName = Util.LB_DRIVE_NAME;
    private static String LFName = Util.LF_DRIVE_NAME;
    private static String RBName = Util.RB_DRIVE_NAME;
    private static String RFName = Util.RF_DRIVE_NAME;

    public MecanumDrive(HardwareMap hardwareMap, boolean FOD) {
        super(motorHashMap(hardwareMap));
        brakeMotors();

        this.FOD = FOD;

        // Reverse motors as needed.
        reverseMotor(Util.LF_DRIVE_NAME);
    }

    private static HashMap<String,DcMotor> motorHashMap(HardwareMap hardwareMap) {
        HashMap<String,DcMotor> motorMap = new HashMap<>();

        // Gives a hash map of all of the motors.
        motorMap.put(LBName, hardwareMap.get(DcMotor.class,Util.LB_DRIVE_NAME));
        motorMap.put(LFName, hardwareMap.get(DcMotor.class,Util.LF_DRIVE_NAME));
        motorMap.put(RBName, hardwareMap.get(DcMotor.class,Util.RB_DRIVE_NAME));
        motorMap.put(RFName, hardwareMap.get(DcMotor.class,Util.RF_DRIVE_NAME));

        return motorMap;
    }

    @Override
    public void drive(Gamepad gamepad) {

        // Thanks GoBuilda for code
        double y = -gamepad.left_stick_y; // Remember, Y stick value is reversed
        double x = gamepad.left_stick_x * 1.1; // Counteract imperfect strafing
        double rx = gamepad.right_stick_x;

        // Denominator is the largest motor power (absolute value) or 1
        // This ensures all the powers maintain the same ratio,
        // but only if at least one is out of the range [-1, 1]
        double denominator = Math.max(Math.abs(y) + Math.abs(x) + Math.abs(rx), 1);
        double LFPower = (y + x + rx) / denominator;
        double LBPower = (y - x + rx) / denominator;
        double RFPower = (y - x - rx) / denominator;
        double RBPower = (y + x - rx) / denominator;

        powerMotor(LFName,LFPower);
        powerMotor(LBName,LBPower);
        powerMotor(RFName,LBPower);
        powerMotor(RBName,RBPower);
    }

}
