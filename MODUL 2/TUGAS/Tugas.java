import java.util.Scanner;


class Admin {

    public boolean login(String inputUsername, String inputPassword) {
        String username = "admin";
        String password = "12345";
        return inputUsername.equals(username) && inputPassword.equals(password);
    }
}


class Mahasiswa {
    private final String nama = "RIZAL AL SYAHRIL";
    private final String nim = "202410370110105";

    public boolean login(String inputNama, String inputNim) {
        return inputNama.equals(nama) && inputNim.equals(nim);
    }

    public void displayInfo() {
        System.out.println("Login berhasil sebagai Mahasiswa.");
        System.out.println("Nama: " + nama);
        System.out.println("NIM : " + nim);
    }
}


class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Membuang newline

        if (pilihan == 1) {

            Admin admin = new Admin();
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            if (admin.login(username, password)) {
                System.out.println("Login berhasil sebagai Admin.");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }

        } else if (pilihan == 2) {

            Mahasiswa mahasiswa = new Mahasiswa();
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            if (mahasiswa.login(nama, nim)) {
                mahasiswa.displayInfo();
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }

        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
