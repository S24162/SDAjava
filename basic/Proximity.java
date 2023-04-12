package pl.sdacademy.java.basic;

class Proximity {
//    int[] values = new int[]{10, 3, 2, 1};
    int[] values;

    static int closestValueIndex(int checked, int... values) {
        int searchIndex = -1;
        int minDifference = Integer.MAX_VALUE;

        for (int i = values.length - 1; i >= 0; i--) {
            final int difference = Math.abs(values[i] - checked);

            if (difference < minDifference) {
                minDifference = difference;
                searchIndex = i;
            }
        }
        return searchIndex;
    }

    int closestValueIndex(int checked) {
        if (values == null)
            return -1;
        return closestValueIndex(checked, this.values);
    }

}

