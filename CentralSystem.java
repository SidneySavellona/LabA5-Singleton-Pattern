public class CentralSystem {
    public static void main(String[] args) {
        HelpDesk Desk = HelpDesk.getInstance();

        Desk.NextCustomer("Help Desk 1");
        Desk.NextCustomer("Help Desk 2");
        Desk.NextCustomer("Help Desk 3");
        Desk.NextCustomer("Help Desk 1");
        Desk.NextCustomer("Help Desk 2");
        Desk.NextCustomer("Help Desk 3");

        Desk.currentNumber();

        Desk.resetNumber(0);

        Desk.NextCustomer("Help Desk 1");
        Desk.NextCustomer("Help Desk 2");
        Desk.NextCustomer("Help Desk 3");
    }
}