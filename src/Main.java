import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç kilo Armut alıcaksınız :");
        double armutKg = input.nextDouble();
        System.out.print("Kaç kilo Elma alıcaksınız :");
        double elmaKg = input.nextDouble();
        System.out.print("Kaç kilo Domates alıcaksınız :");
        double domatesKg = input.nextDouble();
        System.out.print("Kaç kilo Muz alıcaksınız :");
        double muzKg = input.nextDouble();
        System.out.print("Kaç kilo Patlican alıcaksınız :");
        double patlicanKg = input.nextDouble();

        System.out.println("Armut tutarı :"+ (armutKg * armutKg));
        System.out.println("Elma tutarı : "+(elmaKg * elma) );
        System.out.println("Domates Tutarı :"+ (domatesKg * domates));
        System.out.println("Muz tutarı :"+ (muzKg * muz));
        System.out.println("Patlican Tutarı :"+ (patlicanKg * patlican));

        double toplam_tutar = (armut * armutKg) + (elma * elmaKg) + (muz * muzKg) + (domatesKg * domates) + (patlicanKg * patlican);
        System.out.print("Toplam tutar :"+ toplam_tutar);
    }
}
