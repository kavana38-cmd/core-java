class MovieCollection{
    
	static String movieNames[] = {
        "Kantara",
        "KGF",
        "Bahubali",
        "RRR",
        "Pushpa",
        "Charlie 777",
        "Vikram",
        "Leo"
    };

    static float movieCollection[] = {
        400f,1200f,1800f,1300f,350f,150f,450f,600f
    };

    static double movieRatings[] = {
        4.8,4.7,4.9,4.8,4.5,4.6,4.7,4.4
    };

    static String movieLanguage[] = {
        "Kannada","Kannada","Telugu","Telugu","Telugu","Kannada","Tamil","Tamil"
    };

    public static void getMovieDetails()
    {
        for(int i=0;i<movieNames.length;i++)
        {
            System.out.println(movieNames[i]+" | "+movieCollection[i]+"Cr | "+movieRatings[i]+" | "+movieLanguage[i]);
        }
    }
}