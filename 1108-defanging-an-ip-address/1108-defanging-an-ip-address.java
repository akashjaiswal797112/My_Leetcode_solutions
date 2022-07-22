class Solution {
    public String defangIPaddr(String address) {
     
       //  String address = "255.100.50.0";
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < address.length(); i++) {

            if(address.charAt(i)=='.')
            {
                builder.append("[.]");
            }
            else
            {
                builder.append(address.charAt(i));
            }
        }

       
        return builder.toString();

        
        
    }
}