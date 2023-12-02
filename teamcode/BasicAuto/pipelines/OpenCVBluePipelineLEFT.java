package org.firstinspires.ftc.teamcode.BasicAuto.pipelines;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;
import org.openftc.easyopencv.OpenCvCamera;
import org.openftc.easyopencv.OpenCvCameraFactory;
import org.openftc.easyopencv.OpenCvCameraRotation;
import org.openftc.easyopencv.OpenCvPipeline;

@Autonomous(name = "OpenCVBluePipelineLEFT", group = "Calabration")
public class OpenCVBluePipelineLEFT extends LinearOpMode {
    OpenCvCamera webcam;
    SamplePipeline pipeline;

    @Override
    public void runOpMode() {
        int cameraMonitorViewId = hardwareMap.appContext.getResources().getIdentifier("cameraMonitorViewId", "id", hardwareMap.appContext.getPackageName());
        webcam = OpenCvCameraFactory.getInstance().createWebcam(hardwareMap.get(WebcamName.class, "Webcam 1"), cameraMonitorViewId);

        pipeline = new SamplePipeline();
        webcam.setPipeline(pipeline);

        webcam.openCameraDeviceAsync(new OpenCvCamera.AsyncCameraOpenListener()
        {
            @Override
            public void onOpened()
            {
                webcam.startStreaming(320, 240, OpenCvCameraRotation.UPRIGHT);
            }

            @Override
            public void onError(int errorCode)
            {

            }
        });
        waitForStart();

        while (opModeIsActive()) {
            telemetry.addData("Type", pipeline.getType());
            telemetry.addData("Average", pipeline.getAverage());
            telemetry.update();
            sleep(50);
        }
    }

    public static class SamplePipeline extends OpenCvPipeline {
        private static final Scalar BLUE = new Scalar(0, 0, 255);
        private static final int THRESHOLD = 109;

        Point topLeft = new Point(1, 1);
        Point bottomRight = new Point(160, 160);
        Point topLeft2 = new Point(160,1);
        Point bottomRight2 = new Point(320, 160);
        //TODO: TOP LEFT MAX 0,0 BOTTOM RIGHT MAX 320,240
        Mat region1_Cb;
        Mat region2_Cb;
        Mat YCrCb = new Mat();
        Mat Cb = new Mat();

        private volatile int average;
        private volatile int average2;
        private volatile String type = "LEFT";

        private void inputToCb(Mat input) {
            Imgproc.cvtColor(input, YCrCb, Imgproc.COLOR_RGB2YCrCb);
            Core.extractChannel(YCrCb, Cb, 2);
        }

        @Override
        public void init(Mat input) {
            inputToCb(input);
            region1_Cb = Cb.submat(new Rect(topLeft, bottomRight));

            region2_Cb = Cb.submat(new Rect(topLeft2, bottomRight2));


        }

        @Override
        public Mat processFrame(Mat input) {
            inputToCb(input);

            average = (int) Core.mean(region1_Cb).val[0];
            average2 = (int) Core.mean(region2_Cb).val[0];

            Imgproc.rectangle(input, topLeft, bottomRight, BLUE, 2);
            Imgproc.rectangle(input, topLeft2, bottomRight2, BLUE, 2);

            if (average > average2) {
                type = "RIGHT";
            } else if (average < average2) {
                type = "MIDDLE";
            } else if (average2 > 120){
                type = "LEFT";
            }


            return input;
        }

        public String getType() {
            return type;
        }

        public int getAverage() {
            return average;
        }

    }
}
