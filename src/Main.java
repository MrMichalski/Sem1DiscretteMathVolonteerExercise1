import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.BitSet;

public class Main {
    public static void main(String[] args) {
        //these fields are common for each iteration of the while loop so the app is more optimal by for example
        //not creating a binary number each time it has to encode a message
        BinaryNumber encodedMessage;

        System.out.println("Decrypted messages form messages7.txt: ");

        try{
            BufferedReader br = new BufferedReader(new FileReader("messages/messages7.txt"));

            int n = Integer.parseInt(br.readLine()) - 1; // reads line 1
            br.readLine(); // skips line 2
            int maxDifferences = Integer.parseInt(br.readLine());// reads line 3, Amount of bits that may differ form generated message

            String line;
            while ((line = br.readLine()) != null) {
                BinaryNumber convertedMessage = Converter.convert(line);
                BinaryNumber message = new BinaryNumber(n + 1);// message that is currently being analyzed

                do {
                    encodedMessage = Encoder.encode(message);


                    if (Comparator.compare(encodedMessage, convertedMessage, maxDifferences)) {//if it is correct
                        System.out.println(message);
                        break;
//                    }
                    }

                } while (message.incrementNumber());

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println("Error has occured while decoding messages7");
        }





        System.out.println("\n\nDecrypted messages form messages13.txt: ");

        try{
            BufferedReader br = new BufferedReader(new FileReader("messages/messages13.txt"));

            int n = Integer.parseInt(br.readLine()) - 1; // reads line 1
            br.readLine(); // skips line 2
            int maxDifferences = Integer.parseInt(br.readLine());// reads line 3, Amount of bits that may differ form generated message

            String line;
            while ((line = br.readLine()) != null) {
                BinaryNumber convertedMessage = Converter.convert(line);
                BinaryNumber message = new BinaryNumber(n + 1);// message that is currently being analyzed

                do {
                    encodedMessage = Encoder.encode(message);


                    if (Comparator.compare(encodedMessage, convertedMessage, maxDifferences)) {//if it is correct
                        System.out.println(message);
                        break;
//                    }
                    }

                } while (message.incrementNumber());

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println("Error has occured while decoding messages13");
        }





        System.out.println("\n\nDecrypted messages form messages16.txt: ");

        try{
            BufferedReader br = new BufferedReader(new FileReader("messages/messages16.txt"));

            int n = Integer.parseInt(br.readLine()) - 1; // reads line 1
            br.readLine(); // skips line 2
            int maxDifferences = Integer.parseInt(br.readLine());// reads line 3, Amount of bits that may differ form generated message

            String line;
            while ((line = br.readLine()) != null) {
                BinaryNumber convertedMessage = Converter.convert(line);
                BinaryNumber message = new BinaryNumber(n + 1);// message that is currently being analyzed

                do {
                    encodedMessage = Encoder.encode(message);


                    if (Comparator.compare(encodedMessage, convertedMessage, maxDifferences)) {//if it is correct
                        System.out.println(message);
                        break;
//                    }
                    }

                } while (message.incrementNumber());

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println("Error has occured while decoding messages16");
        }

    }
}
