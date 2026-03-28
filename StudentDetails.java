class StudentDetails{
    
	static String studentNames[] = {
        "Rahul","Priya","Arjun","Sneha","Ravi","Kavya","Manoj","Divya"
    };

    static int studentMarks[] = {
        85,90,78,88,92,80,76,89
    };

    static double studentRatings[] = {
        4.2,4.5,4.0,4.4,4.6,4.1,3.9,4.3
    };

    static String studentDepartment[] = {
        "BCA","BCom","BBA","BCA","BSc","BCA","BBA","BCom"
    };

    public static void getStudentDetails()
    {
        for(int i=0;i<studentNames.length;i++)
        {
            System.out.println(studentNames[i]+" | "+studentMarks[i]+" | "+studentRatings[i]+" | "+studentDepartment[i]);
        }
    }
}