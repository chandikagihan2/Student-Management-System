import java.util.*;

class students{


}
class batch{


    
}

class StudentManagementSystem {

    // Batch status variables
    public static final int ENROLLMENTOPEN = 1;
    public static final int ENROLLMENTCLOSED = 0;

    // Batch data arrays
    public static int[] batchNameArray = { 105, 106, 107, 108, 109, 110 };
    public static int[] batchStatusArray = { 0, 0, 0, 0, 1, 1 };
    
    // Marks data arrays
    public static int[] prfMarksArray = new int[0];
    public static int[] dbmsMarksArray = new int[0];
    
    // Student data arrays
    public static String[] regNoArray = {
            "PR24105001", "PR24105002", "PR24105003", "PR24105004", "PR24105005",
            "PR24105006", "PR24105007", "PR24105008", "PR24105009", "PR24105010",
            "OR24105011", "OR24105012", "OR24105013", "OR24105014", "OR24105015",
            "PR24105016", "PR24105017", "PR24105018", "OR24105019", "OR24105020",
            "PR24105021", "PR24105022", "OR24105023", "OR24105024", "PR24105025",
            "PR24106001", "PR24106002", "PR24106003", "PR24106004", "PR24106005",
            "PR24106006", "PR24106007", "PR24106008", "PR24106009", "PR24106010",
            "OR24106011", "OR24106012", "OR24106013", "OR24106014", "OR24106015",
            "PR24106016", "PR24106017", "PR24106018", "OR24106019", "OR24106020",
            "PR24106021", "PR24106022", "OR24106023", "OR24106024", "PR24106025",
            "PR24107001", "PR24107002", "PR24107003", "PR24107004", "PR24107005",
            "PR24107006", "PR24107007", "PR24107008", "PR24107009", "PR24107010",
            "OR24107011", "OR24107012", "OR24107013", "OR24107014", "OR24107015",
            "PR24107016", "PR24107017", "PR24107018", "OR24107019", "OR24107020",
            "PR24107021", "PR24107022", "OR24107023", "OR24107024", "PR24107025",
            "PR24108001", "PR24108002", "PR24108003", "PR24108004", "PR24108005",
            "PR24108006", "PR24108007", "PR24108008", "PR24108009", "PR24108010",
            "OR24108011", "OR24108012", "OR24108013", "OR24108014", "OR24108015",
            "PR24108016", "PR24108017", "PR24108018", "OR24108019", "OR24108020",
            "PR24108021", "PR24108022", "OR24108023", "OR24108024", "PR24108025",
            "PR24109001", "PR24109002", "PR24109003", "PR24109004", "PR24109005",
            "PR24109006", "PR24109007", "PR24109008", "PR24109009", "PR24109010",
            "OR24109011", "OR24109012", "OR24109013", "OR24109014", "OR24109015",
            "PR24109016", "PR24109017", "PR24109018", "OR24109019", "OR24109020",
            "PR24109021", "PR24109022", "OR24109023", "OR24109024", "PR24109025",
            "PR24110001", "PR24110002", "PR24110003", "PR24110004", "PR24110005",
            "PR24110006", "PR24110007", "PR24110008", "PR24110009", "PR24110010",
            "OR24110011", "OR24110012", "OR24110013", "OR24110014", "OR24110015",
            "PR24110016", "PR24110017", "PR24110018", "OR24110019", "OR24110020",
            "PR24110021", "PR24110022", "OR24110023", "OR24110024", "PR24110025"
    };

    public static String[] nicArray = {
            "199501012345", "199503153872", "199506202198", "199509102983", "199511258739",
            "199512303498", "199502183764", "199504223198", "199508153210", "199510293417",
            "199601102375", "199604182938", "199606243879", "199608142178", "199610312475",
            "199611173452", "199603293481", "199605083217", "199607232198", "199609192375",
            "199701212483", "199703132487", "199706253478", "199708083298", "199710243651",
            "199712152983", "199702182734", "199704293187", "199705142375", "199709083751",
            "199801032874", "199803232871", "199806193428", "199808013764", "199810242374",
            "199812302984", "199802152348", "199805213471", "199807172398", "199811283472",
            "199901122471", "199903052984", "199906213874", "199908093412", "199910273894",
            "199912153482", "199902202394", "199904163874", "199907293481", "199911083479",
            "200001112374", "200003143478", "200006293874", "200008103471", "200010252984",
            "200012043894", "200002193874", "200004212374", "200005183492", "200007153871",
            "200101232984", "200103083471", "200106273894", "200108123984", "200110043728",
            "200112213874", "200102253471", "200104103874", "200105293784", "200107202983",
            "200201013874", "200203253471", "200206143874", "200208083471", "200210293874",
            "200212183471", "200202103874", "200204123894", "200205283471", "200207153874",
            "200301093874", "200303283471", "200306153874", "200308123471", "200310083874",
            "200312243471", "200302273874", "200304203471", "200305123874", "200307213471",
            "200401153874", "200403123471", "200406293874", "200408083471", "200410213874",
            "200412153471", "200402203874", "200404273471", "200405143874", "200407183471",
            "200501023874", "200503193471", "200506153874", "200508213471", "200510083874",
            "200512293471", "200502123874", "200504153471", "200505283874", "200507173471",
            "200203456782", "200305678901", "199601234567", "199511223344", "200412345678",
            "200512345678", "199909876543", "199812346789", "200010203040", "200608789012",
            "200012345678", "199812345679", "199902345678", "199712345670", "200102345671",
            "200203456782", "200305678901", "199601234567", "199511223344", "200412345678",
            "200512345678", "199909876543", "199812346789", "200010203040", "200608789012",
            "200012345678", "199812345679", "199902345678", "199712345670", "200102345671",
            "200203456782", "200305678901", "199601234567", "199511223344", "200412345678",
            "200203456782", "200305678901", "199601234567", "199511223344", "200412345678"
    };

