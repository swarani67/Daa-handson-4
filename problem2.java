import java.util.Arrays;
import java.util.Scanner;

public class main{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Lenght of array:");
        int size = obj.nextInt();
        int[] d = new int[size];
        System.out.println("Values in an array:");
        for (int k=0;k<size;k++)
        {
            d[k] =obj.nextInt();
        }
        obj.close();
        int q = duplicate(d);
        int[] new_d = Arrays.copyOf(d, q);
        System.out.println("Array without duplicates: " + Arrays.toString(new_d));
    }
    public static int duplicate(int[] d) {
        int size = d.length;
        if (size<=1) {
            return size;
        }
        int l=0;
        for (int k=0;k<size-1;k++) {
            if (d[k]!=d[k+1]) {
                d[l++]=d[k];
            }
        }
        d[l++]=d[size-1];
        return l;
    }
}
