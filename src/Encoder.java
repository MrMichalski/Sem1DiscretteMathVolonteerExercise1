import java.util.BitSet;

public class Encoder {

    static BinaryNumber encode(BinaryNumber message) {
        BinaryNumber encodedMessage = new BinaryNumber( (int) Math.pow(2, message.getSize() - 1) );
        BinaryNumber binaryNumber = new BinaryNumber(message.getSize() - 1);
        boolean outcome;
        boolean change = message.getBinNumber().get(0);//this helps to change outcome if first digit in message is 1
        int index = 0;




        do{
            outcome = change;



            for (int i = 0; i < message.getSize() - 1; i++) {
                if (message.getBinNumber().get(i + 1)) {
                    if(binaryNumber.getBinNumber().get(i)) {
                        outcome = !outcome;
                    }
                }
            }



            if (outcome) {
                encodedMessage.getBinNumber().set(index);
            }

            index++;

        } while (binaryNumber.incrementNumber());

        return encodedMessage;
    }





}
