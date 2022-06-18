public class mahasiswa {
    public static void main(String[] args) {
        User ang = new User();

        ang.signup();
        System.out.println();
        System.out.println("Selamat " + ang.getNama() + " Anda Berhasil Daftar");
        System.out.println();
        System.out.println("Berikut username dan password anda :");
        System.out.println("Username : " + ang.getNim());
        System.out.println("Password : " + ang.getPassword());
    }
}
