//Imports stuff
package org.firstinspires.ftc.teamcode.BasicAuto.pipelines;

import static org.firstinspires.ftc.teamcode.BasicAuto.pipelines.auto.*;
import android.util.Size;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.telemetry.MultipleTelemetry;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.hardware.camera.BuiltinCameraDirection;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.teamcode.BasicAuto.pipelines.OpenCVRedPipelineRIGHT;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.VisionProcessor;

//Sets name for code and groups it for easy access in Driver Station
@Autonomous(name = "blueLeftDetect", group = "blueDetect")
public class blueLeftDetect extends LinearOpMode {

    //Sets variable for power method
    private OpenCVBluePipelineLEFT pipeline;
    private VisionPortal portal;



    @Override
    public void runOpMode() {
        pipeline = new OpenCVBluePipelineLEFT();
        portal = new VisionPortal.Builder()
                .setCamera(hardwareMap.get(WebcamName.class, "Webcam 1"))
                .setCameraResolution(new Size(1920, 1080))
                .setCamera(BuiltinCameraDirection.BACK)
                .addProcessor((VisionProcessor) pipeline)
                .enableLiveView(true)
                .setAutoStopLiveView(true)
                .build();
        telemetry = new MultipleTelemetry(FtcDashboard.getInstance().getTelemetry());
        while(!isStarted()){
            telemetry.addLine("auto in init");
            telemetry.addData("location", pipeline.pipeline.getType());
        }

        portal.close();


        leftDrive = hardwareMap.get(DcMotor.class, "front Left");
        rightDrive = hardwareMap.get(DcMotor.class, "front Right");
        backLeftDrive = hardwareMap.get(DcMotor.class, "back Left");
        backRightDrive = hardwareMap.get(DcMotor.class, "back Right");
        Launchmotor = hardwareMap.get(DcMotor.class, "Launch Motor");
        Servo = hardwareMap.get(Servo.class, "servo");
        Servo2 = hardwareMap.get(Servo.class, "servo2");

        leftDrive.setDirection(DcMotorSimple.Direction.REVERSE);
        backRightDrive.setDirection(DcMotorSimple.Direction.REVERSE);
        Servo.setDirection(com.qualcomm.robotcore.hardware.Servo.Direction.REVERSE);
        Reset();

        telemetry.addData("Starting at",  "%7d :%7d",
                leftDrive.getCurrentPosition(),
                rightDrive.getCurrentPosition());
                backRightDrive.getCurrentPosition();
                backLeftDrive.getCurrentPosition();
                Launchmotor.getCurrentPosition();
        telemetry.update();

        servoLeftClose();
        servoRightClose();

        waitForStart();
        boolean Left=true;
        boolean Middle=false;
        boolean middle=false;


        if (Left) {

            Reset();
            drive(-1524, -0.4);
            sleep(3000);
            stopDrive();
            Reset();

            Reset();
            strafeRight(553, -0.4);
            sleep(2000);
            stopDrive();
            Reset();

            servoLeftOpen();
            sleep(3000);

            Reset();
            drive(-271, -0.4);
            sleep(2000);
            stopDrive();
            Reset();

            Reset();
            spinLeft(1000,0.4);
            sleep(2000);
            stopDrive();
            Reset();

            Reset();
            //arm lift code
            sleep(1000);
            stopDrive();
            driveReset();

            driveReset();
            drive(-1219,0.4);
            sleep(2000);
            stopDrive();
            driveReset();

            driveReset();
            strafeRight(900,0.4);
            sleep(1000);
            stopDrive();
            driveReset();

            driveReset();
            drive(-100,0.4);
            sleep(1000);
            stopDrive();
            driveReset();

            servoRightOpen();
            sleep(2000);

            driveReset();
            //arm down code
            sleep(2000);
            stopDrive();
            stopArm();
            Reset();


            stop();



        } else if (Middle) {

            Reset();
            drive(-1524, -0.4);
            sleep(3000);
            stopDrive();
            Reset();


            servoLeftOpen();
            sleep(3000);

            Reset();
            drive(-271, -0.4);
            sleep(2000);
            stopDrive();
            Reset();

            Reset();
            spinLeft(1000,0.4);
            sleep(2000);
            stopDrive();
            Reset();

            Reset();
            //arm lift code
            sleep(1000);
            stopDrive();
            driveReset();

            driveReset();
            drive(-1219,0.4);
            sleep(2000);
            stopDrive();
            driveReset();

            driveReset();
            strafeRight(900,0.4);
            sleep(1000);
            stopDrive();
            driveReset();

            driveReset();
            drive(-100,0.4);
            sleep(1000);
            stopDrive();
            driveReset();

            servoRightOpen();
            sleep(2000);

            driveReset();
            //arm down code
            sleep(2000);
            stopDrive();
            stopArm();
            Reset();


            stop();


        } else if (middle) {
            Reset();
            drive(-1524, -0.4);
            sleep(3000);
            stopDrive();
            Reset();

            Reset();
            strafeLeft(553, -0.4);
            sleep(2000);
            stopDrive();
            Reset();

            servoLeftOpen();
            sleep(3000);

            Reset();
            drive(-271, -0.4);
            sleep(2000);
            stopDrive();
            Reset();

            Reset();
            spinLeft(1000,0.4);
            sleep(2000);
            stopDrive();
            Reset();

            driveReset();
            drive(-1219,0.4);
            sleep(2000);
            stopDrive();
            driveReset();

            Reset();
            //arm lift code
            sleep(1000);
            stopDrive();
            driveReset();



            driveReset();
            strafeLeft(900,0.4);
            sleep(1000);
            stopDrive();
            driveReset();

            driveReset();
            drive(-100,0.4);
            sleep(1000);
            stopDrive();
            driveReset();

            servoRightOpen();
            sleep(2000);

            driveReset();
            //arm down code
            sleep(2000);
            stopDrive();
            stopArm();
            Reset();


            stop();


        }

        stop();
    }}




