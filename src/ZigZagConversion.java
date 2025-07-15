import java.util.Arrays;
import java.util.Map;

public class ZigZagConversion {
    public String convert(String input, int numRows) {
        int len = input.length();
        Character[][] matrix = new Character[numRows][Math.ceilDiv(len, numRows) * numRows];
        int rowPos = 0, colPos = 0;
        boolean zig = false;
        String res = "";

        if(numRows == 1 || numRows >= len) return input;

        for (int i = 0; i < len; i++) { // iterate through the word

            // this loop inserts
            if (rowPos < numRows) {
                matrix[rowPos][colPos] = (input.charAt(i));
            }

            // Only advance to next column on the zig
            if (rowPos == numRows - 1) zig = true;
            if (rowPos == 0) zig = false;

            if (zig) {
                rowPos--;
                colPos++;
            } else{
                rowPos++;
            }
        }

        System.out.println(Arrays.deepToString(matrix));

        for (Character[] chrs : matrix) {
            for (int j = 0; j < chrs.length; j++) {
                if(chrs[j] != null){
                res = res.concat(String.valueOf(chrs[j]));
                }
            }
        }

        return res;
    }

}
