package org.firstinspires.ftc.teamcode.constants.pipelinesOLD;


//@Autonomous(name = "OpenCVBluePipelineRIGHT", group = "Calabration")
//public class OpenCVRedPipelineRIGHT extends LinearOpMode {
//    OpenCvCamera webcam;
//    SamplePipeline pipeline;
//
//    @Override
//    public void runOpMode() {
//        int cameraMonitorViewId = hardwareMap.appContext.getResources().getIdentifier("cameraMonitorViewId", "id", hardwareMap.appContext.getPackageName());
//        webcam = OpenCvCameraFactory.getInstance().createWebcam(hardwareMap.get(WebcamName.class, "Webcam 1"), cameraMonitorViewId);
//
//        pipeline = new SamplePipeline();
//        webcam.setPipeline(pipeline);
//
//
//        webcam.openCameraDeviceAsync(new OpenCvCamera.AsyncCameraOpenListener()
//        {
//            @Override
//            public void onOpened()
//            {
//                webcam.startStreaming(320, 240, OpenCvCameraRotation.UPRIGHT);
//            }
//
//            @Override
//            public void onError(int errorCode)
//            {
//
//            }
//        });
//        waitForStart();
//
//        while (opModeIsActive()) {
//            telemetry.addData("Type", pipeline.getType());
//            telemetry.addData("Average", pipeline.getAverage());
//            telemetry.update();
//            sleep(50);
//        }
//    }
//
//    public static class SamplePipeline extends OpenCvPipeline {
//        private static final Scalar RED = new Scalar(255, 0, 0);
//        private static final int THRESHOLD = 109;
//
//        Point topLeft = new Point(225, 190);
//        Point bottomRight = new Point(280, 130);
//        Point topLeft2 = new Point(80,175);
//        Point bottomRight2 = new Point(135, 115);
//        TODO: TOP LEFT MAX 0,0 BOTTOM RIGHT MAX 320,240
//        Mat region1_Cb;
//        Mat region2_Cb;
//        Mat YCrCb = new Mat();
//        Mat Cb = new Mat();
//
//        private volatile int average;
//        private volatile int average2;
//        private volatile TYPE type = TYPE.LEFT;
//
//        private void inputToCb(Mat input) {
//            Imgproc.cvtColor(input, YCrCb, Imgproc.COLOR_RGB2YCrCb);
//            Core.extractChannel(YCrCb, Cb, 2);
//        }
//
//        @Override
//        public void init(Mat input) {
//            inputToCb(input);
//
//            region1_Cb = Cb.submat(new Rect(topLeft, bottomRight));
//
//            region2_Cb = Cb.submat(new Rect(topLeft2, bottomRight2));
//
//        }
//
//        @Override
//        public Mat processFrame(Mat input) {
//            inputToCb(input);
//
//            average = (int) Core.mean(region1_Cb).val[0];
//            average2 = (int) Core.mean(region2_Cb).val[0];
//
//            Imgproc.rectangle(input, topLeft, bottomRight, RED, 2);
//            Imgproc.rectangle(input, topLeft2, bottomRight2, RED, 2);
//
//            if (average > THRESHOLD && average > average2) {
//                type = TYPE.MIDDLE;
//            } else if (average < 110) {
//                type = TYPE.RIGHT;
//            } else {
//                type = TYPE.LEFT;
//            }
//
//            return input;
//        }
//
//        public TYPE getType() {
//            return type;
//        }
//
//        public int getAverage() {
//            return average;
//        }
//
//        public enum TYPE {
//            MIDDLE, RIGHT, LEFT
//        }
//    }
//}
//