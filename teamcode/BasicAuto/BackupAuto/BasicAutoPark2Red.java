package org.firstinspires.ftc.teamcode.BasicAuto.BackupAuto;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.internal.camera.delegating.DelegatingCaptureSequence;

@Autonomous(name = "BasicAutoPark2Red", group = "Red")

public class BasicAutoPark2Red extends OpMode {

    private DcMotor leftDrive = null;
    private DcMotor rightDrive = null;
    private DcMotor backRightDrive = null;
    private DcMotor backLeftDrive = null;
    private final ElapsedTime runtime = new ElapsedTime();

    @Override
    public void init() {
        double lastTime;

        leftDrive = hardwareMap.get(DcMotor.class, "front Left");
        rightDrive = hardwareMap.get(DcMotor.class, "front Right");
        backLeftDrive = hardwareMap.get(DcMotor.class, "back Left");
        backRightDrive = hardwareMap.get(DcMotor.class, "back Right");

        leftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backLeftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        telemetry.addData("Status", "Initialized");
        telemetry.update();


    }

    @Override
    public void init_loop() {
        leftDrive.setDirection(DcMotorSimple.Direction.REVERSE);
        backRightDrive.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    @Override
    public void start() {
        double lastTime;
        runtime.reset();
        lastTime = getRuntime();

    }


    @Override
    public void loop() {

        while (getRuntime() <= 2.2) {
            leftDrive.setPower(.5);
            rightDrive.setPower(.5);
            backRightDrive.setPower(.5);
            backLeftDrive.setPower(.5);
            telemetry.addData("Time", getRuntime());
            telemetry.update();
        }
        leftDrive.setPower(0);
        rightDrive.setPower(0);
        backRightDrive.setPower(0);
        backLeftDrive.setPower(0);
        while (getRuntime() >= 2.2 && getRuntime() <= 4) {
            leftDrive.setPower(.5);
            rightDrive.setPower(-.5);
            backRightDrive.setPower(.5);
            backLeftDrive.setPower(-.5);
            telemetry.addData("Time", getRuntime());
            telemetry.update();
        }
    }

    @Override
    public void stop() {
    }
}
