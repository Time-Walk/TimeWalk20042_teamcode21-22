package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Autonomous(name="КР.ГРУЗ,СКЛАД", group="КРАСНЫЙ")
public class RedGruzToSklad extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        Robot2021 R = new Robot2021();
        R.initFields(telemetry, this, hardwareMap);
        R.init();
        waitForStart();

        //okay, let's go!
        R.goForward(350, -1);
        R.drop();
        R.rotate(-60, 0.5);
        R.goForward(1400, 1);
        R.rotate(45, 0.4);
        R.vlRot();

    }

}
