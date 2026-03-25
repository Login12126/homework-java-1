public class Main {
    public static void main(String[] args) {
        int ticketAmount = 10_000;
        int oneBonusMile = 20;
        int bonus = ticketAmount / oneBonusMile;
        System.out.println(" Количество начисляемых миль за купленный билет: " + bonus);
    }
}