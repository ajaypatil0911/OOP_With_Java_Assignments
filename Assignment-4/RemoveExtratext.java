 class Demo {
    public static void main(String[] args) {
        
        String originalText = "Please read - Do not disturb";
        String substringToDelete = "- Do not disturb";
        
         
        StringBuilder sb = new StringBuilder(originalText);
        
        int startIndex = sb.indexOf(substringToDelete);
        
        if (startIndex != -1) {
            int endIndex = startIndex + substringToDelete.length();
            sb.delete(startIndex, endIndex);
        }
        
        System.out.println(sb.toString());
    }
}