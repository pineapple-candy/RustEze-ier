package org.firstinspires.ftc.teamcode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.PathSystem.Nodes.MoveNode;

import org.firstinspires.ftc.teamcode.PathSystem.Nodes.Node;
import org.firstinspires.ftc.teamcode.PathSystem.Nodes.WaitNode;
import org.firstinspires.ftc.teamcode.PathSystem.Path;
import org.firstinspires.ftc.teamcode.PathSystem.PathBuilder;
import org.firstinspires.ftc.teamcode.Subsystems.Drivebase.Drive;
import org.firstinspires.ftc.teamcode.Subsystems.Drivebase.MecanumDrive;
import org.firstinspires.ftc.teamcode.Subsystems.Drivebase.TankDrive;

import java.util.ArrayList;

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
