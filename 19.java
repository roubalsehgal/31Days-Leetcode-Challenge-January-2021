class Solution { 
    public String longestPalindrome(String e) {
       int n=e.length();
		int dp[][]=new int[n+1][n+1];
		String res="";
		int resE=1,resL=1;//length and end index of palindrom
		if(n==0)return res;
		
		for(int i=0;i<=n;i++) dp[0][i]=dp[1][i]=1;
		
		for(int i=2;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				if(e.charAt(j-1)==e.charAt(j-i) && dp[i-2][j-1]==1) {                    //first and last chars are same and remaining middle is also same 
					dp[i][j] = 1;
					resL = i;
					resE = j;
				}
				else dp[i][j]=0;
			}
		}
        
		return e.substring(resE-resL,resE);
    }
}
