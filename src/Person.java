/**
 * Created by weird0 on 2017/3/16.
 */
public class Person {
    private String name;
    private int age;

    //无参构造器
    public Person(){

    }
    //有参构造器
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //protected的权限
    protected void print(){
        System.out.println("halo");
    }
}
