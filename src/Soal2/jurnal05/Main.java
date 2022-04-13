package Soal2.jurnal05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QueueB<String> queue = new QueueB<>();

        Scanner input = new Scanner(System.in);

        int pilih = 0;
        while(pilih != 4){
            System.out.println("1. Input Data");
            System.out.println("2. Remove Data");
            System.out.println("3. Print Data");
            System.out.println("4. Exit");
            pilih = input.nextInt();

            if(pilih == 1){
                System.out.println("Input");
                String tDL = input.next();
                queue.enqueue(tDL);
                System.out.println();
            }
            else if(pilih == 2){
                queue.dequeue();
                System.out.println("Success");
                System.out.println();
            }
            else if(pilih == 3){
                queue.printQueue();
                System.out.println();
            }
        }
    }
}

