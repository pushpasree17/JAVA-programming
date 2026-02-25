public class StringBufferCaseExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello world");
        System.out.println("Original StringBuffer: " + sb);
        
        String upper = sb.toString().toUpperCase();
        System.out.println("Uppercase: " + upper);
      }
}