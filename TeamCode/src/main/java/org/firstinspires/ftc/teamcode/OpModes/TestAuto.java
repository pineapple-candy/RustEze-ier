package org.firstinspires.ftc.teamcode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.PathSystem.Nodes.MoveNode;
import org.firstinspires.ftc.teamcode.PathSystem.Nodes.Node;

import org.firstinspires.ftc.teamcode.PathSystem.Nodes.WaitNode;
import org.firstinspires.ftc.teamcode.PathSystem.Path;
import org.firstinspires.ftc.teamcode.PathSystem.PathActions;

public class TestAuto extends LinearOpMode {

    Path mySickPath;

    @Override
    public void runOpMode(){
        mySickPath = new PathActions()
                .moveForward(1,2)
                .addNode(new MoveNode(1,2,30))
                .waitSeconds(2)
                .strafeRight(4,0.5)
                .strafeRight(2,1)
                .rotatePath(2,0.3)
                .moveInDirection(2,2,90)
                .build();
    }
}
