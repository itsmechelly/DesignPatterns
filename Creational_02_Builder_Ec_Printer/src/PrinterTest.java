
public class PrinterTest {

    public static void main(String[] args) {

        Printer p1 = new Printer.Builder("plain", "color", "1500S")
                .setFaxEnabled(true)
                .setScannerEnabled(true)
                .build();

        System.out.println(p1);

        Printer p2 = new Printer.Builder("plain", "color", "1500S")
                .setFaxEnabled(true)
                .setScannerEnabled(true)
                .build();

        System.out.println(p2);

        // with static import we can call the static method without specifying the class
        Printer.moveStatic();
    }
}
