class Solution {
    public int countDigits(int n) {
        int num=n;
        int sum=0;
    while(n>0){
        int d=n%10;
        if(num %d==0){
            sum=sum+1;
        }
        n=n/10;
    } 
     return sum; 
    }
}