public class Lab_9_1 {
    public static void main(String[] args) {
        Thread t1 = new GoodMorning();
        Thread t2 = new GoodAfternon();
        t1.start();
        t2.start();
    }
}

class GoodMorning extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("Good Morning");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class GoodAfternon extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("Good Afternoon");
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
