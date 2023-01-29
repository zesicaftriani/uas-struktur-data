import java.util.Scanner;
class Binary {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N = 8;
        int A [] = {5,2,9,7,1,6,8,3};
        int BatasAtas, BatasBawah, Tengah;
        int cari = 2;
        BatasAtas = 0;
        BatasBawah = N - 1;
        Tengah = 0;
        boolean ketemu;
        ketemu = false;

        while((BatasAtas <= BatasBawah) && (ketemu == false)){

            Tengah = (BatasAtas + BatasBawah) / 2;
            if (A[Tengah] == cari){
                ketemu = true;
            } else
            if (A[Tengah] <= cari){
                BatasAtas = Tengah + 1;
            } else {
                BatasBawah = Tengah - 1;
            }
        }
        if (ketemu) {
            System.out.println ("Angka : "+ cari + "Data berada di index nomor " + Tengah);
        } else {
            System.out.println ("Angka :" + cari + "Data tidak ditemukan");
        }
        class Sequential {

            /**
             * @param args the command line arguments
             */
            public static void main(String[] args) {
                int[] data = {99, 20, 17, 8, 27, 5, 21, 10, 41, 11};
                int cari = 8;
                int i = 0;
                boolean ditemukan = false;

                for (i = 0; i < data.length; i++) {
                    if (data[i] == cari) {
                        ditemukan = true;
                        break;
                    }
                }
                if (ditemukan) {
                    System.out.println("Data : " + cari + " Ditemukan Pada Index :" + i + ".");
                } else {
                    System.out.println("Data Tidak di temukan");
                }

            }
        }

    }
}

