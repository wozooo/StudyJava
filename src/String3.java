/**
 * Created by weird0 on 2017/3/16.
 * int [] arr ={1,2,3};
 * 输出[1,2,3]
 */
public class String3 {
    public static void main(String[] args) {
        int [] arr ={1,2,3};
        String s ="[";
        for (int i =0;i<arr.length;i++){
            if (i==arr.length-1){
                s=s+arr[i]+"]";
            }else {
                s=s+arr[i]+",";
            }

        } System.out.println(s);
    }
}
