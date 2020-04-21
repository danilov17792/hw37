public class Main {

    public static void main(String[] args) {
        try {
            TestRun.start(testClass.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}