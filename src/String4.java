/**
 * Created by weird0 on 2017/3/16.
 * 小串在大串里面的个数
 */
public class String4 {
    public static void main(String[] args) {
//        int count = getCount();
//        System.out.println(count);
    }

    private static int getCount() {
        String Max ="heimawoaoheima";
        String Mix ="heima";
        int count =0;
        int index =0;
        while ((index =Max.indexOf(Mix))!=-1){
            count++;
           Max.substring(index+Mix.length());
        }
        return count;
    }
}
