public class pallindrome {
    public static void findPallindrome(String str , String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i =0;i<str.length();i++){
            char cur = str.charAt(i);
            String newStr = str.substring(0, i)+str.substring(i+1);
            findPallindrome(newStr, ans+cur);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findPallindrome(str,"");
    }
}
