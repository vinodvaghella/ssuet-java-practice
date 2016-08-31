package DemoObject3;

/**
 * Created by vinod on 30/08/2016.
 */
public class Main {

    public static void main(String[] args) {
        // write your code here
        Student st = new Student();
        System.out.println(st.name);
        System.out.println(st.age);

        st.study();

        int abc = st.payFee();
        System.out.println(abc);
    }
}
