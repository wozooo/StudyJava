import java.util.Scanner;

/**
 * Created by weird0 on 2017/3/16.
 */
public class String_Methob {
    public static void main(String[] args) {
       // Login();
       // SubString();
       // print();
        String s ="abc";
        byte [] arr =s.getBytes();//编码过程
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }



    }

    private static void print() {
        String s="woaini";//遍历字符串
        for (int i =0;i<s.length();i++){
            System.out.print(s.charAt(i));
        }
    }

    private static void SubString() {
        String s ="abcdefg";
//        int index =s.indexOf('g');//g在索引的位置
//        System.out.println(index);
        String s1 = s.substring(1, 3);
        System.out.println(s1);
    }

    private static void Login() {
        for (int i = 0; i <= 3; i++)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入用户名");
            String userName = scanner.nextLine();
            System.out.println("请输入密码");
            String password = scanner.nextLine();

        if ("admin".equals(userName)&&"password".equals(password)){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败"+"还剩"+(3-i)+"次");
            continue;
             }

        }
    }
}
