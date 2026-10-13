class Solution {
    public int differenceOfSums(int n, int m) {
        int s=0,s2=0;
     for(int i=0;i<=n;i++){
    if( i%m!=0){
     s=s+i;
    }
     } 
      for(int i=0;i<=n;i++){
    if( i%m==0){
     s2=s2+i;
    }
     }  
     return s-s2;
    }
}