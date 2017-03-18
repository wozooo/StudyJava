/**
 * Created by weird0 on 2017/3/18.
 * 二分查找法
 */
public class binarySearch {
    public static void main(String[] args) {
        int [] arr={11,22,33,44,55,66,77,80};
        System.out.println(getIndex(arr,22));
    }

    /*
    * @方法 二分法
    * @返回值类型 int
    * @参数 int [] arr,int value
    * */
    private static int getIndex(int[] arr,int value) {
        int min = 0;
        int max = arr.length - 1;
        int mid =(min+max)/2;
        while (arr[mid] != value) {//中间值不等于要查找的值就开始循环
            if (arr[mid] < value) {//中间值小于要查找的值
                min = mid + 1;//最小的索引改变
            }else if (arr[mid]>value){
                max=mid-1;
            }
            mid=(max+min)/2;
            if (min>max){
                return -1;
            }
        }
        return mid;
    }
}
