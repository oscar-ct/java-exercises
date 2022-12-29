public class ThroughTheFog {
    int circleOfNumbers(int n, int firstNumber) {
        return (n/2 + firstNumber) % n;
    }

    int depositProfit(int deposit, int rate, int threshold) {
        int total = deposit;
        int count = 0;
        while (total < threshold) {
            double amount = (double)rate / 100 * total;
            total += amount;
            count++;
        }
        return count;
    }

    int absoluteValuesSumMinimization(int[] a) {
        int[] arr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int total = 0;
            for (int j = 0; j < a.length; j++) {
                total += Math.abs(a[i] - a[j]);
            }
            arr[i] = total;
        }
        int min = arr[0];
        for (int k = 1; k < arr.length; k++) {
            if (arr[k] < min) {
                min = arr[k];
            }
        }
        int index = 0;
        for (int l = 0; l < arr.length; l++) {
            if (arr[l] == min) {
                index = l;
                break;
            }
        }
        return a[index];
    }
}
