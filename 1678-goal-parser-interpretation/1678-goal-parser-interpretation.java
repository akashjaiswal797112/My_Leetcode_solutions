class Solution {
    public String interpret(String command) {
        
       String a = command.replace("()","o");
       String last =  a.replace("(al)","al");

        
        return last;
    }
}