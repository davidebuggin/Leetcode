import java.util.Arrays;

public class FindMedianSortedArrays {
    public static void main(String[] args){

        int [] a = {1,2};
        int [] b = {3,4};

        int [] union = new int[a.length + b.length];

        System.arraycopy(a, 0, union, 0, a.length);
        System.arraycopy(b, 0, union, a.length, b.length);

        Arrays.sort(union);

        double median;

        if (union.length % 2 == 0 ){ //pari
            int middle1 = union[union.length / 2 - 1];
            int middle2 = union[union.length / 2];
            median = (middle1+middle2)/2.0;
        } else {
            
            median = union[union.length/2];
        }

        System.out.println(median);
    }   
}
