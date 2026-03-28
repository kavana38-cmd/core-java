class AirPurifier {

    // 1. Method without return type and without parameters
    public static void purifyAir() {
        System.out.println("Air Purifier is cleaning the air efficiently");
    }

    // 2. Method without return type and with 5 parameters
    public static void getPurifierDetails(String brand,
                                          String filterType,
                                          int roomSize,
                                          int powerConsumption,
                                          String color) {

        System.out.println("Invoking getPurifierDetails");
        System.out.println("Brand : " + brand);
        System.out.println("Filter Type : " + filterType);
        System.out.println("Room Size Coverage : " + roomSize + " sq.ft");
        System.out.println("Power Consumption : " + powerConsumption + " watts");
        System.out.println("Color : " + color);
    }

    // 3. Method with 1 parameter (Price)
    public static void getPrice(double price) {
        System.out.println("Price of Air Purifier : ₹" + price);
    }
}