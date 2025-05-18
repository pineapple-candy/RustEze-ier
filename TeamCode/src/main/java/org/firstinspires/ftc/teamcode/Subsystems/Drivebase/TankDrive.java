package org.firstinspires.ftc.teamcode.Subsystems.Drivebase;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.util.Util;

import java.util.HashMap;
import java.util.Map;

public class TankDrive extends Drive {

    public static String LName = Util.LEFT_DRIVE_NAME;
    public static String RName = Util.RIGHT_DRIVE_NAME;

    private static final double SPEED_MULTIPLIER = 0.6;

    public TankDrive(HardwareMap hardwareMap) {
        super(motorHashMap(hardwareMap));
        brakeMotors();
    }

    private static HashMap<String,DcMotor> motorHashMap(HardwareMap hardwareMap) {
        HashMap<String,DcMotor> motorMap = new HashMap<>();

        // Gives a hash map of all of the motors.
        motorMap.put(LName, hardwareMap.get(DcMotor.class,Util.RIGHT_DRIVE_NAME));
        motorMap.put(RName, hardwareMap.get(DcMotor.class,Util.RIGHT_DRIVE_NAME));

        return motorMap;
    }

    @Override
    public void drive(Gamepad gamepad) {
        powerMotor(LName,(-gamepad.left_stick_y+gamepad.right_stick_x)*SPEED_MULTIPLIER);
        powerMotor(RName,(-gamepad.left_stick_y-gamepad.right_stick_x)*SPEED_MULTIPLIER);
    }

}
