import java.util.Scanner;
public class Threads_teste {
    public static void main(String[] args) {
        Trheads t1 = new Trheads("#Thread1", 500);
        Trheads t2 = new Trheads("#Thread2", 400);
        Trheads t3 = new Trheads("#Thread3", 200);
        Trheads t4 = new Trheads("#Thread4", 450);
        Trheads t5 = new Trheads("#Thread5", 100);

        while (t1.isAlive() || t2.isAlive() || t3.isAlive() || t4.isAlive() || t5.isAlive()) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }         
        }
    }
}
