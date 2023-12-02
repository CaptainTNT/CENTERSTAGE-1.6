package org.firstinspires.ftc.teamcode.Calabration;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "Robot_Wheels_Calabration", group = "Calabration")
public class Robot_Wheels_Calabration extends OpMode {

    private DcMotor leftDrive = null;
    private DcMotor rightDrive = null;
    private DcMotor backRightDrive = null;
    private DcMotor backLeftDrive = null;
    private DcMotor LaunchMotor = null;
    private Servo servo = null;
    private DcMotor motor = null;

    @Override
    public void init() {
        telemetry.addData("Warning", "Robot will run all 4 motors at max power until the robot is stopped.");
        telemetry.update();
    }

    public void loop(){

        leftDrive = hardwareMap.get(DcMotor.class, "front Left");
        rightDrive = hardwareMap.get(DcMotor.class, "front Right");
        backLeftDrive = hardwareMap.get(DcMotor.class, "back Left");
        backRightDrive = hardwareMap.get(DcMotor.class, "back Right");
        LaunchMotor = hardwareMap.get(DcMotor.class, "Launch Motor");
        servo = hardwareMap.get(Servo.class, "servo");
        motor = hardwareMap.get(DcMotor.class, "motor");


        backRightDrive.setDirection(DcMotorSimple.Direction.REVERSE);
        leftDrive.setDirection(DcMotorSimple.Direction.REVERSE);

        backLeftDrive.setPower(1);
        backRightDrive.setPower(1);
        leftDrive.setPower(1);
        rightDrive.setPower(1);

    }

    @Override
    public void stop() {
        //STOP
    }

}
