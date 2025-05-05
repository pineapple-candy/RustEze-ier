package org.firstinspires.ftc.teamcode.Subsystems.Drivebase;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TankDrive extends Drive{
    public TankDrive(HardwareMap hardwareMap) {
        super(
                hardwareMap.get(DcMotor.class,"Left"), // Left motor
                hardwareMap.get(DcMotor.class,"Right") // Right motor
        );
        brakeMotors();
    }
}
