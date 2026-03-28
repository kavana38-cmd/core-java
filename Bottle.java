class Bottle{
    static String bottleNames[] = {
        "Milton Steel Bottle",
        "Cello Water Bottle",
        "Tupperware Bottle",
        "Pigeon Baby Bottle",
        "Signoraware Bottle",
        "Milton Thermosteel",
        "Cello H2O Bottle",
        "Borasil Bottle"
    };

    static float bottlePrice[] = {
        350f, 200f, 450f, 300f, 280f, 600f, 220f, 500f
    };

    static double bottleRatings[] = {
        4.4,4.2,4.5,4.3,4.1,4.6,4.0,4.5
    };

    static String bottleBrand[] = {
        "Milton","Cello","Tupperware","Pigeon","Signoraware","Milton","Cello","Borasil"
    };

    public static void getBottleDetails()
    {
        for(int i=0;i<bottleNames.length;i++)
        {
            System.out.println(bottleNames[i]+" | "+bottlePrice[i]+" | "+bottleRatings[i]+" | "+bottleBrand[i]);
        }
    }
}