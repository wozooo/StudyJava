import java.util.Scanner;

/**
 * Created by weird0 on 2017/3/18.
 */
public class String_ReverseBuff {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(Resverse(line));
    }
    public static String Resverse(String line){
        StringBuffer sb = new StringBuffer(line);
        sb.reverse();
        return sb.toString();
    }
}
