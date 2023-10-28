import java.util.Scanner;
/**
 *
 * @author User
 * Nama : Silky Afina Saly
 * NIM  : 22166017
 * Prodi: Sistem Informasi
 * Deskripsi Program: Program untuk melihat kepribadian seseorang melalui warna favorit
 */
public class SI_RegPagi22166017Latihan29WarnaKepribadian {
    public static void main(String[]args){
        // 
        String warna = "\u001b[0m";
        String foregroundMerah = "\u001b[31m";
        String foregroundHijau = "\u001b[32m";
        String foregroundKuning = "\u001b[33m";
        String foregroundBiru = "\u001b[34m";
        String foregroundUngu = "\u001b[35m";
        String foregroundCyan = "\u001b[36m";
        
        String backgroundMerah = "\u001b[41m";
        String backgroundHijau = "\u001b[42m";
        String backgroundKuning = "\u001b[43m";
        String backgroundBiru = "\u001b[44m";
        String backgroundUngu = "\u001b[45m";    
        
        Scanner input = new Scanner(System.in);
        System.out.print(foregroundMerah+"YUK "+warna);
        System.out.println(foregroundHijau+"CEK"+warna);
        System.out.print(foregroundKuning+"KEPRIBADIANMU "+warna);
        System.out.print(foregroundCyan+"DARI "+warna);
        System.out.print(foregroundUngu+"WARNA "+warna);
        System.out.print(foregroundBiru+"FAVORITMU \n"+warna);
        
        System.out.println(backgroundMerah+"        MERAH     "+warna);
        System.out.println(backgroundHijau+"        HIJAU     "+warna);
        System.out.println(backgroundKuning+"        KUNING    "+warna);
        System.out.println(backgroundBiru+"        BIRU      "+warna);
        System.out.println(backgroundUngu+"        UNGU      "+warna+"\n");
        
        System.out.print("PILIH WARNA FAVORITMU : ");
        String warna_favorit = input.next();
        System.out.print("NAMA KAMU : ");
        String nama = input.next();
        
        System.out.println("\n==== HASIL TEST KEPRIBADIAN " + nama +" ====");
        System.out.print("Warna favoritmu adalah ");
        
        switch (warna){
            case "merah":
                System.out.println(foregroundMerah+"merah"+warna);
                System.out.println("""
                                   1. Periang,
                                   2. Pemberani,
                                   3. Berani menyukai risiko dalam setiap langkah,
                                   4. Menyukai tantangan,
                                   5. Kurang sabar,
                                   6. Dapat menahan marah namunn jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol,
                                   7. Memiliki energi kehangatan dan cinta.""");
                break;
            case "hijau":
                System.out.println(foregroundHijau+"hijau"+warna);
                System.out.println("""
                                   1. Romantis,
                                   2. Menyukai hal yang berbau alami dan keindahan,
                                   3. Teguh pada prinsip,
                                   4. Mudah cemburu,
                                   5. Mudah merasa iri,
                                   6. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.""");
                break;
            case "kuning":
                System.out.println(foregroundKuning+"kuning"+warna);
                System.out.println("""
                                   1. Optimis,
                                   2. Suka bergaul,
                                   3. Periang,
                                   4. Senang menolong,
                                   5. Lincah dan aktif,
                                   6. Tidak suka meremehkan kekurangan orang lain,
                                   7. Loyal,
                                   8. Hangat,
                                   9. Meskipun cenderung optimis dan idealis, seringkali goyah dan tidak stabil,
                                   10.Cenderung penakut.""");
                break;
            case "biru":
                System.out.println(foregroundBiru+"biru"+warna);
                System.out.println("""
                                   1. menyenangkan,
                                   2. Bijaksana,
                                   3. Pembawaan diri tenang saat menghadapi masalah,
                                   4. Dinamis,
                                   5. Senang berbagi,
                                   6. Bersahabat,
                                   7. Tidak terlalu suka menjadi sorotan banyak orang,
                                   8. Menyembunyikan perasaan karena karakternya yang cenderung mencari damai.""");
                break;
            case "ungu":
                System.out.println(foregroundUngu+"ungu"+warna);
                System.out.println("""
                                   1. Optimis,
                                   2. Tidak pernah ragu,
                                   3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,
                                   4. Memiliki ambisi yang besar,
                                   5. Memiliki empati yang besar,
                                   6. Memiliki sisi misterius sebab seringkali menutupi perasaannya,
                                   7.Terkadang bersikap keras kepala dan angkuh.""");
                break;
            default:
                
                System.out.println("Warna yang Anda masukkan tidak valid.");
                break;
        } 
    }
}
