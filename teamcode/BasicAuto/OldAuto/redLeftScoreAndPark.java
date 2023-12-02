/*//Imports stuff
package org.firstinspires.ftc.teamcode.BasicAuto.OldAuto;
import static org.firstinspires.ftc.teamcode.BasicAuto.pipelines.auto.*;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

//Sets name for code and groups it for easy access in Driver Station
@Autonomous(name = "redLeftScoreAndPark", group = "redScoreAndPark")
public class redLeftScoreAndPark extends LinearOpMode {


    //Sets variable for power method


    @Override
    public void runOpMode() {

        leftDrive = hardwareMap.get(DcMotor.class, "front Left");
        rightDrive = hardwareMap.get(DcMotor.class, "front Right");
        backLeftDrive = hardwareMap.get(DcMotor.class, "back Left");
        backRightDrive = hardwareMap.get(DcMotor.class, "back Right");
        Launchmotor = hardwareMap.get(DcMotor.class, "Launch Motor");
        Servo = hardwareMap.get(com.qualcomm.robotcore.hardware.Servo.class, "servo");
        Servo2 = hardwareMap.get(Servo.class, "servo2");

        leftDrive.setDirection(DcMotorSimple.Direction.REVERSE);
        backRightDrive.setDirection(DcMotorSimple.Direction.REVERSE);
        Servo.setDirection(com.qualcomm.robotcore.hardware.Servo.Direction.REVERSE);

        servoLeftClose();
        servoRightClose();

        waitForStart();

        //Strafes to the left for 1 second
        Reset();
        strafeRight(200,-200,0.6,-0.6);
        sleep(1000);
        stopDrive();
        Reset();

        //Drive backwards for 3 second
        Reset();
        drive(-2500, -0.6);
        sleep(3050);
        stopDrive();
        Reset();


        Reset();
        strafeRight(1200,-1200,0.6,-0.6);
        sleep(2000);
        stopDrive();
        Reset();

        //Drive backwards for 1 second
        Reset();
        drive(-1290,-0.6);
        sleep(2000);
        stopDrive();
        Reset();

        //Lift arm
        Reset();
        arm(-1300, -0.17);
        Launchmotor.getZeroPowerBehavior();
        sleep(4000);
        driveReset();


        //Robot drops pixel on back board

        servoLeftOpen();
        servoRightOpen();
        sleep(2000);

        Reset();
        arm(1100, -0.4);
        Launchmotor.getZeroPowerBehavior();
        sleep(1100);
        driveReset();

        Reset();

        stop();
    }}


*/

