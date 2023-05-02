import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("1. Character by character");
            System.out.println("2. Word by word");
            System.out.println("0. Keluar");
            System.out.print("Pilih : ");
            pilih = scanner.nextInt();
            scanner.nextLine();

            switch(pilih) {
                case 1 :
                    System.out.print("I say : ");
                    String kata = scanner.nextLine();
                    String charReverse = reverseChar(kata);
                    System.out.println("You say : " + charReverse);
                    break;
                case 2 :
                    System.out.print("I say : ");
                    String kalimat = scanner.nextLine();
                    String wordReverse = reverseWord(kalimat);
                    System.out.println("You say : " + wordReverse);
                    break;
            }
        } while(pilih != 0);
    }
        
    public static String reverseChar(String kata) {
        String reverse = new StringBuilder(kata).reverse().toString().toString();
        return reverse;
    }
            
    public static String reverseWord(String kata) {
        String[] kalimat = kata.split(" ");
        String[] reverseWords = new String[kalimat.length];
        for(int i = kalimat.length - 1; i >= 0; i--) {
            reverseWords[kalimat.length - 1 - i] = kalimat[i];
        }
        return String.join(" ", reverseWords);
    }
}
