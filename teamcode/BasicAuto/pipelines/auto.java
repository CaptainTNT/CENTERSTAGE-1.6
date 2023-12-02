//Imports stuff
package org.firstinspires.ftc.teamcode.BasicAuto.pipelines;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

//Sets name for code and disables it
@Disabled
@Autonomous(name = "auto")
public class auto extends OpMode {

    //Set values to variables for motors
    public static DcMotor leftDrive = null;
    public static DcMotor rightDrive = null;
    public static DcMotor backRightDrive = null;
    public static DcMotor backLeftDrive = null;
    public static DcMotor Launchmotor = null;
    public static Servo Servo = null;
    public static Servo Servo2 = null;

    public static void strafeLeft(int target, double power) {
        leftDrive.setTargetPosition(-target);
        rightDrive.setTargetPosition(target);
        backRightDrive.setTargetPosition(-target);
        backLeftDrive.setTargetPosition(target);

        leftDrive.setPower(-power);
        rightDrive.setPower(power);
        backRightDrive.setPower(-power);
        backLeftDrive.setPower(power);

        leftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }

    public static void strafeRight(int target, double power) {
        leftDrive.setTargetPosition(target);
        rightDrive.setTargetPosition(-target);
        backRightDrive.setTargetPosition(target);
        backLeftDrive.setTargetPosition(-target);

        leftDrive.setPower(power);
        rightDrive.setPower(power);
        backRightDrive.setPower(power);
        backLeftDrive.setPower(power);

        leftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);


    }

    public static void spinLeft(int target, double power) {
        leftDrive.setTargetPosition(-target);
        rightDrive.setTargetPosition(target);
        backRightDrive.setTargetPosition(target);
        backLeftDrive.setTargetPosition(-target);

        leftDrive.setPower(power);
        rightDrive.setPower(power);
        backRightDrive.setPower(power);
        backLeftDrive.setPower(power);

        leftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);


    }

    public static void spinRight(int target, double power) {
        leftDrive.setTargetPosition(target);
        rightDrive.setTargetPosition(-target);
        backRightDrive.setTargetPosition(-target);
        backLeftDrive.setTargetPosition(target);

        leftDrive.setPower(power);
        rightDrive.setPower(power);
        backRightDrive.setPower(power);
        backLeftDrive.setPower(power);

        leftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);


    }



    public static void drive(int target, double power) {
        leftDrive.setTargetPosition(target);
        rightDrive.setTargetPosition(target);
        backRightDrive.setTargetPosition(target);
        backLeftDrive.setTargetPosition(target);

        leftDrive.setPower(power);
        rightDrive.setPower(power);
        backRightDrive.setPower(power);
        backLeftDrive.setPower(power);

        leftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);

    }


    public static void arm (int target, double power) {
        Launchmotor.setTargetPosition(target);

        Launchmotor.setPower(power);

        Launchmotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);



    }

    public static void stopDrive() {
        leftDrive.setPower(0);
        rightDrive.setPower(0);
        backRightDrive.setPower(0);
        backLeftDrive.setPower(0);
    }

    public static void stopArm() {
        Launchmotor.setPower(0);
    }

    public static void servoLeftOpen () {
        Servo2.setPosition(1);
    }

    public static void servoRightOpen () {
        Servo.setPosition(1);
    }

    public static void servoLeftClose () {
        Servo2.setPosition(0);
    }

    public static void servoRightClose () {
        Servo.setPosition(0);
    }

    public static void Reset() {
        leftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backLeftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        Launchmotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        leftDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backRightDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backLeftDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        Launchmotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

    }

    public static void driveReset() {
        leftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backLeftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);


        leftDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backRightDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backLeftDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

    }

    @Override
    public void init() {

    }

    @Override
    public void loop() {

    }
}






