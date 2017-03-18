import java.util.Scanner;

/**
 * Created by weird0 on 2017/3/16.
 * 要求键盘输入字符串,然后反转
 * 例如输入 "abc"
 * 输出"cba"
 */
public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串");
        String line = scanner.nextLine();
        char[] arr = line.toCharArray();
        String s ="";
        for (int i =arr.length-1;i>=0;i--){
            s =s+arr[i];
           // System.out.print(arr[i]);
        }
        System.out.println(s);
    }
}
