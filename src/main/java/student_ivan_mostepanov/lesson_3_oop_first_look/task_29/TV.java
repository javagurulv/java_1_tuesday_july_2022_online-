package student_ivan_mostepanov.lesson_3_oop_first_look.task_29;

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

}
