// IF ELSE SWITCH - REAL-WORLD LOGIC PROGRAMS
// 28. Calculate electricity bill:

// First 100 units - Ruppes 1/unit

// Next 100 units - Ruppes 2/unit

// Above 200 units - Ruppes 3/unit

class p28 {
    public static void main(String[] args) {

        int units = 250;
        int bill = 0;

        if (units <= 100) {
            bill = units * 1;
        }
        else if (units <= 200) {
            bill = (100 * 1) + (units - 100) * 2;
        }
        else {
            bill = (100 * 1) + (100 * 2) + (units - 200) * 3;
        }

        System.out.println("Electricity Bill: Rs." + bill);
    }
}
