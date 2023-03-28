public class App {
    public static void main(String[] args) throws Exception {    
        Calendar calendar = new Calendar();
        calendar.verifyDate("01/01/2023");
        calendar.verifyDate("21/02/2023");
        calendar.verifyDate("01/02/2023");
    }
}
