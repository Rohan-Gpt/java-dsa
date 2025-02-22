public class RangeSearch {
    public static void main(String[] args) {
        int[] arr = {1,34,35,5,5,3};
        int target = 3;
        int start = 2;
        int end = 5;

        int ans = searchInRange(arr, target, start, end);
        System.out.println(ans);
    }
    static int searchInRange(int[] arr, int target, int start, int end){
        for (int i = start; i<= end; i++){
            if (target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
