public class OrderOnlineSystemApp {
    public static void main(String[] args) {
        //Burger DB
        Burger pilotBurger = new Burger();
        pilotBurger.setName("Pilot Burger");
        pilotBurger.setPrice(10);
        pilotBurger.setIngredients("Beef burger, bacon, cheese, tomato, onion and burger sauce");

        //Pizza DB
        Pizza meatFeast = new Pizza();
        meatFeast.setName("Meat Feast Pizza");
        meatFeast.setPrice(14);
        meatFeast.setIngredients("Chicken, bacon, pepperoni and meatballs");

        //Salad DB
        Salad caesarSalad = new Salad();
        caesarSalad.setName("Caesar Salad");
        caesarSalad.setPrice(12);
        caesarSalad.setIngredients("Gem lettuce, chicken, bacon, parmessan and caesar sauce");

        MenuItem[] menuItems = new MenuItem[] {
                //add menu items

        };

        //display details of each menu item
        for (MenuItem menuItem : menuItems) {
            //print out the Name, Description and price for each item

        }

        //calculate and display the total cost of the order

        double totalCost = 0;
        for (MenuItem menuItem : menuItems) {
            //total cost of all items on order list

        }
        System.out.println("Total Cost: €" + totalCost);
    }
}
