import java.util.InputMismatchException;

public class TryCatch extends Statics {

    public static double doubleGirisi() {
        double giris = 0;
        boolean flag = true;

        while (flag) {
            try {
                giris = scan.nextDouble();
                scan.nextLine();
                flag = false;
            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println(R+"Lütfen bir sayı giriniz");
            }
        }
        return giris;
    }

    public static int intGirisi(){
        int giris=0;
        boolean flag=true;

        while(flag){
            try {
                giris= scan.nextInt();
                scan.nextLine();
                flag =false;

            }catch (InputMismatchException e){
                scan.nextLine();
                System.out.println(R+"Lütfen bir sayı giriniz");
            }
        }
        return giris;
    }
}

