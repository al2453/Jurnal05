package Soal1.jurnal05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        String keluaran;

        if (input.equals("")) {
            System.out.println("Berikan Kembali inputan Infix !");
        } else {
            OperasiHitung theTrans = new OperasiHitung(input.next());
            keluaran = theTrans.doTrans();
            System.out.println(keluaran);
        }
    }
}
