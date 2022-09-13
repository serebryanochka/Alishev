package practice;

import java.util.Scanner;

public class Multithreading {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        myThread.shutdown();
    }
}


class MyThread extends Thread {
    private volatile boolean running = true; //переменная гарантирует когерентность кэшэй
    public void run() {
        while (running) {
            System.out.println("Hello!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void shutdown(){
        this.running = false;
    }
}