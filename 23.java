// Was able to solve this question but TC was inefficient so I looked upon a solution with efficient TC than me. 
// This is the soultion with efficient TC which I looked upon

// TC : O(m*n * log(D)) , D stand min(m, n)
// SC: O(m*n)


class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        Map<Integer, PriorityQueue<Integer>> map =new HashMap<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int diagonalKey = i-j;
                PriorityQueue<Integer> pq = map.getOrDefault(diagonalKey, new PriorityQueue<>());
                pq.offer(mat[i][j]);
                map.put(diagonalKey, pq);
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int diagonalKey = i-j;
                PriorityQueue<Integer> pq = map.get(diagonalKey);

                mat[i][j] =pq.poll();
            }
        }
        return mat;
    }
}
