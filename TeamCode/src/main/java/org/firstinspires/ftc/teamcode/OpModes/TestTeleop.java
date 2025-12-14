package org.firstinspires.ftc.teamcode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Subsystems.Drivebase.Drive;
import org.firstinspires.ftc.teamcode.Subsystems.Drivebase.TankDrive;

// Experimental class

public class TestTeleop extends LinearOpMode {

    @Override
    public void runOpMode(){

//        Drive myMecanumDrivebase = new MecanumDrive(hardwareMap);
        Drive myTankDrivebase = new TankDrive(hardwareMap);

        waitForStart();

        while (opModeIsActive() && !isStopRequested()) {
            myTankDrivebase.drive(gamepad1);
        }
    }

}
