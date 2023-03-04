import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        System.out.println("basamak sayisi giriniz: ");
        Scanner oku=new Scanner(System.in);
        n=oku.nextInt();

        for (int i=n-1;i>=0;i--){
            for (int k= 0;k<n-(2*i+1)/2;k++){
                System.out.print( " ");
            }

            for (int j=0;j<(2*i+1);j++){
                System.out.print("*");
            }



            System.out.println( " ");
    }
}}