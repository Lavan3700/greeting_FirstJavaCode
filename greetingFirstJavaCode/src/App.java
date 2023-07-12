public class App {
    public static void main(String[] args) {
        String name = "Lavan";
        String job = "Lehrling";
        Integer age = 99;
        String city = "New York";

        showGreeting(20);

        System.out.println("Ich heisse " + name + " und ich bin ein " + job + ". Aktuell bin ich " + age + " Jahre alt und wohne in der Stadt " + city + ".");
    }

    public static void showGreeting(Integer hour) {     
        if(hour < 12) {
            System.out.println("Guten Morgen!");
        } else if (hour < 18) {
            System.out.println("Guten Mittag!");
        } else {
            System.out.println("Guten Abend!");
        }
    }
}
