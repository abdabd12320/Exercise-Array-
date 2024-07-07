import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        //Ex1:
        int len = 2;
        do {
            System.out.print("Enter length of the array: ");
            len = in.nextInt();
        }while (len < 2);
        int[] array = new int[len];
        for(int i = 0;i < array.length;i++)
        {
            System.out.print("Enter number: ");
            array[i] = in.nextInt();
        }
        if(array[0] == array[len-1])
        {
            System.out.println("true");
        }
        else System.out.println("false");

        System.out.println("--------------------------------");
        //Ex2:

        int len2 = 0;
        do {
            System.out.print("Enter length of the array: ");
            len2 = in.nextInt();
        }while (len2 <= 0);
        int[] array2 = new int[len2];
        ArrayList<Integer> array_avg = new ArrayList<>();
        double avg = 0.0;
        for(int i = 0;i < array2.length;i++)
        {
            System.out.print("Enter number: ");
            array2[i] = in.nextInt();
            avg += array2[i];
        }
        avg = avg / array2.length;
        for (int i = 0; i < array2.length; i++) {
            if (avg < array2[i]) {
               array_avg.add(array2[i]);
            }
        }
        System.out.println("Average : " + avg);
        System.out.println("Array that are greater than the average are: " + array_avg);
        System.out.println("--------------------------------");
        //Ex3:

        int len3 = 0;
        do {
            System.out.print("Enter length of the array: ");
            len3 = in.nextInt();
        }while (len3 <= 0);
        int[] array3 = new int[len3];
        for(int i = 0;i < array3.length;i++)
        {
            System.out.print("Enter number: ");
            array3[i] = in.nextInt();
        }
        if(array3[0] > array3[array3.length-1])
        {
            System.out.println("Large value between first and last element: " + array3[0]);
        }
        else System.out.println("Large value between first and last element: " + array3[array3.length-1]);
        System.out.println("--------------------------------");
        //Ex4:

        int len4 = 0;
        do {
            System.out.print("Enter length of the array: ");
            len4 = in.nextInt();
        }while (len4 <= 0);
        int[] array4 = new int[len4];
        ArrayList<Integer> array_list = new ArrayList<>();
        for(int i = 0;i < array4.length;i++)
        {
            System.out.print("Enter number: ");
            array4[i] = in.nextInt();
        }
        int temp = array4[0];
        array4[0] = array4[array4.length-1];
        array4[array4.length-1] = temp;
        for (int e: array4)
        {
            array_list.add(e);
        }

        System.out.println("New array after swapping the first and last elements: " + array_list);
        System.out.println("--------------------------------");
        //Ex5:

        int len5 = 0;
        do {
            System.out.print("Enter length of the array: ");
            len5 = in.nextInt();
        }while (len5 <= 0);
        int[] array5 = new int[len5];
        int temp5 = 0;
        ArrayList<Integer> array_list5 = new ArrayList<>();
        for(int i = 0;i < array5.length;i++)
        {
            System.out.print("Enter number: ");
            array5[i] = in.nextInt();
        }
        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5.length; j++) {
                if(array5[j]%2==0 && array5[i]%2!=0)
                {
                    temp5 = array5[j];
                    array5[j] = array5[i];
                    array5[i] = temp5;
                }
            }
        }
        for (int e: array5)
        {
            array_list5.add(e);
        }
        System.out.println(array_list5);
        System.out.println("--------------------------------");
        //Ex6:

        int len6 = 0;
        boolean bool = true;
        do {
            System.out.print("Enter length of array(1 and 2): ");
            len6 = in.nextInt();
        }while (len6 <= 0);
        int[] array6_1 = new int[len6];
        int[] array6_2 = new int[len6];
        for(int i = 0;i < array6_1.length;i++)
        {
            System.out.print("Enter number array(1): ");
            array6_1[i] = in.nextInt();
        }
        for(int i = 0;i < array6_2.length;i++)
        {
            System.out.print("Enter number array(2): ");
            array6_2[i] = in.nextInt();
        }
        for(int i = 0;i < len6;i++)
        {
            if(array6_1[i] != array6_2[i])
            {
                bool = false;
                break;
            }
        }
        System.out.println(bool);
    }
}