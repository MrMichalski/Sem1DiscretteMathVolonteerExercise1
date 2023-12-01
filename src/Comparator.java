import java.util.BitSet;

public class Comparator {

    static boolean compare(BinaryNumber encodedMessage1, BinaryNumber encodedMessage2, int accepteableDifferencesAmmount) {
        int differences = 0;
        for (int i = 0; i < encodedMessage2.getSize(); i++) {
            if(encodedMessage1.getBinNumber().get(i) != encodedMessage2.getBinNumber().get(i)) {
                differences++;
            }
            if(differences > accepteableDifferencesAmmount) {
                return false;
            }
        }
        //System.out.println("Differences: " + differences);
        return true;
    }

}
