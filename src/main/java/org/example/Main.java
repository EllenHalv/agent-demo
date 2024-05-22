package org.example;

public class Main {
    // Here we get the current JVM process id and print it along with a message.
    public static void main(String[] args) throws InterruptedException{
        long pid = ProcessHandle.current().pid();
        System.out.println("PID :" + pid);
        while (!Thread.interrupted()) {
            Thread.sleep(2_000);
            System.out.println("Hello world!");
        }
    }
}