public class Maximum {
    public static void main(String[] args) {
        int[] arr = {1,214,2,54,6};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int highest = 0;
        for (int j : arr) {
            if (highest < j) {
                highest = j;
            }
        }
        return highest;

    }
}
