class Solution {
    public int calPoints(String[] operations) {
         Stack<Integer> s = new Stack<>();
         for(String o:operations){
            if(o.equals("C")){
                s.pop();
            }
            else if(o.equals("D")){
                int p=s.peek();
                s.push(2*p);
            }
            else if(o.equals("+")){
                int l=s.pop();
                int sl=s.peek();
                s.push(l);
                s.push(l+sl);
            }
            else{
                s.push(Integer.parseInt(o));
            }
         }
         int t=0;
         for(int i: s){
            t+=i;
         }
         return t;

    }
}