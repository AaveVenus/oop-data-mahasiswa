import java.util.Scanner;

public class User {
    public class mahasiswa {
        private String nama;
        private String nim;
        private String password;

        Scanner masukan = new Scanner(System.in);

        public void setNama(String nama) {
            System.out.print("Nama : ");
            nama = masukan.nextLine();
            this.nama = nama;
        }

        public void setNim(String nim) {
            boolean ceknim = true;
            do {
                System.out.print("Nim : ");
                nim = masukan.nextLine();
                if (nim.length() < 15) {
                    System.out.println("NIM harus berjumlah 15 angka");
                    ceknim = true;
                } else {
                    ceknim = false;
                    break;
                }
            } while (ceknim);
            this.nim = nim;
        }

        public void setPassword(String password) {
            boolean cekpassword = true;
            do {
                System.out.print("Password : ");
                password = masukan.nextLine();
                if (password.length() < 8) {
                    System.out.println("Password minimal 8 karakter");
                    cekpassword = true;
                } else {
                    cekpassword = false;
                    break;
                }
            } while (cekpassword);
            this.password = password;
        }

        public String getNama() {
            return nama;
        }

        public String getNim() {
            return nim;
        }

        public String getPassword() {
            return password;
        }

        public void signup() {
            setNama(nama);
            setNim(nim);
            setPassword(password);
        }

    }
}
