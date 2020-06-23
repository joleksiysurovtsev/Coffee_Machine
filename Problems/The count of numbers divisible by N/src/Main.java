import java.util.Scanner;

class Main {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner( System.in );
        int count = 0;

        for (int a = sc.nextInt( ), b = sc.nextInt( ), n = sc.nextInt( ); a <= b; a++) {
            if (a % n == 0) {
                count++;
            }
        }
        System.out.println(count );
    }
}