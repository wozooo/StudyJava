/**
 * Created by weird0 on 2017/3/16.
 */
public class String_Test {
    public static void main(String[] args) {
        String s ="abc";//当把def赋值给s  那么前面的s的值就变成了垃圾
        s="def";
        System.out.println(s);
    }
}
