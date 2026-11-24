class Solution {
    public boolean isHappy(int n) {

        while(n!=1 && n!=4){
            int p=0;
            while(n!=0){
                int r=n%10;
                p+=r*r;
                n=n/10;
            }
            n=p;
        }
        return n==1;
    }
}