    public static String[] nameArray = {
            "Gunawardena Weerasinghe", "Senanayake Silva", "Silva Kumara", "Kumara Herath", "Rathnayake Herath",
            "Wijesinghe Bandara", "Rajapaksha Herath", "Senanayake Karunaratne", "Karunaratne Jayasinghe",
            "Gunawardena Silva",
            "Weerasinghe Rajapaksha", "Silva Rathnayake", "Fernando Perera", "Kumara Abeysekera",
            "Ekanayake Rathnayake",
            "Herath Gunawardena", "Abeysekera Silva", "Weerasinghe Silva", "Jayasinghe Dias", "Bandara Rathnayake",
            "Silva Perera", "De Silva Dias", "Abeysekera Jayasinghe", "Rajapaksha Senanayake", "Kumara Karunaratne",
            "Silva Abeysekera", "Jayasinghe Bandara", "Rathnayake Kumara", "Weerasinghe Rajapaksha",
            "Senanayake Herath",
            "Perera Ekanayake", "Herath Jayasinghe", "Kumara Gunawardena", "Abeysekera Silva", "Dias Fernando",
            "Karunaratne Weerasinghe", "Ekanayake Bandara", "Rajapaksha Kumara", "Silva De Silva",
            "Gunawardena Rathnayake",
            "Bandara Karunaratne", "Fernando Perera", "De Silva Silva", "Rajapaksha Gunawardena", "Herath Weerasinghe",
            "Karunaratne Dias", "Jayasinghe Silva", "Senanayake Abeysekera", "Silva Jayasinghe", "Rathnayake Kumara",
            "Gunawardena Kumara", "Rajapaksha Silva", "Perera Jayasinghe", "Silva Ekanayake", "Dias Senanayake",
            "Herath Abeysekera", "Rathnayake Fernando", "Kumara Herath", "Weerasinghe Silva", "Senanayake Karunaratne",
            "Abeysekera Silva", "Bandara Gunawardena", "Karunaratne Weerasinghe", "Perera Herath", "Fernando Dias",
            "Weerasinghe Gunawardena", "Rathnayake Kumara", "Senanayake Fernando", "Silva Bandara", "Herath Rajapaksha",
            "Kumara Jayasinghe", "Abeysekera Perera", "Rathnayake Jayasinghe", "Kumara Weerasinghe",
            "Rajapaksha Ekanayake",
            "Fernando Rajapaksha", "Silva Gunawardena", "Perera Wijesinghe", "Herath Abeysekera",
            "Rajapaksha Ekanayake",
            "Karunaratne Silva", "Weerasinghe Fernando", "Silva Bandara", "Abeysekera Weerasinghe",
            "Kumara Karunaratne",
            "Dias Rajapaksha", "Herath Perera", "Rathnayake Gunawardena", "Ekanayake Jayasinghe", "Gunawardena Silva",
            "Rajapaksha Perera", "Karunaratne Jayasinghe", "Weerasinghe Abeysekera", "Rathnayake Fernando",
            "Kumara Herath",
            "Silva Weerasinghe", "Herath Karunaratne", "Abeysekera Silva", "Gunawardena Ekanayake",
            "Weerasinghe Kumara",
            "Weerasinghe Kumara", "Rajapaksha Abeysekera", "Gunawardena Perera", "Karunaratne Silva",
            "Herath Wijesinghe",
            "Rathnayake Ekanayake", "Silva Fernando", "Abeysekera Rajapaksha", "Fernando Bandara", "Perera Herath",
            "Weerasinghe Jayasinghe", "Silva Karunaratne", "Rathnayake Gunawardena", "Herath Kumara",
            "Abeysekera Silva",
            "Ekanayake Bandara", "Rajapaksha Fernando", "Gunawardena Weerasinghe", "Kumara Karunaratne", "Silva Dias",
            "Perera Weerasinghe", "Karunaratne Rajapaksha", "Jayasinghe Silva", "Rathnayake Perera", "Silva Ekanayake",
            "Silva Karunaratne", "Herath Fernando", "Kumara Jayasinghe", "Weerasinghe Perera", "Abeysekera Rajapaksha",
            "Rathnayake Karunaratne", "Ekanayake Bandara", "Gunawardena Perera", "Silva Wijesinghe",
            "Rajapaksha Jayasinghe",
            "Rathnayake Fernando", "Karunaratne Kumara", "Perera Silva", "Gunawardena Ekanayake", "Bandara Rajapaksha",
            "Silva Herath", "Rathnayake Weerasinghe", "Perera Gunawardena", "Herath Karunaratne", "Silva Rajapaksha",
            "Ekanayake Kumara", "Bandara Herath", "Weerasinghe Rajapaksha", "Karunaratne Abeysekera", "Perera Dias"
    };

    public static int[] prfArray = {
            85, 39, -1, 72, 44,
            91, 60, 38, 95, 49,
            -1, 67, 23, 58, 88,
            81, 73, 29, 62, -1,
            79, 53, 94, 47, 35,
            93, 15, -1, 82, 45,
            88, 23, 79, 37, -1,
            68, 100, 59, 29, 92,
            12, 77, 38, 66, 9,
            84, 51, 32, -1, 97,
            95, -1, 63, 88, 32,
            76, 97, 54, -1, 23,
            90, 35, 81, 61, 44,
            67, 100, 17, 85, 29,
            70, 42, -1, 60, 86,
            86, 57, 91, 35, -1,
            76, 48, 94, 23, 69,
            -1, 80, 55, 88, 32,
            100, 67, 43, -1, 90,
            60, 77, 25, 71, 84,
            92, 68, 59, 85, 63,
            76, 91, 70, 84, 63,
            72, 89, 45, 81, 77,
            68, 63, 88, 75, 90,
            57, 79, 92, 62, 100,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2
    };

