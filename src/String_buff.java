/**
 * Created by weird0 on 2017/3/18.
 * 将数组转化成字符串
 * int [] arr ={1,2,3};
 * 输出[1,2,3]
 */
public class String_buff {
    public static void main(String[] args) {
      int [] arr ={1,2,3};
        System.out.println(arrayToString(arr));

    }
    public static String arrayToString(int [] arr){
        StringBuffer sb =new StringBuffer();
        sb.append("[");
        for (int i=0;i<arr.length;i++){
            if (i==arr.length-1){
                sb.append(arr[i]+"]");//最后一位添加"]"
            }else{
                sb.append(arr[i]+",");//否则每位后面添加","
            }
        }
        return sb.toString();
    }
}
