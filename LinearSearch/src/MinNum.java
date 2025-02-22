public class MinNum {
    public static void main(String[] args) {
        int [] arr ={10,23,4,45,5};

        int ans = min(arr);
        System.out.println(ans);
    }
    static int min(int[] arr){
        int minNum= arr[0];
        for (int num: arr){
            if (num < minNum){
                minNum= num;
            }
        }
        return minNum;
    }
}
