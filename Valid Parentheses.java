import java.util.*;


public class Solution {
    public boolean isValid(String s) {
        String leftside = "({[";
        String rightside = ")}]";
        Stack<Character> stk = new Stack<Character>();
        char cmp;
        char x;
        for(int i=0;i<s.length();i++){
          cmp=s.charAt(i);
          if(find(leftside,cmp)){stk.push(cmp);}
          else{
              if(find(rightside,cmp)){
                  if(stk.empty()){return false;}
                  else{x=stk.pop();
                      if((cmp-x)>2){return false;}}
              }
          }
        }
        if(!stk.empty()) return false;
        return true;
        
    }
    public boolean find(String s, char c){
        boolean value = false;
        char m;
        for(int i=0;i<s.length();i++){
            if((m=s.charAt(i))==c){
                value = true;
                break;
            }
        }
        return value;
    }
}
