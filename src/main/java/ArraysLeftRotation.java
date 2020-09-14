public class ArraysLeftRotation {

    public static int[] arraysLeftRotation(int[] a, int d) {
        int result [] = new int [a.length];
        int aux = 0;

        for (int i = 0; i < d; i++){
            for (int j=0; j< a.length-1; j++){
                if(j == 0) aux = a[0];
                result[j] = a[j+1];
            }
            result[a.length-1] = aux;
            a = result;
        }
        return result;
    }
}
