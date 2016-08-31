package DemoObject2;

/**
 * Created by vinod on 30/08/2016.
 */
public class Main {

    public static void main(String[] args) {

        //write your code here
        int a  = 6;

        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();
        System.out.println(st1.name);
        System.out.println(st2.name);
        System.out.println(st3.name);

        st1.name = "Vaghella";

        System.out.println(st1.name);
        System.out.println(st2.name);
        System.out.println(st3.name);


    }



}
