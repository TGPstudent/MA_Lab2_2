// Транспонування матриці
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int Inp_N () //Считування числа для введення розмірності матриці
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return (n);
    }
    public static void ArgGenerator(int[][] A,int n, int m)//Генерування елементів масиву
    {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = (int) random.nextInt(200 + 1);
            }
        }
    }
    public static void ArgPrint (int[][]A, int n, int m)
    {
        System.out.println("A ["+ n +", "+ m +"]:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%4d", A[i][j]);
            }
            System.out.print("\n");
        }
    }
    public static int[][] ArgTransposition (int[][]A, int n, int m)
    {
        int[][] Rez = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Rez[i][j] = A[j][i];

            }
        }
        return (Rez);
    }
    public static void main(String[] args) {
        int n,m;
        System.out.printf("Введіть кількість рядків n в матриці A[n,m]?:");
        n=Inp_N ();
        System.out.printf("Введіть кількість стовпців m в матриці A[n,m]?:");
        m=Inp_N ();
        int[][] A = new int[n][m];
        ArgGenerator(A, n, m);
        System.out.printf("\nЗгенерована матриця ");
        ArgPrint (A, n, m);

        int[][] Rez = new int[m][n];
        Rez = ArgTransposition (A, n, m);
        System.out.printf("\nТранспонована матриця ");
        ArgPrint (Rez, m, n);
        }
    }

