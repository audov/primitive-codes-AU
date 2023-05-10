public class Main {
       public static void main(String[] args) {
        int ticketPrice = 32500; // стоимость билета
        int mileCost = 20; // стоимость мили в рублях
        int mileQuantity = ticketPrice / mileCost; // количество начисленных миль

        System.out.println("Количество бонусных миль за покупку билета составило:");
        System.out.println(mileQuantity + " бонусных миль");

    }
}