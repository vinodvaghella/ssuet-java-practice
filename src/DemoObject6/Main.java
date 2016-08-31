package DemoObject6;

/**
 * Created by vinod on 31/08/2016.
 */
public class Main {

    public static void main(String[] args) {
        //write your code here
        Student st = new Student("Vinod" , 31);
        Student st1 = new Student("Vaghella", 31);
        System.out.println(st.getName());
        System.out.println(st.getAge());
        System.out.println(st1.getName());
        System.out.println(st1.getAge());
    }
}
