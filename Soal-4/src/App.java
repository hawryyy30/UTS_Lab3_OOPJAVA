import java.util.Scanner;

class Hitung {
    private double hasil;

    public Hitung(double v0, double a, double t) {
        hasil = v0 + a * t;
    }

    public Hitung(String tipe, double sisi1, double sisi2) {
        if (tipe.equalsIgnoreCase("hipotenusa")) {
            hasil = Math.sqrt(sisi1 * sisi1 + sisi2 * sisi2);
        } else if (tipe.equalsIgnoreCase("sisi")) {
            hasil = Math.sqrt(sisi2 * sisi2 - sisi1 * sisi1);
        } else {
            System.out.println("Tipe salah");
        }
    }

    public double getHasil() {
        return hasil;
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int pil;
        do {
            System.out.println("Si paling matematis (⌐■_■)");
            System.out.println("1. Teorema Phytagoras[Matematika] ");
            System.out.println("2. Kinematika Kecepatan[Fisika]");
            System.out.println("0.Keluar");
            System.out.print("Pilihan : ");
            pil = scanner.nextInt();
            scanner.nextLine();

            switch (pil) {
                case 1:
                    System.out.print("Bagian segitiga yang ingin dicari (Hipotenusa,sisi) : ");
                    String tipe = scanner.nextLine();
                    System.out.print("Sisi pertama : ");
                    double sisi1 = scanner.nextDouble();
                    System.out.print("Sisi kedua/Hipotenusa : ");
                    double sisi2 = scanner.nextDouble();
                    Hitung pytagoras = new Hitung(tipe, sisi1, sisi2);
                    System.out.println("Hasil : " + pytagoras.getHasil());
                    break;
                case 2:
                    System.out.print("v0 = ");
                    double v0 = scanner.nextDouble();
                    System.out.print("a = ");
                    double a = scanner.nextDouble();
                    System.out.print("t = ");
                    double t = scanner.nextDouble();
                    Hitung kinematika = new Hitung(v0, a, t);
                    System.out.println("Hasil: " + kinematika.getHasil());
                    break;
                case 0:
                    scanner.close();
                    break;
            }
        } while (pil != 0);
    }
}
