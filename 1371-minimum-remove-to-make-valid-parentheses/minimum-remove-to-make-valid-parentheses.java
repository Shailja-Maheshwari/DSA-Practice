class Solution {
    public String minRemoveToMakeValid(String s) {
          Stack<Integer> st=new Stack<>();
          boolean[] n=new boolean[s.length()];
          for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                st.push(i);
            }
            else if(c==')'){
                if(st.isEmpty()) n[i]=true;
                else st.pop();
            }
          }
          while(!st.isEmpty()){
            n[st.pop()]=true;

          }
          StringBuilder ans=new StringBuilder();
         
        for (int i = 0; i < s.length(); i++) {
            if (!n[i]) {
                ans.append(s.charAt(i));
            }
        }

          return ans.toString();
    }
}