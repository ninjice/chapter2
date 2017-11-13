public class PalindromeDriver
{
    public static void main(String Args[]){
        Palindrome pablo = new Palindrome("racecar");
        System.out.println("The word is: "+pablo.word);
        System.out.print("Palindrome "+pablo.testPalindrome());
    }
    
}