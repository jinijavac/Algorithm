public class Main {
    public static void main(String[] args) {

        boolean [] a = new boolean[10001];

        for (int i = 1; i<10001; i++) { 
            int n = test(i);
            if (n < 10001) {
                a[n] = true; 
            }
        }
        for (int i = 1; i < 10001; i++) {
            if (a[i] == false) {
                System.out.println(i);
            }
        }
    }
    public static int test(int n){
        int sum = n;
        while (n != 0){
            sum += n % 10; 
            n = n / 10;
        }
        return sum;
    }
}