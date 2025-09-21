public class NotificationUpdate {
    public static void main(String[] args) {
        
        
        String originalText = "Exam postponed";
        String textToFind = "postponed";
        String replacementText = "rescheduled";
        
        
        StringBuilder sb = new StringBuilder(originalText);
        
        
        int startIndex = sb.indexOf(textToFind);
       
        if (startIndex != -1) {
            int endIndex = startIndex + textToFind.length();
            sb.replace(startIndex, endIndex, replacementText);
        }
        
      
        System.out.println(sb.toString());
    }
}