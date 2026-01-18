// IF ELSE SWITCH - REAL-WORLD LOGIC PROGRAMS
// 27. Calculate profit or loss percentage.

class p27{
    public static void main (String[] args){
        int cost_price = 1200;
        int selling_price = 600;
        double profit_amount = selling_price - cost_price;
        double loss_amount = cost_price - selling_price;

        // Profit % = (Profit / Cost Price) × 100
        // Loss % = (Loss / Cost Price) × 100

        double profit_percentage = (profit_amount / cost_price) * 100;
        double loss_percentage = (loss_amount / cost_price) * 100;

        if ( cost_price < selling_price){
            System.out.println("Profit:" + profit_amount + "\nProfit %: " + profit_percentage);
        }
        else if (cost_price > selling_price){
            System.out.println("Loss: " + loss_amount + "\nLoss %: " + loss_percentage);
        }
        else {
            System.out.println("No Profit, No Loss");
        }
    }
}
