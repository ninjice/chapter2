
public class Palindrome{
    String word;
    private boolean isPalindrome;
    
    public Palindrome(String wd)
    {
        // initialise instance variables
        this.word = wd;
        }
    
    public boolean testPalindrome(){
        int length = word.length();
        for(int i = 0; i < length; i++){
            String[] list = new String[word.length()];
            System.out.println(word.substring(i, i+1));
            //list.append(word.substring(i, i+1));
            if(i == length/2){
            
            }
            
        }
        if(word.length() % 2 == 0){
            
        }
        return isPalindrome;
    }
}
