import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class EdgeOfTheOcean {


    int adjacentElementsProduct (int @NotNull [] inputArray) {
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 0; i < inputArray.length - 1; i++) {
            numList.add(inputArray[i] * inputArray[i + 1]);
        }
//        int maximum = numList.get(0);
//        for (int i = 1; i < numList.size(); i++) {
//            if (maximum < numList.get(i))
//                maximum = numList.get(i);
//        }
        System.out.println(Collections.max(numList));
//        return maximum;
        return Collections.max(numList);
    }

    int shapeArea (int n) {
        return (n*n) + ((n-1)*(n-1));
    }


    int makeArrayConsecutive2 (int[] statues) {
        Arrays.sort(statues);
        int low = statues[0];
        int high = statues[statues.length - 1];
        return high - low + 1 - statues.length;
    }


    boolean almostIncreasingSequence(int[] sequence) {
        int count = 0;
        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] >= sequence[i+1]) {
                count++;
            }
            if (i - 1 >= 0 && i + 2 <= sequence.length - 1 && sequence[i] - sequence[i+2] >= 0 && sequence[i-1] - sequence[i+1] >= 0) {
                return false;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }



    int matrixElementsSum (int[][] matrix) {
        int total = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int matrixLoop = matrix[j][i];
                // System.out.println(matrixLoop);
                if (matrixLoop == 0) {
                    // System.out.println(matrixLoop);
                    break;
                } else {
                    total += matrixLoop;
                    // System.out.println(matrixLoop);
                }
            }
        }
        return total;
    }



}
