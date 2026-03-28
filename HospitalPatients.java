class HospitalPatients{
    
	static String patientNames[] = {
        "Ramesh","Suresh","Anita","Pooja","Vikram","Neha","Arun","Deepa"
    };

    static int patientAge[] = {
        45,50,30,28,60,35,40,32
    };

    static double patientRatings[] = {
        4.2,4.1,4.4,4.3,4.0,4.5,4.2,4.3
    };

    static String patientDepartment[] = {
        "Cardiology","Orthopedics","Neurology","Gynecology",
        "Dermatology","ENT","General","Pediatrics"
    };

    public static void getPatientDetails()
    {
        for(int i=0;i<patientNames.length;i++)
        {
            System.out.println(patientNames[i]+" | "+patientAge[i]+" | "+patientRatings[i]+" | "+patientDepartment[i]);
        }
    }
}