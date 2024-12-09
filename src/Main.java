public class Main {
    public static void main(String[] args) {
        Time time1 = new Time(8, 9, 58);
        System.out.println("Expected result: 08:09:58");
        System.out.println("Actual result: " + time1);
        time1.tick();
        System.out.println("Expected result: 08:09:59");
        System.out.println("Actual result: " + time1);
        time1.tick();
        System.out.println("Expected result: 08:10:00");
        System.out.println("Actual result: " + time1);
        time1.tick();
        System.out.println("Expected result: 08:10:01");
        System.out.println("Actual result: " + time1);

        Time time2 = new Time(15, 59, 58);
        System.out.println("Expected result: 15:59:58");
        System.out.println("Actual result: " + time2);

    }
}