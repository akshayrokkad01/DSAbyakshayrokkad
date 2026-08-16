class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        int rb = 0;
        int re = matrix.length - 1;
        int cb = 0;
        int ce = matrix[0].length - 1;

        while (rb <= re && cb <= ce) {

            // RIGHT →
            for (int i = cb; i <= ce; i++) {
                result.add(matrix[rb][i]);
            }
            rb++;

            // DOWN ↓
            for (int j = rb; j <= re; j++) {
                result.add(matrix[j][ce]);
            }
            ce--;

            // LEFT ←
            if (rb <= re) {
                for (int i = ce; i >= cb; i--) {
                    result.add(matrix[re][i]);
                }
                re--;
            }

            // UP ↑
            if (cb <= ce) {
                for (int j = re; j >= rb; j--) {
                    result.add(matrix[j][cb]);
                }
                cb++;
            }
        }

        return result;
    }
}