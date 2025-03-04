public class ReverseSentence {
    public static void main(String[] args) {
        String s = "I    love Java programming";
        String result = "", word = "";
        boolean spaceFound = false;

        

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);


            if (ch != ' ') 
            {
                word = ch + word;
                spaceFound=false;
            }
                
             else if (!spaceFound && !word.isEmpty()) 
             {  
                    result += word + " ";
                    word = ""; 
                    spaceFound=true; 
            }
        }

        result+=word;
        System.out.println(result);
    }
}
