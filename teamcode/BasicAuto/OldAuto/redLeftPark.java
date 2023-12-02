/*//Imports stuff
package org.firstinspires.ftc.teamcode.BasicAuto.OldAuto;
import static org.firstinspires.ftc.teamcode.BasicAuto.pipelines.auto.*;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

//Sets name for code and groups it for easy access in Driver Station
@Autonomous(name = "redLeftPark", group = "redPark")
public class redLeftPark extends LinearOpMode {

    //Sets variable for power method


    @Override
    public void runOpMode() {

        leftDrive = hardwareMap.get(DcMotor.class, "front Left");
        rightDrive = hardwareMap.get(DcMotor.class, "front Right");
        backLeftDrive = hardwareMap.get(DcMotor.class, "back Left");
        backRightDrive = hardwareMap.get(DcMotor.class, "back Right");
        Launchmotor = hardwareMap.get(DcMotor.class, "Launch Motor");

        leftDrive.setDirection(DcMotorSimple.Direction.REVERSE);
        backRightDrive.setDirection(DcMotorSimple.Direction.REVERSE);

        Reset();

        telemetry.addData("Starting at",  "%7d :%7d",
                leftDrive.getCurrentPosition(),
                rightDrive.getCurrentPosition());
                backRightDrive.getCurrentPosition();
                backLeftDrive.getCurrentPosition();
                Launchmotor.getCurrentPosition();
        telemetry.update();

        waitForStart();

        Reset();
        strafeRight(200,0.6);
        sleep(1000);
        stopDrive();
        Reset();

        //Drive backwards for 3 second
        Reset();
        drive(-4000, -0.6);
        sleep(3000);
        stopDrive();
        Reset();

        stop();
    }}




*/