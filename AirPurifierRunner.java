class AirPurifierRunner {

    public static void main(String[] args) {

        // Calling method without parameters
        AmazonAirPurifier.purifyAir();

        // Calling method with 5 parameters
        AmazonAirPurifier.getPurifierDetails(
                "Philips",
                "HEPA",
                400,
                50,
                "White"
        );

        // Calling method with 1 parameter
        AmazonAirPurifier.getPrice(12999);
    }
}