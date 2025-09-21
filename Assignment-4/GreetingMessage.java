public class GreetingMessage {
    public static void main(String[] args) {
        
        // Corrected Initial Text
        String initialText = "Hello ";   // length = 6 (क्योंकि space भी गिना जाता है)
        String textToInsert = "CDAC ";
        int insertIndex = 6;  // अब valid है
        String textToAppend = "Java Student";
        
        StringBuilder sb = new StringBuilder(initialText);
        
        sb.insert(insertIndex, textToInsert);
        sb.append(textToAppend);
        
        System.out.println(sb.toString());
    }
}