class Solution {

    public int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int idx = i;
            int num = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > num) num = arr[j];
            }

            arr[idx] = num;
        }

        int len = arr.length - 1;
        arr[len] = -1;
        return arr;
    }
}
