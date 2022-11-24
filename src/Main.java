import java.util.Scanner;

public class Main {


    static int usAlma(int x,int y){

        if (x==1)
            return 1;

        else if (y==0)
            return 1;

        else
            return x*usAlma(x,y-1);
        }



    public static void main(String[] args) {

        Scanner klavye=new Scanner(System.in);
        System.out.print("Taban Değer Girin: ");
        int x=klavye.nextInt();

        System.out.print("Üs Değerini Girin: ");
        int y= klavye.nextInt();
        System.out.println("Cevap: " +usAlma(x,y));



    }

}