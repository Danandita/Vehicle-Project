// Digunakan untuk input keyboard dan harus diletakkan paling atas
import java.util.HashMap;
import java.util.Scanner;
// *open class - public
public class Della_d3 {
    //  *methode utama yang digunakan
    public static void main(String[] args) {
//      *define methode-metodhe yang akan dipanggil selanjutnya
//        test1();
//        test2();
//        test3();
//        test4();
//        test5();
//        test6();
//        test7();
//        test8();
        test9();
    }

    //  membuat score yang dimasukkan dalam keyboard
    public static void test1() {
//      *type data - double (berupa angka dan huruf)
        double score;
//        *Fungsi untuk memulai input keyboard
        Scanner scan = new Scanner(System.in);
//        *Untuk membuat "nama" output dalam keyboard
        System.out.print("Masukkan score: ");
//        *agar komputer tau kalau yang diinput dalam keyboard itu variable scor
//         "Double" diganti tergantung jenis data
        score = scan.nextDouble();

        if (score == 10) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    public static void test2() {
//        *Fungsi untuk memulai input keyboard
        Scanner scan = new Scanner(System.in);
        int score = 76;
//      *menunjukan bahwa yang terbaca oleh sistem adalah baris terakhir
        score = 20;
        char grade;
//        *Untuk membuat "nama" output dalam keyboard
        System.out.print("Masukkan score: ");
//        *agar komputer tau kalau yang diinput dalam keyboard itu variable scor
//         "Double" diganti tergantung jenis data
        score = scan.nextInt();

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println(grade);
    }

    //    Looping membuat persegi panjang
    public static void test3() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    //    Looping membuat segitiga
    public static void test4() {
        int a, b, tinggisegitiga = 5;
        for (a = 0; a < tinggisegitiga; a++) {
            for (b = 0; b <= a; b++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }

    public static void test5() {
        int a[] = new int[]{1, 2, 3, 4, 5,};

        System.out.println(a[5 - 1]);
    }

    public static void test6() {
        HashMap<String, Integer> age = new HashMap<>();

        age.put("Anggi", 19);
        age.put("Ester", 21);
        age.put("Veronica", 20);

        System.out.println(age.get("Anggi"));
    }

    public static void test7() {

        int date[] = new int[3];
        System.out.print("Input your number: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
//            Input angka ke var temp
            int temp = scanner.nextInt();

//            Kita assign nilai temp ke date dengan index ke i
            date[i] = temp;
        }
        System.out.println("Tahun Lahir: " + date[2]);
    }

    public static void test8() {
        int arr = 5;
        int ar[] = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < arr; i++) {
            int kpk = ar[i] * 2;
            if (kpk % 4 == 0) {
                System.out.println(kpk + " Kelipatan 4");
            } else {
                System.out.println(kpk);
            }
        }

    }

//    Versi 1 fibonanci.
    public static void test9() {
                int maxNumber;
                int previousNumber = 0;
                int nextNumber = 1;
                int sum=0;
                int mid;

                System.out.println("How many numbers you want in Fibonacci:");
                Scanner scanner = new Scanner(System.in);
                maxNumber = scanner.nextInt();

                System.out.print("Fibonacci Series of "+maxNumber+" numbers:");

                for (int i = 0; i < maxNumber; i++)
                {
                    /* On each iteration, we are assigning second number
                     * to the first number and assigning the sum of last two
                     * numbers to the second number
                     */

                    if (i == 0 || i == 1 )
                        System.out.print(i + " ");
                    else if (i < maxNumber) {
                        sum = previousNumber + nextNumber;
                        previousNumber = nextNumber;
                        nextNumber = sum;
                        System.out.print(sum+" ");
                    }


                }
//                System.out.println();
//
//                maxNumber = scanner.nextInt();
//                previousNumber = 0;
//                nextNumber = 1;
//                sum=0;
//                for (int i = 0; i < maxNumber; i++)
//                {
//                    /* On each iteration, we are assigning second number
//                     * to the first number and assigning the sum of last two
//                     * numbers to the second number
//                     */
//                    if (i < maxNumber-1) {
//                        sum = previousNumber + nextNumber;
//                        previousNumber = nextNumber;
//                        nextNumber = sum;
//                    }
//
//
//                }
//                System.out.println(sum);
//
            }

//            versi 2

    //    batas maksimal code
}







