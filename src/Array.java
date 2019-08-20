public class Array {
    public static void main(String[] args) {
        int[] arr = {9, 13, 18, 26, 32};
        for (int i = 0; i < arr.length; ++i) {
            if ((arr[i]%3) ==0) {
                System.out.println(arr[i]);
            }
        }
    }
}
