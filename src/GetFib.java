public class GetFib {
    public static void getFibToN(int n) {
        int[] f_arr = new int[n];

        f_arr[0] = 0;
        f_arr[1] = 1;

        for(int i = 2; i<n; i++){

            f_arr[i] = f_arr[i-1]+f_arr[i-2];
        }

        for(int i = 0; i <n; i++){
            System.out.println(f_arr[i]);
        }

    }

    public static void main(String[] args){

        getFibToN(15);
    }
}