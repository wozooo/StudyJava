/**
 * Created by weird0 on 2017/3/16.
 */
public class Test2 {
    public static void main(String[] args) {
        //外部类.内部类实例化
        outMethob.InnerMethob innerMethob = new outMethob.InnerMethob();
        innerMethob.print();
    }
}
class outMethob{
    static class InnerMethob{
        public void print(){
            System.out.println("halo");
        }
    }
}
