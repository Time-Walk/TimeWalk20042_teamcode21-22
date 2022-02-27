package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Autonomous(name="Красный.Утка,Доставка,Склад", group="К")
public class RedUtkaGruzSklad extends LinearOpMode { 
    @Override
    public void runOpMode() throws InterruptedException {
        Robot2021 R = new Robot2021();
        R.initFields(telemetry, this, hardwareMap);
        R.init();
        waitForStart();

        //okay, let's go!
		R.back(120);
		R.rotate(90);
		R.back(30);
		R.drop();
		R.go(60);
		R.rotateForTime(1000, 0.5);
		R.back(60);
		R.rotate(-10);
		R.back(40);
		R.duckVoid(-1);
		R.go(30);
		R.rotate(-80);
		R.goForward(2000, -0.8);

    }

}
