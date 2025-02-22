public class EvenVals {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};

        int ans = evenDigits3(nums);
        System.out.println(ans);
    }
    static int evenDigits(int[] arr){
        int count= 0;
        for (int num: arr){
            String str = Integer.toString(num);
            if (str.length()%2 == 0){
                count++;
            }
        }
        return count;
    }
    static int evenDigits2(int[] arr){
        int count= 0;
        for (int num: arr){
            int temp = 0;
            while (num > 0 ){
                num = num/10;
                temp++;
            }
            if (temp%2 == 0){
                count++;
            }
        }
        return count;
    }
    static int evenDigits3(int[] nums){
        int count=0;
        for (int num: nums){
             if (((int)(Math.log10(num))+1)%2 ==0){
                 count++;
             }
        }
        return count;

    }

}
