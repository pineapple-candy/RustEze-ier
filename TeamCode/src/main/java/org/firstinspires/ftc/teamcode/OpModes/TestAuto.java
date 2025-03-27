package org.firstinspires.ftc.teamcode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.PathSystem.Nodes.MoveNode;

import org.firstinspires.ftc.teamcode.PathSystem.Path;
import org.firstinspires.ftc.teamcode.PathSystem.PathBuilder;

// Experimental class

public class TestAuto extends LinearOpMode {

    Path mySickPath;

    @Override
    public void runOpMode(){
        mySickPath = new PathBuilder()
                .moveForward(1,2)
                .addNode(new MoveNode(1,2,30))
                .waitSeconds(2)
                .strafeRight(4,0.5)
                .strafeRight(2,1)
                .rotatePath(2,0.3)
                .moveInDirection(2,2,90)
                .build();

        // Experimenting w/ methods

        double pathSize = mySickPath.getSize();

        addForward(mySickPath);
    }

    private void addForward(Path path) {
        path.addNode(new MoveNode(5,0.3,90));
    }
}
