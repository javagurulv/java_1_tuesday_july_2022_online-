package student_jelena_voinica.lesson_3;

public class Phone {
    String model;

    Phone(String Model)
    {this.model = Model;}

    String getModel()

    {return this.model;}
}


 class PhoneDemo {

    public static void main(String[]args){
        Phone myPhone = new Phone("Huawei");
        String  phoneModel = myPhone.getModel();

        System.out.println("Phone model = " + phoneModel);
    }
 }