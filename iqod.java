import java.util.ArrayList;
import java.util.Scanner;

public class iqod {
    public static void main(String[] args){
//        ArrayList<int[]> arrays = new ArrayList<>();
        int[] array1 = {5,3,4};
        int[] array2 = {3,4,6,6};
        int[] array3 = {8,6,3,6,8,4};

        int[][] arrays = {array1, array2, array3};

        for(int[] arr : arrays){
            int first = arr[0];
            int last = arr[(arr.length - 1)];
            System.out.println((first + last));
        }

//        Scanner scan = new Scanner(System.in);
//        System.out.println("How big do you want the arrays?");
//        int num = scan.nextInt();
//        String answer = "";
//
//
//        while(answer != "yes") {
//            int[] nums = new int[num];
//            for (int i = 0; i < num; i++) {
//                nums[i] = scan.nextInt();
//            }
//            arrays.add(nums);
//            System.out.println("Add another array?");
//            answer = scan.nextLine();
//        }


    }
}
