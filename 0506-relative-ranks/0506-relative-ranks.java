class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer, String> map = new HashMap<>();

        int[] arr = score.clone();
        int n = score.length;
        String[] arr1 = new String[n];

        Arrays.sort(score);

        for (int i = 0; i < n; i++) {
            int rank = n - i;

            if (rank == 1) {
                map.put(score[i], "Gold Medal");
            } else if (rank == 2) {
                map.put(score[i], "Silver Medal");
            } else if (rank == 3) {
                map.put(score[i], "Bronze Medal");
            } else {
                map.put(score[i], String.valueOf(rank));
            }
        }

        for (int i = 0; i < n; i++) {
            arr1[i] = map.get(arr[i]);
        }

        return arr1;
    }
}