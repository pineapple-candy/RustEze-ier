package org.firstinspires.ftc.teamcode.Subsystems.Drivebase;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.util.Util;

import java.util.HashMap;
import java.util.Map;

public class MecanumDrive extends Drive {

    public MecanumDrive(HardwareMap hardwareMap) {
        super(motorHashMap(hardwareMap));
        brakeMotors();

        // Reverse motors as needed.
        reverseMotor(Util.LF_DRIVE_NAME);
    }

    private static HashMap<String,DcMotor> motorHashMap(HardwareMap hardwareMap) {
        HashMap<String,DcMotor> motorMap = new HashMap<>();

        // Gives a hash map of all of the motors.
        motorMap.put(Util.LB_DRIVE_NAME, hardwareMap.get(DcMotor.class,Util.LB_DRIVE_NAME));
        motorMap.put(Util.LF_DRIVE_NAME, hardwareMap.get(DcMotor.class,Util.LF_DRIVE_NAME));
        motorMap.put(Util.RB_DRIVE_NAME, hardwareMap.get(DcMotor.class,Util.RB_DRIVE_NAME));
        motorMap.put(Util.RF_DRIVE_NAME, hardwareMap.get(DcMotor.class,Util.RF_DRIVE_NAME));

        return motorMap;
    }

    @Override
    public void drive(Gamepad gamepad) {

    }

}
