class Solution {
    public String interpret(String command) {
        
       String a = command.replace("()","o").replace("(al)","al");
     //  String last =  a.replace("(al)","al");
        return a;
        
        
// return command.replace("()","o").replace("(al)","al");

    }
}