package Strings;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 32;
        int fourthBitValue = fourthBit(number);
        System.out.println(fourthBitValue);  
	}
	public static int fourthBit(int number) {
        // Convert the decimal number to binary
        String binary = Integer.toBinaryString(number);

        // Determine the length of the binary representation
        int binaryLength = binary.length();

        // Calculate the index of the 4th least significant digit
        int fourthBitIndex = binaryLength - 4;

        // Check if the index is within the range of the binary representation
        if (fourthBitIndex >= 0 && fourthBitIndex < binaryLength) {
            // Retrieve the 4th least significant digit from the binary representation
            char fourthBitChar = binary.charAt(fourthBitIndex);

            // Convert the bit value from char to int and return it
            return Character.getNumericValue(fourthBitChar);
        } else {
            // If the index is out of range, return 0
            return 0;
        }
    }
}
