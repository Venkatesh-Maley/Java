// IF ELSE SWITCH - REAL-WORLD LOGIC PROGRAMS
// 26. Calculate profit or loss based on cost price and selling price.

class p26{
    public static void main (String[] args){
        int cost_price = 100;
        int selling_price = 120;

        if ( cost_price < selling_price){
            System.out.println("Profit");
        }
        else if (cost_price > selling_price){
            System.out.println("Loss");
        }
        else {
            System.out.println("No Profit, No Loss");
        }
    }
}