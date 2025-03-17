import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        leftRotate(arr);
    }
    static void leftRotate(int[] arr){
        int[] res = new int[arr.length];
            res[res.length - 1] = arr[0];
            for (int i = 1; i < arr.length; i++) {
                res[i - 1] = arr[i];
            }
            System.out.println(Arrays.toString(res));
            ///

    }
}
