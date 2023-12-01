public class Converter {
    static BinaryNumber convert(String stringMessage) {
        int length = stringMessage.length();
        BinaryNumber binaryNumber = new BinaryNumber(length);
        char[] charArray = stringMessage.toCharArray();

        for (int i = 0; i < length; i++) {
            if(charArray[i] == '1') {
                binaryNumber.getBinNumber().set(i);
            }
        }
        return binaryNumber;
    }
}
