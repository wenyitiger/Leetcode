 public   boolean isPalindrome(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        StringBuffer sb = new StringBuffer("");
        StringBuffer sb1 = new StringBuffer("");
        Stack<Character> s1 = new Stack<Character>();
        if(s.length()==0) return true;
        if(s.trim().length()==0) return true;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)>='A'&&s.charAt(i)<='Z')  {


            sb.append((char)(s.charAt(i)+32));
             s1.push((char)(s.charAt(i)+32));
            }
            if(s.charAt(i)>='0'&&s.charAt(i)<='9')  {


			            sb.append((char)(s.charAt(i)));
			             s1.push((char)(s.charAt(i)));
            }
            if(s.charAt(i)>='a'&&s.charAt(i)<='z') {


             sb.append((char)s.charAt(i));
            s1.push((char)s.charAt(i));
            }
        }


        String ts = sb.toString();


         while(!s1.empty()){

             sb1.append(s1.pop());

         }



         return sb1.toString().equals(ts);


    }