    public static int[] dbmsArray = {
            66, 45, 93, 58, -1,
            37, 88, 21, 79, 40,
            76, 54, -1, 69, 92,
            25, 84, 33, 60, 71,
            59, -1, 98, 27, 48,
            35, 91, 60, -1, 72,
            49, 26, 80, 14, 89,
            67, -1, 31, 94, 53,
            78, 5, 90, 24, 86,
            39, -1, 61, 73, 100,
            38, 91, -1, 74, 55,
            82, 66, 49, 99, 13,
            80, 70, 93, 36, 59,
            85, 47, 90, -1, 22,
            77, 34, 63, 100, 29,
            79, 62, 87, -1, 54,
            46, 99, 39, 70, -1,
            75, 83, 58, 92, 30,
            91, 40, 63, 95, 68,
            -1, 66, 21, 88, 37,
            67, 91, 85, 73, 70,
            63, 76, 88, 55, 64,
            79, 80, 59, 92, 68,
            100, 77, 83, 45, 62,
            66, 59, 78, 85, 56,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2
    };

    // Method to check batch status
    public static boolean checkBatchStatus(int batchNo) {
        for (int i = 0; i < batchNameArray.length; i++) {
            if (batchNameArray[i] == batchNo) {
                if (batchStatusArray[i] == ENROLLMENTOPEN) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    // Method to check if NIC already exists
    public static boolean checkNIC(String nic) {
        for (int i = 0; i < nicArray.length; i++) {
            if (nicArray[i].equals(nic)) {
                return false; 
            }
        }
        return true;
    }

    // Console clear method
    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

    // Exit method
    public static void exit() {
        clearConsole();
        System.out.println("\n\t\tYou left the program...\n");
        System.exit(0);
    }

    // Home page menu
    public static void homePage() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\t\tiCET Student Management System\t\t|");
        System.out.println("-----------------------------------------------------------------\n");
        System.out.println("[1] Student Management");
        System.out.println("\n[2] Batch Management ");
        System.out.println("\n[3] Grade Management");
        System.out.println("\n[4] Report Generator");
        System.out.println("\n[5] Exit");

        Scanner input = new Scanner(System.in);
        do {
            System.out.print("\n\nEnter an option to continue > ");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    clearConsole();
                    studentManagement();
                    break;
                case 2:
                    clearConsole();
                    batchManagement();
                    break;
                case 3:
                    clearConsole();
                    gradeManagement();
                    break;
                case 4:
                    clearConsole();
                    reportGenerator();
                    break;
                case 5:
                    exit();
                    break;
            }
        } while (true);
    }

    // Student Management Menu
    public static void studentManagement() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\t\tStudent Management\t\t\t|");
        System.out.println("-----------------------------------------------------------------\n");
        System.out.println("[1] Add Student");
        System.out.println("\n[2] Update Student ");
        System.out.println("\n[3] View Student Profile");
        System.out.println("\n[4] Delete Student Profile");
        System.out.println("\n[5] Exit");

        Scanner input = new Scanner(System.in);
        do {
            System.out.print("\n\nEnter an option to continue > ");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    clearConsole();
                    addStudent();
                    break;
                case 2:
                    clearConsole();
                    updateStudent();
                    break;
                case 3:
                    clearConsole();
                    viewStudentProfile();
                    break;
                case 4:
                    clearConsole();
                    deleteStudentProfile();
                    break;
                case 5:
                    exit();
                    break;
            }
        } while (true);
    }

    // Add Student Method
    public static void addStudent() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\t\tAdd Student\t\t\t\t|");
        System.out.println("-----------------------------------------------------------------\n");

        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter batch Number (Student should be added): ");
        int batchNo = input.nextInt();

        // Batch Check
        if (checkBatchStatus(batchNo)) {
            System.out.print("\nEnter student NIC: ");
            String nic = input.next();

            // NIC Check
            if (checkNIC(nic)) {
                System.out.print("\nEnter student name > ");
                input.nextLine();
                String name = input.nextLine();

                System.out.print("\nEnter lecture mode (physical-1/online-0) > ");
                int mode = input.nextInt();

                String newRegNo = "";

                // Registration No logic
                if (mode == 1 || mode == 0) {
                    String lastRegNo = regNoArray[regNoArray.length - 1];
                    int lastNumber = Integer.parseInt(lastRegNo.substring(2));
                    int nextNumber = lastNumber + 1;

                    if (mode == 1) {
                        newRegNo = "PR" + nextNumber;
                    } else {
                        newRegNo = "OR" + nextNumber;
                    }

                    // NIC Array Update
                    String[] tempNicArray = new String[nicArray.length + 1];
                    for (int i = 0; i < nicArray.length; i++) {
                        tempNicArray[i] = nicArray[i];
                    }
                    tempNicArray[tempNicArray.length - 1] = nic;
                    nicArray = tempNicArray;

                    // Name Array Update
                    String[] tempNameArray = new String[nameArray.length + 1];
                    for (int i = 0; i < nameArray.length; i++) {
                        tempNameArray[i] = nameArray[i];
                    }
                    tempNameArray[tempNameArray.length - 1] = name;
                    nameArray = tempNameArray;

                    // RegNo Array Update
                    String[] tempRegNoArray = new String[regNoArray.length + 1];
                    for (int i = 0; i < regNoArray.length; i++) {
                        tempRegNoArray[i] = regNoArray[i];
                    }
                    tempRegNoArray[tempRegNoArray.length - 1] = newRegNo;
                    regNoArray = tempRegNoArray;

                    System.out.println("\n\n\tStudent Registration No - " + newRegNo);
                    System.out.println("\nStudent was successfully added to the system");

                } else {
                    System.out.println("Invalid Lecture Mode!");
                }

                // Add Another Student
                System.out.print("\nDo you want to add another student (Y/N): ");
                String select = input.next().toUpperCase();
                if (select.equals("Y")) {
                    clearConsole();
                    addStudent();
                } else {
                    clearConsole();
                    homePage();
                }

            } else {
                System.out.println("\n\n\tAlready added student (NIC Exists)...");
                System.out.print("\nDo you want to try again (Y/N): ");
                String select = input.next().toUpperCase();
                if (select.equals("Y")) {
                    clearConsole();
                    addStudent();
                } else {
                    clearConsole();
                    homePage();
                }
            }
        } else {
            System.out.println("\n\tStudents cannot be added. Enrollment is closed for Batch " + batchNo);
            System.out.print("\nDo you want to try another batch (Y/N): ");
            String select = input.next().toUpperCase();
            if (select.equals("Y")) {
                clearConsole();
                addStudent();
            } else {
                clearConsole();
                homePage();
            }
        }
    }

    // Update Student Method
    public static void updateStudent() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\t\tUpdate Student\t\t\t\t|");
        System.out.println("-----------------------------------------------------------------\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Registration No: ");
        String regNo = input.next();

        int index = -1;

        // Student Search
        for (int i = 0; i < regNoArray.length; i++) {
            if (regNoArray[i].equals(regNo)) {
                index = i;
                break;
            }
        }

        // Student not found
        if (index == -1) {
            System.out.println("\nThis student not exist in the system");
            System.out.print("\nDo you want to update another student details (Y/N): ");
            String select = input.next().toUpperCase();
            if (select.equals("Y")) {
                clearConsole();
                updateStudent();
            } else {
                clearConsole();
                studentManagement();
            }
            return;
        }

        // Student information
        System.out.println("\n\tStudent Name : " + nameArray[index]);
        System.out.println("\tStudent NIC  : " + nicArray[index]);

        System.out.println("\nWhat do you want to update ?");
        System.out.println("\t(01) Student Name");
        System.out.println("\t(02) Student NIC");

        System.out.print("\nEnter your option - ");
        int option = input.nextInt();

        // Student Name Update
        if (option == 1) {
            clearConsole();
            System.out.println("Student Name Update");
            System.out.println("=====================");
            System.out.println("\nRegistration No   : " + regNoArray[index]);
            System.out.println("Student NIC       : " + nicArray[index]);
            System.out.println("Student Current Name : " + nameArray[index]);

            System.out.print("\nEnter student name to update - ");
            input.nextLine();
            String newName = input.nextLine();

            nameArray[index] = newName;

            System.out.println("\n\tStudent name updated successfully...");

        // Student NIC Update
        } else if (option == 2) {
            clearConsole();
            System.out.println("Student NIC Update");
            System.out.println("====================");
            System.out.println("\nRegistration No   : " + regNoArray[index]);
            System.out.println("Student Name      : " + nameArray[index]);
            System.out.println("Student Current NIC : " + nicArray[index]);

            System.out.print("\nEnter student NIC to update - ");
            String newNic = input.next();

            // NIC check
            if (checkNIC(newNic)) {
                nicArray[index] = newNic;
                System.out.println("\n\tStudent NIC updated successfully...");
            } else {
                System.out.println("\n\tThis student is already added to the system...");
            }
        } else {
            System.out.println("\nInvalid Option!");
        }

        System.out.print("\nDo you want to update another student details (Y/N): ");
        String select = input.next().toUpperCase();
        if (select.equals("Y")) {
            clearConsole();
            updateStudent();
        } else {
            clearConsole();
            studentManagement();
        }
    }

    // GPA Calculator Method
    public static double getGPAValue(int g) {
        int[] ranges = {90, 80, 75, 70, 65, 60, 55, 50, 45, 40, 30, 20};
        double[] gpa = {4.25, 4.00, 3.70, 3.30, 3.00, 2.70, 2.30, 2.00, 1.70, 1.30, 1.00, 0.70};
        
        for (int i = 0; i < ranges.length; i++) {
            if (g >= ranges[i]) {
                return gpa[i];
            }
        }
        return 0.0;
    }

    // View Student Profile Method
    public static void viewStudentProfile() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\t\tView Student's Profile\t\t\t|");
        System.out.println("-----------------------------------------------------------------\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Registration No: ");
        String regNo = input.next();

        int index = -1;

        for (int i = 0; i < regNoArray.length; i++) {
            if (regNoArray[i].equalsIgnoreCase(regNo)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("\nThis student does not exist in the system.");
            System.out.print("\nDo you want to search another student details (Y/N): ");
            String select = input.next().toUpperCase();
            if (select.equals("Y")) {
                clearConsole();
                viewStudentProfile();
            } else {
                clearConsole();
                studentManagement();
            }
            return;
        }

        int prfMarks = prfArray[index];
        int dbmsMarks = dbmsArray[index];

        String prfStr = "";
        if (prfMarks == -1) {
            prfStr = "Absent";
        } else if (prfMarks == -2) {
            prfStr = "Not conducted";
        } else {
            prfStr = String.valueOf(prfMarks);
        }

        String dbmsStr = "";
        if (dbmsMarks == -1) {
            dbmsStr = "Absent";
        } else if (dbmsMarks == -2) {
            dbmsStr = "Not conducted";
        } else {
            dbmsStr = String.valueOf(dbmsMarks);
        }

        // GPA calc
        double prfGpa = getGPAValue(prfMarks);
        double dbmsGpa = getGPAValue(dbmsMarks);
        double finalGpa = (prfGpa + dbmsGpa) / 2.0;

        // Profile create 
        System.out.println("\n\tRegistration no      : " + regNoArray[index]);
        System.out.println("\tStudent Name         : " + nameArray[index]);
        System.out.println("\tStudent NIC          : " + nicArray[index]);
        System.out.println("\tStudent PRF Marks    : " + prfStr);
        System.out.println("\tStudent DBMS Marks   : " + dbmsStr);
        System.out.printf("\tStudent GPA          : %.2f\n", finalGpa);

        System.out.print("\nDo you want to search another student details (Y/N): ");
        String select = input.next().toUpperCase();
        if (select.equals("Y")) {
            clearConsole();
            viewStudentProfile();
        } else {
            clearConsole();
            studentManagement();
        }
    }

    // Delete Student Profile Method
    public static void deleteStudentProfile() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\t\tDelete Student Profile\t\t\t|");
        System.out.println("-----------------------------------------------------------------\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Registration No: ");
        String regNo = input.next();

        int index = -1;

        for (int i = 0; i < regNoArray.length; i++) {
            if (regNoArray[i].equalsIgnoreCase(regNo)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("\n\tThis student does not exist in the system.");
            System.out.print("\nDo you want to delete another student profile (Y/N): ");
            String select = input.next().toUpperCase();
            if (select.equals("Y")) {
                clearConsole();
                deleteStudentProfile();
            } else {
                clearConsole();
                studentManagement();
            }
            return;
        }

        int prfMarks = prfArray[index];
        int dbmsMarks = dbmsArray[index];

        String prfStr = "";
        if (prfMarks == -1) {
            prfStr = "Absent";
        } else if (prfMarks == -2) {
            prfStr = "Not conducted";
        } else {
            prfStr = String.valueOf(prfMarks);
        }

        String dbmsStr = "";
        if (dbmsMarks == -1) {
            dbmsStr = "Absent";
        } else if (dbmsMarks == -2) {
            dbmsStr = "Not conducted";
        } else {
            dbmsStr = String.valueOf(dbmsMarks);
        }

        double prfGpa = getGPAValue(prfMarks);
        double dbmsGpa = getGPAValue(dbmsMarks);
        double finalGpa = (prfGpa + dbmsGpa) / 2.0;

        System.out.println("\n\tRegistration no      : " + regNoArray[index]);
        System.out.println("\tStudent Name         : " + nameArray[index]);
        System.out.println("\tStudent NIC          : " + nicArray[index]);
        System.out.println("\tStudent PRF Marks    : " + prfStr);
        System.out.println("\tStudent DBMS Marks   : " + dbmsStr);
        System.out.printf("\tStudent GPA          : %.2f\n\n", finalGpa);

        System.out.print("Do you want to delete this student profile (Y/N): ");
        String confirm = input.next().toUpperCase();

        if (confirm.equals("Y")) {
            String[] tempRegNo = new String[regNoArray.length - 1];
            String[] tempName = new String[nameArray.length - 1];
            String[] tempNic = new String[nicArray.length - 1];
            int[] tempPrf = new int[prfArray.length - 1];
            int[] tempDbms = new int[dbmsArray.length - 1];

            int k = 0;
            for (int i = 0; i < regNoArray.length; i++) {
                if (i == index) {
                    continue;
                }
                tempRegNo[k] = regNoArray[i];
                tempName[k] = nameArray[i];
                tempNic[k] = nicArray[i];
                tempPrf[k] = prfArray[i];
                tempDbms[k] = dbmsArray[i];
                k++;
            }

            regNoArray = tempRegNo;
            nameArray = tempName;
            nicArray = tempNic;
            prfArray = tempPrf;
            dbmsArray = tempDbms;

            System.out.println("\n\tStudent was successfully deleted from the system.");
        }

        System.out.print("\nDo you want to delete another student profile (Y/N): ");
        String select = input.next().toUpperCase();
        if (select.equals("Y")) {
            clearConsole();
            deleteStudentProfile();
        } else {
            clearConsole();
            studentManagement();
        }
    }

    // Batch Management Menu
    public static void batchManagement() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|\t\t\t\t Batch Management \t\t\t|");
        System.out.println("-------------------------------------------------------------------------\n");
        System.out.println("[1] Add Batch");
        System.out.println("[2] Update Batch ");
        System.out.println("[3] Vist Batches");
        System.out.println("[4] Exit");
        
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("\n\nEnter an option to continue > ");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    clearConsole();
                    addBatch();
                    break;
                case 2:
                    clearConsole();
                    updateBatch();
                    break;
                case 3:
                    clearConsole();
                    viewBatches();
                    break;
                case 4:
                    exit();
                    break;
            }
        } while (true);
    }
    
    // Add Batch Method
    public static void addBatch() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\t\tAdd Batch\t\t\t\t|");
        System.out.println("-----------------------------------------------------------------\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Batch Number : ");
        int batchNo = input.nextInt();

        boolean exists = false;
        for (int i = 0; i < batchNameArray.length; i++) {
            if (batchNameArray[i] == batchNo) {
                exists = true;
                break;
            }
        }

        if (exists) {
            System.out.println("\nBatch is already added to the system.");
        } else {
            batchNameArray = Arrays.copyOf(batchNameArray, batchNameArray.length + 1);
            batchNameArray[batchNameArray.length - 1] = batchNo;

            batchStatusArray = Arrays.copyOf(batchStatusArray, batchStatusArray.length + 1);
            batchStatusArray[batchStatusArray.length - 1] = ENROLLMENTOPEN;

            System.out.println("\nBatch was successfully added to the system.");
        }

        System.out.print("\nDo you want to add another batch to the system (Y/N): ");
        String select = input.next().toUpperCase();
        if (select.equals("Y")) {
            clearConsole();
            addBatch();
        } else {
            clearConsole();
            homePage();
        }
    }

    // Update Batch Method
    public static void updateBatch() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\t\tUpdate Batch\t\t\t\t|");
        System.out.println("-----------------------------------------------------------------\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Batch Number : ");
        int batchNo = input.nextInt();

        int index = -1;
        for (int i = 0; i < batchNameArray.length; i++) {
            if (batchNameArray[i] == batchNo) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("\nThis batch does not exist in the system.");
            System.out.print("\nDo you want to update another batch details (Y/N): ");
            String select = input.next().toUpperCase();
            if (select.equals("Y")) {
                clearConsole();
                updateBatch();
            } else {
                clearConsole();
                batchManagement();
            }
            return;
        }

        int currentStatus = batchStatusArray[index];
        String currentStatusStr = "";
        String nextStatusStr = "";

        if (currentStatus == ENROLLMENTOPEN) {
            currentStatusStr = "ENROLLMENT OPEN";
            nextStatusStr = "ENROLLMENT CLOSED";
        } else {
            currentStatusStr = "ENROLLMENT CLOSED";
            nextStatusStr = "ENROLLMENT OPEN";
        }

        System.out.println("Current Status : " + currentStatusStr);
        System.out.print("\nDo you want to change the batch status to " + nextStatusStr + "(Y/N) ? ");
        String confirm = input.next().toUpperCase();

        if (confirm.equals("Y")) {
            if (currentStatus == ENROLLMENTOPEN) {
                batchStatusArray[index] = ENROLLMENTCLOSED;
            } else {
                batchStatusArray[index] = ENROLLMENTOPEN;
            }
            System.out.println("\n\tBatch Status updated successfully...");
        }

        System.out.print("\nDo you want to update another batch details (Y/N): ");
        String select = input.next().toUpperCase();
        if (select.equals("Y")) {
            clearConsole();
            updateBatch();
        } else {
            clearConsole();
            batchManagement();
        }
    }

    // View Batches Method
    public static void viewBatches() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\t\tView Batch\t\t\t\t|");
        System.out.println("-----------------------------------------------------------------\n");

        System.out.println("----------------------------------------------------");
        System.out.printf("%-5s %-12s %-15s %-20s\n", "No", "Batch No", "Student Count", "Status");
        System.out.println("----------------------------------------------------");

        for (int i = 0; i < batchNameArray.length; i++) {
            int count = 0;
            int bNo = batchNameArray[i];

            for (int j = 0; j < regNoArray.length; j++) {
                String reg = regNoArray[j];
                if (reg.length() >= 7) {
                    String sub = reg.substring(4, 7);
                    try {
                        if (Integer.parseInt(sub) == bNo) {
                            count++;
                        }
                    } catch (Exception e) {
                    }
                }
            }

            String statusStr = "";
            if (batchStatusArray[i] == ENROLLMENTOPEN) {
                statusStr = "ENROLLMENT OPEN";
            } else {
                statusStr = "ENROLLMENT CLOSED";
            }

            System.out.printf("%-5d %-12d %-15d %-20s\n", (i + 1), bNo, count, statusStr);
            System.out.println("----------------------------------------------------");
        }

        Scanner input = new Scanner(System.in);
        System.out.print("\nDo you want to go to the home page (Y/N): ");
        String select = input.next().toUpperCase();
        if (select.equals("Y")) {
            clearConsole();
            homePage();
        } else {
            clearConsole();
            viewBatches();
        }
    }

    // Grade Management Menu
    public static void gradeManagement() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|\t\t\t\t Grade Management \t\t\t|");
        System.out.println("-------------------------------------------------------------------------\n");
        System.out.println("[1] PRF Marks Update");
        System.out.println("\n[2] DBMS Marks Update ");
        System.out.println("\n[3] Exit");
        
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("\n\nEnter an option to continue > ");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    clearConsole();
                    prfMarksUpdate();
                    break;
                case 2:
                    clearConsole();
                    dbmsMarksUpdate();
                    break;
                case 3:
                    exit();
                    break;
            }
        } while (true);
    }

    // PRF Marks Update Method
    public static void prfMarksUpdate() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\t\tPRF Marks Update\t\t\t|");
        System.out.println("-----------------------------------------------------------------\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Registration No: ");
        String regNo = input.next();

        int index = -1;
        for (int i = 0; i < regNoArray.length; i++) {
            if (regNoArray[i].equalsIgnoreCase(regNo)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("\n\tThis student does not exist in the system.");
            System.out.print("\nDo you want to update another student PRF marks (Y/N): ");
            String select = input.next().toUpperCase();
            if (select.equals("Y")) {
                clearConsole();
                prfMarksUpdate();
            } else {
                clearConsole();
                gradeManagement();
            }
            return;
        }

        System.out.println("\n\tRegistration no      : " + regNoArray[index]);
        System.out.println("\tStudent Name         : " + nameArray[index]);
        System.out.println("\tStudent NIC          : " + nicArray[index]);

        int currentMark = prfArray[index];

        if (currentMark >= 0) {
            System.out.println("\nThis student has already completed the PRF module.");
            System.out.println("\tPRF Marks : " + currentMark);
            System.out.print("\nDo you want to update this student's PRF marks? ");
            String updateChoice = input.next().toUpperCase();
            if (!updateChoice.equals("Y")) {
                System.out.print("\nDo you want to update another student PRF marks (Y/N): ");
                String select = input.next().toUpperCase();
                if (select.equals("Y")) {
                    clearConsole();
                    prfMarksUpdate();
                } else {
                    clearConsole();
                    gradeManagement();
                }
                return;
            }
        } else if (currentMark == -1) {
            System.out.println("\nThis student was absent from the exam. You can update the marks if they participate in it...");
        }

        int newMark = -1;
        while (true) {
            System.out.print("Enter PRF Marks : ");
            newMark = input.nextInt();
            if (newMark >= 0 && newMark <= 100) {
                break;
            }
            System.out.println("Invalid marks! Please enter between 0 and 100.\n");
        }

        prfArray[index] = newMark;
        System.out.println("\n\tThis student PRF Marks updated successfully...");

        System.out.print("\nDo you want to update another student PRF marks (Y/N): ");
        String select = input.next().toUpperCase();
        if (select.equals("Y")) {
            clearConsole();
            prfMarksUpdate();
        } else {
            clearConsole();
            gradeManagement();
        }
    }

    // DBMS Marks Update Method
    public static void dbmsMarksUpdate() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\t\tDBMS Marks Update\t\t\t|");
        System.out.println("-----------------------------------------------------------------\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Registration No: ");
        String regNo = input.next();

        int index = -1;
        for (int i = 0; i < regNoArray.length; i++) {
            if (regNoArray[i].equalsIgnoreCase(regNo)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("\n\tThis student does not exist in the system.");
            System.out.print("\nDo you want to update another student DBMS marks (Y/N): ");
            String select = input.next().toUpperCase();
            if (select.equals("Y")) {
                clearConsole();
                dbmsMarksUpdate();
            } else {
                clearConsole();
                gradeManagement();
            }
            return;
        }

        System.out.println("\n\tRegistration no      : " + regNoArray[index]);
        System.out.println("\tStudent Name         : " + nameArray[index]);
        System.out.println("\tStudent NIC          : " + nicArray[index]);

        int currentMark = dbmsArray[index];

        if (currentMark >= 0) {
            System.out.println("\nThis student has already completed the DBMS module.");
            System.out.println("\tDBMS Marks : " + currentMark);
            System.out.print("\nDo you want to update this student's DBMS marks? ");
            String updateChoice = input.next().toUpperCase();
            if (!updateChoice.equals("Y")) {
                System.out.print("\nDo you want to update another student DBMS marks (Y/N): ");
                String select = input.next().toUpperCase();
                if (select.equals("Y")) {
                    clearConsole();
                    dbmsMarksUpdate();
                } else {
                    clearConsole();
                    gradeManagement();
                }
                return;
            }
        } else if (currentMark == -1) {
            System.out.println("\nThis student was absent from the exam. You can update the marks if they participate in it...");
        }

        int newMark = -1;
        while (true) {
            System.out.print("Enter DBMS Marks : ");
            newMark = input.nextInt();
            if (newMark >= 0 && newMark <= 100) {
                break;
            }
            System.out.println("Invalid marks! Please enter between 0 and 100.\n");
        }

        dbmsArray[index] = newMark;
        System.out.println("\n\tThis student DBMS Marks updated successfully...");

        System.out.print("\nDo you want to update another student DBMS marks (Y/N): ");
        String select = input.next().toUpperCase();
        if (select.equals("Y")) {
            clearConsole();
            dbmsMarksUpdate();
        } else {
            clearConsole();
            gradeManagement();
        }
    }

    // Report Generator Menu
    public static void reportGenerator() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|\t\t\t\tReport Generator\t\t\t\t|");
        System.out.println("-------------------------------------------------------------------------\n");
        System.out.println("[1] Student Registration Report");
        System.out.println("[2] Batch-Wise Student Report ");
        System.out.println("[3] Industry Training Eligibility Report");
        System.out.println("[4] Exit");

        Scanner input = new Scanner(System.in);
        do {
            System.out.print("\n\nEnter an option to continue > ");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    clearConsole();
                    studentRegistrtionReport();
                    break;
                case 2:
                    clearConsole();
                    batchWiseStudentReport();
                    break;
                case 3:
                    clearConsole();
                    industryTrainingReport();
                    break;
                case 4:
                    exit();
                    break;
            }
        } while (true);
    }
    //studentRegistrtionReport
    public static void studentRegistrtionReport() {
        do{
            clearConsole();
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("|\t\t\tStudent Resistration Reoprt\t\t\t\t|");
            System.out.println("----------------------------------------------------------------------------------\n");

            int length = regNoArray.length;
            String[] tempRegNo = new String[length];
            String[] tempName = new String[length];
            String[] tempNic = new String[length];
            int[] tempPrf = new int[length];
            int[] tempDbms = new int[length];

            for (int i = 0; i < length; i++) {
                tempRegNo[i] = regNoArray[i];
                tempName[i] = nameArray[i];
                tempNic[i] = nicArray[i];
                tempPrf[i] = prfArray[i];
                tempDbms[i] = dbmsArray[i];
            }

            for (int i = 0; i < length - 1; i++) {
                for (int j = i + 1; j < length; j++) {
                    if (tempName[i].compareToIgnoreCase(tempName[j]) > 0) {
                        String tName = tempName[i];
                        tempName[i] = tempName[j];
                        tempName[j] = tName;

                        String tReg = tempRegNo[i];
                        tempRegNo[i] = tempRegNo[j];
                        tempRegNo[j] = tReg;

                        String tNic = tempNic[i];
                        tempNic[i] = tempNic[j];
                        tempNic[j] = tNic;

                        int tPrf = tempPrf[i];
                        tempPrf[i] = tempPrf[j];
                        tempPrf[j] = tPrf;

                        int tDbms = tempDbms[i];
                        tempDbms[i] = tempDbms[j];
                        tempDbms[j] = tDbms;
                    }
                }
            }

            System.out.println("----------------------------------------------------------------------------------------------------------");
            System.out.printf("%-5s %-18s %-30s %-18s %-12s %-12s %-8s\n", "No", "Registration No", "Student Name", "NIC", "PRF Marks", "DBMS Marks", "GPA");
            System.out.println("----------------------------------------------------------------------------------------------------------");

            for (int i = 0; i < length; i++) {
                double gpa = (getGPAValue(tempPrf[i]) + getGPAValue(tempDbms[i])) / 2.0;
                String prfStr = (tempPrf[i] < 0) ? String.valueOf(tempPrf[i]) : String.valueOf(tempPrf[i]);
                String dbmsStr = (tempDbms[i] < 0) ? String.valueOf(tempDbms[i]) : String.valueOf(tempDbms[i]);

                System.out.printf("%-5d %-18s %-30s %-18s %-12s %-12s %-8.2f\n", (i + 1), tempRegNo[i], tempName[i], tempNic[i], prfStr, dbmsStr, gpa);
            }
            System.out.println("-----------------------------------------------------------------------------------------------------------");

            Scanner input = new Scanner(System.in);
            System.out.print("\nDo you want to go to homepage (Y/N): ");
            if (input.next().equalsIgnoreCase("Y")) {
                clearConsole();
                homePage();
            } else {
                clearConsole();
                studentRegistrtionReport();
            }   
        }while(true);
    }
    //batchWiseStudentReport    
    public static void batchWiseStudentReport() {
    System.out.println("----------------------------------------------------------------------------------");
    System.out.println("|\t\t\tBatch-wise Student Report\t\t|");
    System.out.println("----------------------------------------------------------------------------------");
    
        for (int i = 0; i < batchNameArray.length; i++){
                System.out.println("[" + (i + 1) + "] " + batchNameArray[i] + " Batch");
        }
        System.out.println("[" + (batchNameArray.length + 1) + "] Exit");

        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter an option to continue > ");
        int index = input.nextInt();

        if (index > 0 && index <= batchNameArray.length) {
            int selectedBatch = batchNameArray[index- 1];
            clearConsole();

            System.out.println("-------------------------------------------------------------------------------------------------");
            System.out.println("|\t\t\t\t" + selectedBatch + " Batch Student Report\t\t\t\t\t|");
            System.out.println("-------------------------------------------------------------------------------------------------\n");

            System.out.println("---------------------------------------------------------------------------------------------------------");
            System.out.printf("%-5s %-18s %-30s %-18s %-12s %-12s %-8s\n", "No", "Registration No", "Student Name", "NIC", "PRF Marks", "DBMS Marks", "GPA");
            System.out.println("---------------------------------------------------------------------------------------------------------");

            int count = 1;
            for (int i = 0; i < regNoArray.length; i++) {
                if (regNoArray[i].length() >= 7) {
                    int batchId = Integer.parseInt(regNoArray[i].substring(4, 7));

                    if (batchId == selectedBatch) {
                        double gpa = (getGPAValue(prfArray[i]) + getGPAValue(dbmsArray[i])) / 2.0;
                        System.out.printf("%-5d %-18s %-30s %-18s %-12d %-12d %-8.2f\n", count++, regNoArray[i], nameArray[i], nicArray[i], prfArray[i], dbmsArray[i], gpa);
                    }
                }
            }
            System.out.println("---------------------------------------------------------------------------------------------------------");

            System.out.print("\nDo you want to another batch report (Y/N): ");
            if (input.next().equalsIgnoreCase("Y")) {
                clearConsole();
                batchWiseStudentReport();
            } else {
                clearConsole();
                reportGenerator();
            }
        } else {
            clearConsole();
            reportGenerator();
        }
    }
        
    
    public static void industryTrainingReport() {
    System.out.println("--------------------------------------------------------------------------------------------------");
    System.out.println("|\t\t\tIndustry Training Eligibility Student Report\t\t\t\t|");
    System.out.println("--------------------------------------------------------------------------------------------------\n");

        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.printf("%-5s %-18s %-30s %-18s %-12s %-12s %-8s\n", "No", "Registration No", "Student Name", "NIC", "PRF Marks", "DBMS Marks", "GPA");
        System.out.println("-------------------------------------------------------------------------------------------------------");

        int count = 1;
        for (int i = 0; i < regNoArray.length; i++) {
            int prf = prfArray[i];
            int dbms = dbmsArray[i];
            double gpa = (getGPAValue(prf) + getGPAValue(dbms)) / 2.0;

            if (gpa > 3.25 && prf > 50 && dbms > 50) {
                System.out.printf("%-5d %-18s %-30s %-18s %-12d %-12d %-8.2f\n", count++, regNoArray[i], nameArray[i], nicArray[i], prf, dbms, gpa);
            }
        }
        System.out.println("--------------------------------------------------------------------------------------------------------");

        Scanner input = new Scanner(System.in);
        System.out.print("\nDo you want to go to homepage (Y/N): ");
        if (input.next().equalsIgnoreCase("Y")) {
            clearConsole();
            homePage();
        } else {
            clearConsole();
            reportGenerator();
        }
    }    
    

    // Main Method
    public static void main(String args[]) {
        homePage();
    }
}
