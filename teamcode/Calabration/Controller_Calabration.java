package org.firstinspires.ftc.teamcode.Calabration;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Controller_Calabration", group = "Calabration")
public class Controller_Calabration extends OpMode {
    @Override
    public void init() {
        telemetry.addData("Note", "This code will allow you to play around with the joysticks and see their values.");
    }

    public void loop(){

        telemetry.addData("Gamepad1_leftstick_y", gamepad1.left_stick_y);
        telemetry.addData("Gamepad1_leftstick_x", gamepad1.left_stick_x);
        telemetry.addData("Gamepad1_Rightstick_x", gamepad1.right_stick_x);
        telemetry.addData("Gamepad1_rightstick_y", gamepad1.right_stick_y);
        telemetry.update();
    }
}
