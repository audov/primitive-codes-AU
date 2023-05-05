public class Main {
       public static void main(String[] args) {
        int ticket_price = 32500; // стоимость билета
        int mile_cost = 20; // стоимость мили в рублях
        int mile_quantity = ticket_price / mile_cost; // количество начисленных миль

        System.out.println("Количество бонусных миль за покупку билета составило:");
        System.out.println(mile_quantity + " бонусных миль");
      
    }
}