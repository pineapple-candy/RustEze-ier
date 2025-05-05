package org.firstinspires.ftc.teamcode.Subsystems.Drivebase;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class MecanumDrive extends Drive {

    public MecanumDrive(HardwareMap hardwareMap) {
        super(
                hardwareMap.get(DcMotor.class,"1"), // Front Right
                hardwareMap.get(DcMotor.class,"2"), // Front Left
                hardwareMap.get(DcMotor.class,"3"), // Back Right
                hardwareMap.get(DcMotor.class,"4") // Back Left
        );
        brakeMotors();
    }

}
