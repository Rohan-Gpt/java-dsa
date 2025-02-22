import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,43,4,4};
        int target = sc.nextInt();
        int ans = linearSearch(arr, target);
        System.out.println(ans);

        String str = "Some Name";
        char trg = 'm';
        System.out.println(search2(str, trg));
    }
    static int linearSearch(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    static boolean search(String str, char target){
        for (int i=0; i<str.length(); i++){
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    static boolean search2(String str, char target){
        for (char ch: str.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
    }
}