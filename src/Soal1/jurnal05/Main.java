package Soal1.jurnal05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        if (in.equals("")) {
            System.out.println("");
        } else {
            OperasiHitung theTrans = new OperasiHitung(in.next());
            String output = theTrans.doTrans();
            System.out.println(output);
        }
    }
}
