import java.util.Arrays;

public class MergeSort{
    public static void main(String[] args){
        int []v1 = {1,3,5,7,9};
        int []v2 = {2,4,6,8,10};
        int []v3 = intercala(v1, v2);
        System.out.println(Arrays.toString(v3));
    }
    private static int[] intercala(int[] v1, int[] v2){
        int []v3 = new int[v1.length + v2.length];
        for(int i = 0, j=0; i<v1.length; i++, j+=2){
            v3[j] = v1[i];
            v3[j+1] = v2[i];
        }
        return v3;
    }

}
