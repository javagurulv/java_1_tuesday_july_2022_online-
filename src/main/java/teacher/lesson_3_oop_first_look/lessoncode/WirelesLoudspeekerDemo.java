package teacher.lesson_3_oop_first_look.lessoncode;

class WirelesLoudspeekerDemo {

    public static void main(String[] args) {
        WirelesLoudspeeker ws1 = new WirelesLoudspeeker("Bose", false);
        ws1.switchOn();

        ws1.switchOff();
        String model1 = ws1.getModel();
        System.out.println("WS 1 model = " + model1);

        WirelesLoudspeeker ws2 = new WirelesLoudspeeker("Samsung", true);
        ws2.switchOn();
        String model2 = ws2.getModel();
        System.out.println("WS 2 model = " + model2);

        WirelesLoudspeeker ws3 = new WirelesLoudspeeker("Xaomi", false);
        ws3.switchOn();
        String model3 = ws3.getModel();
        System.out.println("WS 3 model = " + model3);
    }

}
