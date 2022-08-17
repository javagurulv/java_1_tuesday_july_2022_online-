package student_yurii_panasiuk.test;

public class Test {

 //   private String [] myArr;

    private   String[] seasons;

    Test(String [] seasons)
    {
        this.seasons = seasons;
       // this.testInfo();
    }

    public void testInfo()
    {
        for (int i = 0; i < 4; i++) {
            System.out.println(seasons[i]);
    }

}
}
