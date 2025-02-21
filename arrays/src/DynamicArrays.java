import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Long> list = new ArrayList<>(10);

        for (long i=0; i<100000; i++){
            list.add(i);
        }
        System.out.println(list.size());

    }
}
