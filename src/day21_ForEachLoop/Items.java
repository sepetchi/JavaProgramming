package day21_ForEachLoop;

public class Items {
    public static void main(String[] args) {
        String []items = {"Shoes", "Jacket", "Gloves", "Airpods", "Ipad", "Ipad Case"};
        Double[] prices = {99.0, 150.0 , 9.9, 250.0, 439.0, 39.99};
        int[] itemIDs= {12345, 12346, 12347, 12348, 12349,12350};

        for (int i = 0; i <items.length ; i++) {
            String item = items[i];
            double price = prices[i];
            int id = itemIDs[i];

            System.out.println(item+" - "+id+" - $"+price);

        }
    }
}
