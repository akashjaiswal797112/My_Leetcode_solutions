// class Solution {
//     public boolean isPalindrome(String s) {
        
       
//         StringBuilder builder = new StringBuilder();
//         String str=s.toLowerCase();
//         for (int i = 0; i < str.length(); i++){
         
//             if(  ((str.charAt(i)>='a') && (str.charAt(i)<='z')) || ((str.charAt(i)>='0') && (str.charAt(i)<='9')))
//             builder.append(str.charAt(i));
//         }
//         String oldString = builder.toString();
//         String reverse = String.valueOf(builder.reverse());
//         if(oldString.equals(reverse))
//             return true;
//         else
//             return false;
//     }
// }

class Solution {
public boolean isPalindrome(String s) {

    // base case
    if(s.length() < 2) return true;
    
    // convert given string to lowercase
    String s1 = s.toLowerCase();
    
    // keep only alphanumeric characters
    String newStr = s1.replaceAll("[^a-z0-9]+", "");
    
    // create new string by reversing newStr 
    String check = reverse(newStr);
    
    // if the two strings match, then it is a palindrome
    if(newStr.equals(check))
        return true;
    
    return false;
}

// function to reverse a given string
private String reverse(String str) {
    StringBuilder res = new StringBuilder(str);
    res.reverse();
    return res.toString();
}
}