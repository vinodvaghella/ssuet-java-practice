package DemoObject4;

/**
 * Created by vinod on 30/08/2016.
 */
public class Student {
    private String name = "Vinod";
    private int age = 31;

    public void setName(String n){
       // System.out.println(n);

        name = n;
    }

    public  String getName(){
        return name;
    }
    public void setAge(int a){
        if (a > 100){
            System.out.println("Incorrect age, please provide correct age");
        }
        else{
            age = a;
        }
    }

    public int getAge(){
        return age;
    }
}
