import java.util.BitSet;

public class BinaryNumber {
    private BitSet binNumber;
    private int index;
    private int size;


    public BinaryNumber(int size) {
        this.binNumber = new BitSet();
        this.size = size;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < size; i++) {
            stringBuilder.append(binNumber.get(i) ? "1" : "0");
        }

        return stringBuilder.toString();
    }


boolean incrementNumber() {
        //This method increments the binary number stored in class object. Will return true once it has reached the biggest number it can store
        index = size - 1;

        while(index >= 0){
            if(!binNumber.get(index)) {
                binNumber.set(index);
                break;
            }
            else {
                binNumber.clear(index);
            }
            index--;
        }
        if(index < 0) {
            return false;
        }
        else {
            return true;
        }
    }

    public BitSet getBinNumber() {
        return binNumber;
    }

    public int getSize() {
        return size;
    }
}
