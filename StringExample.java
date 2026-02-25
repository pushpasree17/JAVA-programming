public class StringExample {
    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println("Original String: " + s1);

        s1 = s1.concat(" World"); 
        System.out.println("After Concatenation: " + s1);
        s1=s1.toUpperCase();
        System.out.println("Uppercase:"+s1);
         }
}