package student_ivan_mostepanov.lesson_3_oop_first_look.task_29;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TV {


    String label;
    String resolution;
    String operatingSystem;
    int screenSize;
    int refreshRate;
    int firmWare;

    public TV(String label, String resolution, String operatingSystem, int screenSize, int refreshRate, int firmWare) {
        this.label = label;
        this.resolution = resolution;
        this.operatingSystem = operatingSystem;
        this.screenSize = screenSize;
        this.refreshRate = refreshRate;
        this.firmWare = firmWare;
    }
    void demonstration(){
        System.out.println("Your current TV is " + label);
        System.out.println("Resolution " + resolution);
        System.out.println("Operating System " + operatingSystem);
        System.out.println("Screen size " + screenSize + " inch");
        System.out.println("Refresh rate " + refreshRate + " Hz");
        System.out.println("Firmware " + "Version "+ firmWare);
    }

    void firmWareUpdate(){
        this.firmWare = this.firmWare + 5;
        System.out.println("Updating");
        System.out.println("Firmware Updated");
        System.out.println("Firmware Version " + firmWare);

    }

    void firmWareRollback(){
        this.firmWare = this.firmWare - 5;
        System.out.println("Rollback");
        System.out.println("Firmware Rollbacked");
        System.out.println("Firmware Version " + firmWare);

    }

    void firmWareReturnToFactory(){
        this.firmWare = 1000;
        System.out.println("Returning to Factory Settings");
        System.out.println("Firmware Returned");
        System.out.println("Firmware Version " + this.firmWare);

    }

}
