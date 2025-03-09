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

        //zeroOne();
        // numbersPrint();
        //lettersPrint();
        //lettersPrintReverse();
        //lettersPrintSame();


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

//    static void zeroOne(){
//        int start = 1;
//        for(int i=0; i<5; i++){
//            if( (i % 2) == 0) start = 0;
//            else start = 1;
//            for(int j=0; j<=i; j++){
//                System.out.print(start+ " ");
//                start = 1 - start;
//            }
//            System.out.println();
//        }
//    }

//    static void numbersPrint(){
//        int num = 1;
//        for(int i=1; i<= 5; i++){
//            for(int j=1; j<=i ; j++){
//                System.out.print(num+ " ");
//                num++;
//            }
//            System.out.println();
//        }
//    }

//    static void lettersPrint(){
//        for(int i=1; i<= 5; i++){
//            for(char j='A'; j < 'A'+i ; j++){
//                System.out.print(j +" ");
//            }
//            System.out.println();
//        }
//    }
    //
//            static void lettersPrintReverse(){
//                for(int i=1; i<= 5; i++){
//                    for(char j='A'; j <= 'A'+(5-i); j++){
//                        System.out.print(j +" ");
//                    }
//                    System.out.println();
//                }
//            }

//            static void lettersPrintSame(){
//                for(int i=1; i<= 5; i++){
//                    char ch = (char) ('A' + i-1);
//                    for(int j=1; j<=i; j++){
//                        System.out.print(ch +" ");
//                    }
//                    System.out.println();
//                }
//            }
//
}

