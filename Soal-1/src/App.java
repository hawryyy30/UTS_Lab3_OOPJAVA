/*
 PENGERTIAN 
a. Class : Blueprint atau cetakan atau template yang mendeskripsikan behaviour(method) dan state(attribute) dari objek yang akan dibuat. 
b. Object : Instance atau turunan atau wujud nyata dari class yang memiliki behaviour dan state seperti yang dideskripsikan pada class
c. Constructor : Method default ketika class dibuat, constructor harus memiliki nama yang sama dengan classnya. Constructor berfungsi memberi nilai awal terhadap data/objek dan mengalokasikan ruang pada objek dari sebuah class. Terdapat 2 jenis, yaitu no-argument constructor dan parameterized constructor
d. Method overloading : Penggunaan nama yang sama pada lebih dari satu method, namun dengan parameter yang berbeda.
e. Method setter and getter : merupakan penamaan untuk 2 method yang bertujuan untuk menetapkan(set) dan mengambil(get) data dari variable-variable yang dilindungi(diberi access modifier : private). Dalam pengaplikasiannya bertujuan untuk meningkatkan keamanan data 
*/

// A. Contoh class

import java.util.Scanner;

class Login {
    private String username;
    private String password;

    // C. Contoh constructor : Parameterized Constructor
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // E. Contoh method setter dan getter
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    // D. Contoh method overloading
    public String getUsername(String nickname) {
        return this.username +" a.k.a "+nickname;
    }

    public String getPassword() {
        return this.password;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // B . Contoh object
        Scanner scanner = new Scanner(System.in);
        Login hawryyy = new Login("Harry", "harrytarigan30");
        int pilihan;

        do {
            System.out.println("Menu");
            System.out.println("1. Login");
            System.out.println("2. Ganti password");
            System.out.println("3. Sapa seolah-olah orang lain");
            System.out.println("0. Keluar");
            pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Username : ");
                    String username = scanner.next();
                    System.out.print("Password : ");
                    String password = scanner.next();
                    if (username.equals(hawryyy.getUsername()) && password.equals(hawryyy.getPassword())) {
                        System.out.println("Login berhasil");
                        System.out.println("Selamat datang, " + hawryyy.getUsername());
                    }else{
                        System.out.println("Login gagal");
                    }
                    break;

                case 2:
                    System.out.print("Password Lama : ");
                    String oldpassword = scanner.next();
                    System.out.print("Password baru :");
                    String newpassword = scanner.next();
                    System.out.print("Konfirmasi password : ");
                    String konfirmasipassword = scanner.next();

                    if (oldpassword.equals(hawryyy.getPassword())) {
                        if (newpassword.equals(konfirmasipassword)) {
                            hawryyy.setPassword(newpassword);
                            System.out.println("Ganti password berhasil");
                        } else {
                            System.out.println("Konfirmasi password tidak sesuai");
                        }
                    } else {
                        System.out.println("Bukan password lama anda");
                    }
                    break;
                case 3:
                    System.out.print("Anda ingin disapa sebagai siapa? ");
                    String namasamaran = scanner.next();
                    System.out.println(
                            hawryyy.getUsername() + " Sekarang akan saya panggil " + hawryyy.getUsername(namasamaran));
                default:
                    break;
            }

        } while(pilihan != 0);

    }
}
