import java.util.Hashtable;

public class LowerCaseCapitalizer implements Capitalizer {

    private static double balance = 0;
    private Hashtable<String, String> words = new Hashtable<>();

    @Override
    public String print(String txt) {

        if (words.containsKey(txt)) {
            return words.get(txt);
        } else {
            balance -= 0.01;
            words.put(txt, txt.toLowerCase());
            return words.get(txt);
        }
    }

    public double printBalance() {
        return this.balance;
    }

    public void printTable() {
        System.out.println(words);
    }

}
