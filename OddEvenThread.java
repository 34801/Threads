class EvenThread extends Thread {
    private int n;

    public EvenThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 2; i <= n; i += 2) {
            System.out.println("Even Thread: " + i);
        }
    }

    @Override
    public String toString() {
        return "EvenThread with limit " + n;
    }
}

class OddThread extends Thread {
    private int m;

    public OddThread(int m) {
        this.m = m;
    }

    @Override
    public void run() {
        for (int i = 1; i <= m; i += 2) {
            System.out.println("Odd Thread: " + i);
        }
    }

    @Override
    public String toString() {
        return "OddThread with limit " + m;
    }
}

public class Main {
    public static void main(String[] args) {
        int evenLimit = 10; // Change this to set the limit for even numbers
        int oddLimit = 15;  // Change this to set the limit for odd numbers

        EvenThread evenThread = new EvenThread(evenLimit);
        OddThread oddThread = new OddThread(oddLimit);

        // Start the threads
        evenThread.start();
        oddThread.start();

        // Display thread information
        System.out.println(evenThread.toString());
        System.out.println(oddThread.toString());
    }
}
