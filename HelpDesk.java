public class HelpDesk {
    private static HelpDesk instance;
    private int QNumber = 0;

    private HelpDesk() {
    }

    public static synchronized HelpDesk getInstance() {
        if (instance == null)
            instance = new HelpDesk();
        return instance;
    }

    public synchronized void currentNumber() {
        System.out.println("Current Number: " + QNumber);
    }

    public synchronized void NextCustomer(String desk) {
        QNumber++;
        System.out.println("Now Serving Customer: " + QNumber + " on " + desk);
    }

    public synchronized void resetNumber(int num) {
        QNumber = num;
        System.out.println("Reseting Queue Number to " + QNumber);
    }
}