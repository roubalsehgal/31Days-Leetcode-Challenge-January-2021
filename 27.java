class Solution {
    int MOD = 1000000007;
    public int concatenatedBinary(int n) {
        long res = 0;
        int moves = 0;
        
        for(int i=1;i<n+1; i++) {
            moves = (i>>moves == 0)? moves: moves+1;
            res = ((res<<moves)%MOD + i)%MOD;
        }
        
        return (int)res;
    }
}
