import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        double [][]matrix1=new double[2][2];
        double [][]matrix2=new double[2][2];

        System.out.println("Indtast 1. matrix ");
       /* matrix1[0][0]= input.nextDouble();
        matrix1[0][1]= input.nextDouble();
        matrix1[1][0]= input.nextDouble();
        matrix1[0][1]= input.nextDouble();*/

        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                matrix1[i][j]= input.nextDouble();

        System.out.println("Indtast 2. matrix ");
        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                matrix2[i][j]= input.nextDouble();

        udskriv(matrix1);

    }

    public static void udskriv(double [][] a){
        for(int i=0;i<2;i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }

    }

}