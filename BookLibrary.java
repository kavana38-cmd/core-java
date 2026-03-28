class BookLibrary{
    static String bookNames[] = {
        "Harry Potter",
        "The Alchemist",
        "Wings of Fire",
        "Rich Dad Poor Dad",
        "Think and Grow Rich",
        "Atomic Habits",
        "The Power of Habit",
        "Ikigai"
    };

    static float bookPrice[] = {
        450f,350f,300f,400f,380f,420f,390f,410f
    };

    static double bookRatings[] = {
        4.8,4.6,4.7,4.5,4.4,4.7,4.5,4.6
    };

    static String bookAuthor[] = {
        "J.K.Rowling","Paulo Coelho","A.P.J Abdul Kalam","Robert Kiyosaki",
        "Napoleon Hill","James Clear","Charles Duhigg","Hector Garcia"
    };

    public static void getBookDetails()
    {
        for(int i=0;i<bookNames.length;i++)
        {
            System.out.println(bookNames[i]+" | "+bookPrice[i]+" | "+bookRatings[i]+" | "+bookAuthor[i]);
        }
    }
}