/**
 * Created by weird0 on 2017/3/18.
 * 冒泡排序,高级排序(选择排序)
 */
public class Sort {
    public static void main(String[] args) {
        int [] arr ={14,34,11,5,45};
        bubble(arr);
        choose(arr);
        print(arr);
    }

    /*
    * @方法 选择排序
    * @返回值 void
    * @参数 int []arr*/
    private static void choose(int[] arr) {
        for (int i =0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    swap1(arr,i,j);
                }
            }
        }
    }

    /*
    * @方法 bubble冒泡法
    * @参数 int [] arr
    * @返回值 void*/
    private static void bubble(int[] arr) {
        for (int i =0;i<arr.length;i++){
            for (int j =0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                   swap(arr,j,j);
                }
            }
        }
    }

    /*
    * 交换*/
    private static void swap(int [] arr,int i,int j) {
        int temp = arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
    }
    private static void swap1(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    /*
    * 打印*/
    private static void print(int[] arr) {
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
