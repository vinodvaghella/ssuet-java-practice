package DemoObject4;

import DemoObject3.*;

/**
 * Created by vinod on 30/08/2016.
 */
public class Main {

    public static void main(String[] args) {
        // write your code here
        int a  = 6;
        Student st = new Student();
        System.out.println(st.getName());
        System.out.println(st.getAge());
        st.setName("Vaghella");
        st.setAge(100);
        System.out.println(st.getName());
        System.out.println(st.getAge());

        //st.name
    }
}
