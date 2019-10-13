
import java.util.Scanner;

/**
 *
 * @author Muhammad Ihsan
 * NAMA       : Muhammad Ihsan
 * KELAS     : IF-1
 * NIM          : 10118037
 * Deskripsi Program   : Program ini berisi program warna kepribadian seseorang
 */


public class Warna {
                    
	//warna ANSI
                    public static final String reset = "\u001B[0m";
                    public static final String merah = "\u001B[31m";
                    public static final String hijau = "\u001B[32m";
                    public static final String kuning = "\u001B[33m";
                    public static final String biru = "\u001B[34m";
                    public static final String ungu = "\u001B[35m";
                    public static final String biruMuda = "\u001B[36m";
                    public static final String putih = "\u001B[37m";
                    public static final String latarMerah = "\u001B[41m";
                    public static final String latarHijau = "\u001B[42m";
                    public static final String latarKuning = "\u001B[43m";
                    public static final String latarBiru = "\u001B[44m";
                    public static final String latarUngu = "\u001B[45m";
                    

                    //variabel
                     public static String warna;
	public static String nama;
                     public static String warnaCek;

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
                           //header
                            System.out.println(merah + " YUK " + hijau + "CEK " + kuning + "KEPRIBADIANMU" +biruMuda +
                                                              " DARI " + ungu + "WARNA " + biru + "FAVORITMU\n\n");
       
                            System.out.println(latarMerah + putih+ "\t  MERAH\t\t"  );
                            System.out.println(latarHijau + putih+ "\t  HIJAU\t\t"  );
                            System.out.println(latarKuning + putih+ "\t  KUNING\t"  );
                            System.out.println(latarBiru + putih+ "\t  BIRU\t\t"  );
                            System.out.println(latarUngu + putih+ "\t  UNGU\t\t\n"  );
        
                            //input
                            System.out.print(reset + "PILIH WARNA FAVORITMU : ");
                            Scanner scanner = new Scanner(System.in);
                            warna = scanner.nextLine();
                            warnaCek = warna.toUpperCase();
        
                            System.out.print("Nama Kamu : ");
                            nama = scanner.nextLine();
        
                            //proses dan output
        
                            System.out.println("\n+++++HASIL TEST KEPRIBADIAN " + nama + "+++++");
                            switch(warnaCek){
                                    case "MERAH" :
                                                System.out.println(reset + "WARNA FAVORITMU ADALAH " + merah + warnaCek); 
                                                Merah mrh = new Merah();
                                                mrh.warnaMerah();
                                                break;
                                   case "HIJAU" :
                                                System.out.println(reset + "WARNA FAVORITMU ADALAH " + hijau + warnaCek); 
                                                Hijau hju = new Hijau();
                                                hju.warnaHijau();
                                                break;
                                   case "KUNING" :
                                                System.out.println(reset + "WARNA FAVORITMU ADALAH " + kuning + warnaCek); 
                                                Kuning kng = new Kuning();
                                                kng.warnaKuning();
                                                break;
                                    case "BIRU" :
                                                System.out.println(reset + "WARNA FAVORITMU ADALAH " + biru + warnaCek); 
                                                Biru bru = new Biru();
                                                bru.warnaBiru();
                                                break;
                                    case "UNGU" :
                                                System.out.println(reset + "WARNA FAVORITMU ADALAH " + ungu + warnaCek); 
                                                Ungu ung = new Ungu();
                                                ung.warnaUngu();
                                                break;
                                    default :
                                                System.out.println("Oopss... Belum Terindentifikasi ");
                                                break;
                  
         } 
	}

}