import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner inp =new Scanner(System.in);
        int x ;
        System.out.print("Sayi giriniz : ");
        x = inp.nextInt();

        for (int i=0;i<=x;i++){
            if (i %3==0) {
                if(i %4==0) {
                    System.out.println(i);


                }
            }

        }

    }
}