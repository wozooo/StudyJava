/**
 * Created by weird0 on 2017/3/16.
 * 匿名内部类的格式和理解
 * 一定要有一个接口或者是一个外部类
 */
public class Test3 {
    public static void main(String[] args) {
    }

}
/*
* 接口*/
interface  inter{
    public void print();
}
class Outer{
   class inner implements inter{

       @Override
       public void print() {
           System.out.println("halo");
       }
   }
   /*
   * 实现inter接口重写抽象方法*/
   public void methob(){
        new inter() {
           @Override
           public void print() {
               System.out.println("halo");
           }
       }.print();
   }
}