package org.firstinspires.ftc.teamcode.Subsystems.Drivebase;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.util.Util;

import java.util.HashMap;
import java.util.Map;

public class TankDrive extends Drive{

    public TankDrive(HardwareMap hardwareMap) {
        super(motorHashMap(hardwareMap));
        brakeMotors();
    }

    private static HashMap<String,DcMotor> motorHashMap(HardwareMap hardwareMap) {
        HashMap<String,DcMotor> motorMap = new HashMap<>();

        // Gives a hash map of all of the motors.
        motorMap.put(Util.LEFT_DRIVE_NAME, hardwareMap.get(DcMotor.class,Util.RIGHT_DRIVE_NAME));
        motorMap.put(Util.RIGHT_DRIVE_NAME, hardwareMap.get(DcMotor.class,Util.RIGHT_DRIVE_NAME));

        return motorMap;
    }

    @Override
    public void drive(Gamepad gamepad) {

    }

}
