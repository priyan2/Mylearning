import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        //both for loop makes a pattern
//        for(int i=1 ; i<=5; i++){
//            for(int j=1; j<=(i+1-1); j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        //reverse pattern from 5 to 1
//        for(int i=5 ; i>=1; i--){
//            for(int j=1; j<=(i+1-1); j++){
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }

        //start row & col equal
//        for(int i=1 ; i<=5; i++){
//           for(int j=1; j<=5; j++){
//                System.out.print("* ");
//           }
//           System.out.println();
//        }

        //prints 1 1 2 123 ..n
//        for(int i=1; i<=5; i++){
//            for(int j=1; j<=i+1-1; j++){
//                System.out.print(j+ " ");
//            }
//            System.out.println();
//        }
        //prints 1 22 333 ..n
//        for(int i=5; i>=1; i--){
//            for(int j=1; j<=i+1-1; j++){
//                System.out.print(i+ " ");
//            }
//            System.out.println();
//        }
//        pramidStarReverse();
//            rotatedTriangle(); pramidStar();

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int number = n * 10;
        while( n <= number){
            System.out.print(number+ " ");
            number = number - n;
        }


    }

//    static void pramidStar() {
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5 - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i * 2 - 1; k++) {
//                System.out.print("*");
//            }
//            for (int l = 1; l <= 5 - i; l++) {
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }
//    static void pramidStarReverse() {
//        for (int i = 5; i >= 1; i--) {
//            for (int j = 1; j <= 5 - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i * 2 - 1; k++) {
//                System.out.print("*");
//            }
//            for (int l = 1; l <= 5 - i; l++) {
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }
//            static void rotatedTriangle() {
//                int n = 5;
//                for(int i=1; i<= 2*n-1; i++){
//                    int stars =i;//2*n-1
//                    if(i > n) stars = 2*n-i;
//                    for(int j=1; j<=stars; j++){
//                        System.out.print("*");
//                    }
//                    System.out.println();
//                }
//            }
}

