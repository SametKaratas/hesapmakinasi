import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);

        System.out.print("Ilk Sayiyi Giriniz :");
        n1 = input.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz :");
        n2 = input.nextInt();
        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Seciminiz :");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam :" + (n1+n2));
                break;
            case 2:
                System.out.println("Cikarma :" + (n1-n2));
                break;
            case 3:
                System.out.println("Carpma :" + (n1*n2));    
                break;
            case 4:
                if(n2!=0){
                    System.out.println("Bolme :" + (n1/n2));
                }else{
                    System.out.println("Bir Sayi Sifir ile Bolunemez.");
                }
                break;
            default:
                System.out.println("Gecerli Komut Girmediniz.Tekrar Deneyiniz");
                break;
                
            }
        }

    }
