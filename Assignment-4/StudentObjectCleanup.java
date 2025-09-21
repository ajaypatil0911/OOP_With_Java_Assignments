public class Problem22 {
    static class Student {
        String name;

        Student(String name) {
            this.name = name;
        }

        // finalize method called before GC destroys the object
        @Override
        protected void finalize() {
            System.out.println("Student object for " + name + " is being garbage collected");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Amit");
        s1 = null;  // object is now eligible for GC

        // Request garbage collection
        System.gc();

        // Pause to let GC run
        try { Thread.sleep(1000); } catch (Exception e) {}
    }
}