public class Solution {
    public String simplifyPath(String path) {
        Stack<String> s1 = new Stack<String>();
        Stack<String> s2 = new Stack<String>();
        String res="";
        String[] temp = path.split("/");
        for( String token: temp){
            if(!token.equals("")&&!token.equals(".")){
              if(token.equals("..")){
                  if(!s1.isEmpty()){s1.pop();}
              }
              else{s1.push(token);}
            }
        }
        while(!s1.isEmpty()){s2.push(s1.pop());}
        if(s2.isEmpty()){res+="/";}
        else{
            while(!s2.isEmpty()){
                res+="/";
                res+=s2.pop();
            }
        }
        return res;
    }
}
