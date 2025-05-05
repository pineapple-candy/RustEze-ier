package org.firstinspires.ftc.teamcode.Subsystems.Vision;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Camera {

    private Camera camera;

    public Camera(HardwareMap hardware) {
        camera = hardware.get(Camera.class,"Camera");
    }


}
