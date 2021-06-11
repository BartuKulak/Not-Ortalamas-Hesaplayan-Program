import java.util.Scanner;

public class main {
    public static void main(String[] args){
        int mat, fizik, kimya, turkce, tarih, muzik;
        double ortalama;
        Scanner input= new Scanner(System.in);
        System.out.print("Matematik Notunuz: ");
        mat=input.nextInt();
        System.out.print("Fizik Notunuz: ");
        fizik=input.nextInt();
        System.out.print("Kimya Notunuz: ");
        kimya=input.nextInt();
        System.out.print("Turkce Notunuz: ");
        turkce=input.nextInt();
        System.out.print("Tarih Notunuz: ");
        tarih=input.nextInt();
        System.out.print("Muzik Notunuz: ");
        muzik=input.nextInt();
        ortalama=(mat+fizik+kimya+turkce+tarih+muzik)/6.0;
        System.out.print("Ortalamanız: "+ ortalama+"\n");
        Boolean gectiMi=(ortalama>60);
        System.out.print("Sınıfı Gecme Durumu= "+gectiMi);


    }
}
