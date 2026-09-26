import java.util.*;
class student{
    private String regNo;
    private String name;
    private String nic;
    private int prfMarks;
    private int dbmsMark;

    public Student (String regNo,String name,String nic,int prfMarks,int dbmsMarks){
        this.regNo = regNo;
        this.name = name;
        this.nic = nic;
        this.prfMarks = prfMarks;
        this.dbmsMarks = dbmsMarks;
    }
    public String getRegNo() { 
        return regNo; 
    }
    public String getName() { 
        return name; 
    }
    public void setName(String name) { 
        this.name = name; 
    }
    public String getNic() { 
        return nic; 
    }
    public void setNic(String nic) { 
        this.nic = nic; 
    }
    public int getPrfMarks() { 
        return prfMarks; 
    }
    public void setPrfMarks(int prfMarks) { 
        this.prfMarks = prfMarks; 
    }
    public int getDbmsMarks() { 
        return dbmsMarks; 
    }
    public void setDbmsMarks(int dbmsMarks) { 
        this.dbmsMarks = dbmsMarks; 
    }
    public double getGPA() {
        double prfGpa = createGPA(prfMarks);
        double dbmsGpa = createGPA(dbmsMarks);
        return (prfGpa + dbmsGpa) / 2.0;
    }

    private double createGPA(int marks) {
        if (marks < 0) return 0.0;
        int[] ranges = {90, 80, 75, 70, 65, 60, 55, 50, 45, 40, 30, 20};
        double[] gpa = {4.25, 4.00, 3.70, 3.30, 3.00, 2.70, 2.30, 2.00, 1.70, 1.30, 1.00, 0.70};

        for (int i = 0; i < ranges.length; i++) {
            if (marks >= ranges[i]) {
                return gpa[i];
            }
        }
        return 0.0;
    }
}
class Batch{
    private int batchNo;
    private int status;

    public Batch(int batchNo, int status) {
        this.batchNo = batchNo;
        this.status = status;
    }

    public int getBatchNo() { 
		return batchNo; 
	}
    
    public int getStatus() { 
		return status; 
	}
    
    public void setStatus(int status) { 
		this.status = status; 
	}
}
class StudentManagementSystem {

    // Batch status variables
    public static final int ENROLLMENTOPEN = 1;
    public static final int ENROLLMENTCLOSED = 0;

    // Batch data arrays
    public static Batch[] batchNameArray = { 
        new Batch(105, ENROLLMENT_CLOSED),
        new Batch(106, ENROLLMENT_CLOSED),
        new Batch(107, ENROLLMENT_CLOSED),
        new Batch(108, ENROLLMENT_CLOSED),
        new Batch(109, ENROLLMENT_OPEN),
        new Batch(110, ENROLLMENT_OPEN) };

    
    // Marks data arrays
    public static int[] prfMarksArray = new int[0];
    public static int[] dbmsMarksArray = new int[0];
    
private static Student[] studentArray  = new Student[] {
        new Student("PR24105001", "199501012345", "Gunawardena Weerasinghe", 85, 66),
        new Student("PR24105002", "199503153872", "Senanayake Silva", 39, 45),
        new Student("PR24105003", "199506202198", "Silva Kumara", -1, 93),
        new Student("PR24105004", "199509102983", "Kumara Herath", 72, 58),
        new Student("PR24105005", "199511258739", "Rathnayake Herath", 44, -1),
        new Student("PR24105006", "199512303498", "Wijesinghe Bandara", 91, 37),
        new Student("PR24105007", "199502183764", "Rajapaksha Herath", 60, 88),
        new Student("PR24105008", "199504223198", "Senanayake Karunaratne", 38, 21),
        new Student("PR24105009", "199508153210", "Karunaratne Jayasinghe", 95, 79),
        new Student("PR24105010", "199510293417", "Gunawardena Silva", 49, 40),
        new Student("OR24105011", "199601102375", "Weerasinghe Rajapaksha", -1, 76),
        new Student("OR24105012", "199604182938", "Silva Rathnayake", 67, 54),
        new Student("OR24105013", "199606243879", "Fernando Perera", 23, -1),
        new Student("OR24105014", "199608142178", "Kumara Abeysekera", 58, 69),
        new Student("OR24105015", "199610312475", "Ekanayake Rathnayake", 88, 92),
        new Student("PR24105016", "199611173452", "Ekanayake Rathnayake", 81, 25),
        new Student("PR24105017", "199603293481", "Herath Gunawardena", 73, 84),
        new Student("PR24105018", "199605083217", "Abeysekera Silva", 29, 33),
        new Student("OR24105019", "199607232198", "Weerasinghe Silva", 62, 60),
        new Student("OR24105020", "199609192375", "Jayasinghe Dias", -1, 71),
        new Student("PR24105021", "199701212483", "Bandara Rathnayake", 79, 59),
        new Student("PR24105022", "199703132487", "Silva Perera", 53, -1),
        new Student("OR24105023", "199706253478", "De Silva Dias", 94, 98),
        new Student("OR24105024", "199708083298", "Abeysekera Jayasinghe", 47, 27),
        new Student("PR24105025", "199710243651", "Rajapaksha Senanayake", 35, 48),
        new Student("PR24106001", "199712152983", "Kumara Karunaratne", 93, 35),
        new Student("PR24106002", "199702182734", "Silva Abeysekera", 15, 91),
        new Student("PR24106003", "199704293187", "Jayasinghe Bandara", -1, 60),
        new Student("PR24106004", "199705142375", "Rathnayake Kumara", 82, -1),
        new Student("PR24106005", "199709083751", "Weerasinghe Rajapaksha", 45, 72),
        new Student("PR24106006", "199801032874", "Senanayake Herath", 88, 49),
        new Student("PR24106007", "199803232871", "Perera Ekanayake", 23, 26),
        new Student("PR24106008", "199806193428", "Herath Jayasinghe", 79, 80),
        new Student("PR24106009", "199808013764", "Kumara Gunawardena", 37, 14),
        new Student("PR24106010", "199810242374", "Abeysekera Silva", -1, 89),
        new Student("OR24106011", "199812302984", "Dias Fernando", 68, 67),
        new Student("OR24106012", "199802152348", "Karunaratne Weerasinghe", 100, -1),
        new Student("OR24106013", "199805213471", "Ekanayake Bandara", 59, 31),
        new Student("OR24106014", "199807172398", "Rajapaksha Kumara", 29, 94),
        new Student("OR24106015", "199811283472", "Silva De Silva", 92, 53),
        new Student("PR24106016", "199901122471", "Gunawardena Rathnayake", 12, 78),
        new Student("PR24106017", "199903052984", "Bandara Karunaratne", 77, 5),
        new Student("PR24106018", "199906213874", "Fernando Perera", 38, 90),
        new Student("OR24106019", "199908093412", "De Silva Silva", 66, 24),
        new Student("OR24106020", "199910273894", "Rajapaksha Gunawardena", 9, 86),
        new Student("PR24106021", "199912153482", "Herath Weerasinghe", 84, 39),
        new Student("PR24106022", "199902202394", "Karunaratne Dias", 51, -1),
        new Student("OR24106023", "199904163874", "Jayasinghe Silva", 32, 61),
        new Student("OR24106024", "199907293481", "Senanayake Abeysekera", -1, 73),
        new Student("PR24106025", "199911083479", "Silva Jayasinghe", 97, 100),
        new Student("PR24107001", "200001112374", "Rathnayake Kumara", 95, 38),
        new Student("PR24107002", "200003143478", "Gunawardena Kumara", -1, 91),
        new Student("PR24107003", "200006293874", "Rajapaksha Silva", 63, -1),
        new Student("PR24107004", "200008103471", "Perera Jayasinghe", 88, 74),
        new Student("PR24107005", "200010252984", "Silva Ekanayake", 32, 55),
        new Student("PR24107006", "200012043894", "Dias Senanayake", 76, 82),
        new Student("PR24107007", "200002193874", "Herath Abeysekera", 97, 66),
        new Student("PR24107008", "200004212374", "Rathnayake Fernando", 54, 49),
        new Student("PR24107009", "200005183492", "Kumara Herath", -1, 99),
        new Student("PR24107010", "200007153871", "Weerasinghe Silva", 23, 13),
        new Student("OR24107011", "200101232984", "Senanayake Karunaratne", 90, 80),
        new Student("OR24107012", "200103083471", "Abeysekera Silva", 35, 70),
        new Student("OR24107013", "200106273894", "Bandara Gunawardena", 81, 93),
        new Student("OR24107014", "200108123984", "Karunaratne Weerasinghe", 61, 36),
        new Student("OR24107015", "200110043728", "Perera Herath", 44, 59),
        new Student("PR24107016", "200112213874", "Fernando Dias", 67, 85),
        new Student("PR24107017", "200102253471", "Weerasinghe Gunawardena", 100, 47),
        new Student("PR24107018", "200104103874", "Rathnayake Kumara", 17, 90),
        new Student("OR24107019", "200105293784", "Senanayake Fernando", 85, -1),
        new Student("OR24107020", "200107202983", "Silva Bandara", 29, 22),
        new Student("PR24107021", "200201013874", "Herath Rajapaksha", 70, 77),
        new Student("PR24107022", "200203253471", "Kumara Jayasinghe", 42, 34),
        new Student("OR24107023", "200206143874", "Abeysekera Perera", -1, 63),
        new Student("OR24107024", "200208083471", "Rathnayake Jayasinghe", 60, 100),
        new Student("PR24107025", "200210293874", "Kumara Weerasinghe", 86, 29),
        new Student("PR24108001", "200212183471", "Rajapaksha Ekanayake", 86, 79),
        new Student("PR24108002", "200202103874", "Fernando Rajapaksha", 57, 62),
        new Student("PR24108003", "200204123894", "Silva Gunawardena", 91, 87),
        new Student("PR24108004", "200205283471", "Perera Wijesinghe", 35, -1),
        new Student("PR24108005", "200207153874", "Herath Abeysekera", -1, 54),
        new Student("PR24108006", "200301093874", "Rajapaksha Ekanayake", 76, 46),
        new Student("PR24108007", "200303283471", "Karunaratne Silva", 48, 99),
        new Student("PR24108008", "200306153874", "Weerasinghe Fernando", 94, 39),
        new Student("PR24108009", "200308123471", "Silva Bandara", 23, 70),
        new Student("PR24108010", "200310083874", "Abeysekera Weerasinghe", 69, -1),
        new Student("OR24108011", "200312243471", "Kumara Karunaratne", -1, 75),
        new Student("OR24108012", "200302273874", "Dias Rajapaksha", 80, 83),
        new Student("OR24108013", "200304203471", "Herath Perera", 55, 58),
        new Student("OR24108014", "200305123874", "Rathnayake Gunawardena", 88, 92),
        new Student("OR24108015", "200307213471", "Ekanayake Jayasinghe", 32, 30),
        new Student("PR24108016", "200401153874", "Gunawardena Silva", 100, 91),
        new Student("PR24108017", "200403123471", "Rajapaksha Perera", 67, 40),
        new Student("PR24108018", "200406293874", "Karunaratne Jayasinghe", 43, 63),
        new Student("OR24108019", "200408083471", "Weerasinghe Abeysekera", -1, 95),
        new Student("OR24108020", "200410213874", "Rathnayake Fernando", 90, 68),
        new Student("PR24108021", "200412153471", "Kumara Herath", 60, -1),
        new Student("PR24108022", "200402203874", "Silva Weerasinghe", 77, 66),
        new Student("OR24108023", "200404273471", "Herath Karunaratne", 25, 21),
        new Student("OR24108024", "200405143874", "Abeysekera Silva", 71, 88),
        new Student("PR24108025", "200407183471", "Gunawardena Ekanayake", 84, 37),
        new Student("PR24109001", "200501023874", "Weerasinghe Kumara", 92, 67),
        new Student("PR24109002", "200503193471", "Weerasinghe Kumara", 68, 91),
        new Student("PR24109003", "200506153874", "Rajapaksha Abeysekera", 59, 85),
        new Student("PR24109004", "200508213471", "Gunawardena Perera", 85, 73),
        new Student("PR24109005", "200510083874", "Karunaratne Silva", 63, 70),
        new Student("PR24109006", "200512293471", "Herath Wijesinghe", 76, 63),
        new Student("PR24109007", "200502123874", "Rathnayake Ekanayake", 91, 76),
        new Student("PR24109008", "200504153471", "Silva Fernando", 70, 88),
        new Student("PR24109009", "200505283874", "Abeysekera Rajapaksha", 84, 55),
        new Student("PR24109010", "200507173471", "Fernando Bandara", 63, 64),
        new Student("OR24109011", "200203456782", "Perera Herath", 72, 79),
        new Student("OR24109012", "200305678901", "Weerasinghe Jayasinghe", 89, 80),
        new Student("OR24109013", "199601234567", "Silva Karunaratne", 45, 59),
        new Student("OR24109014", "199511223344", "Rathnayake Gunawardena", 81, 92),
        new Student("OR24109015", "200412345678", "Herath Kumara", 77, 68),
        new Student("PR24109016", "200512345678", "Abeysekera Silva", 68, 100),
        new Student("PR24109017", "199909876543", "Ekanayake Bandara", 63, 77),
        new Student("PR24109018", "199812346789", "Rajapaksha Fernando", 88, 83),
        new Student("OR24109019", "200010203040", "Gunawardena Weerasinghe", 75, 45),
        new Student("OR24109020", "200608789012", "Kumara Karunaratne", 90, 62),
        new Student("PR24109021", "200012345678", "Silva Dias", 57, 66),
        new Student("PR24109022", "199812345679", "Perera Weerasinghe", 79, 59),
        new Student("OR24109023", "199902345678", "Karunaratne Rajapaksha", 92, 78),
        new Student("OR24109024", "199712345670", "Jayasinghe Silva", 62, 85),
        new Student("PR24109025", "200102345671", "Rathnayake Perera", 100, 56),
        new Student("PR24110001", "200203456782", "Silva Ekanayake", -2, -2),
        new Student("PR24110002", "200305678901", "Silva Karunaratne", -2, -2),
        new Student("PR24110003", "199601234567", "Herath Fernando", -2, -2),
        new Student("PR24110004", "199511223344", "Kumara Jayasinghe", -2, -2),
        new Student("PR24110005", "200412345678", "Weerasinghe Perera", -2, -2),
        new Student("PR24110006", "200512345678", "Abeysekera Rajapaksha", -2, -2),
        new Student("PR24110007", "199909876543", "Rathnayake Karunaratne", -2, -2),
        new Student("PR24110008", "199812346789", "Ekanayake Bandara", -2, -2),
        new Student("PR24110009", "200010203040", "Gunawardena Perera", -2, -2),
        new Student("PR24110010", "200608789012", "Silva Wijesinghe", -2, -2),
        new Student("OR24110011", "200012345678", "Rajapaksha Jayasinghe", -2, -2),
        new Student("OR24110012", "199812345679", "Rathnayake Fernando", -2, -2),
        new Student("OR24110013", "199902345678", "Karunaratne Kumara", -2, -2),
        new Student("OR24110014", "199712345670", "Perera Silva", -2, -2),
        new Student("OR24110015", "200102345671", "Gunawardena Ekanayake", -2, -2),
        new Student("PR24110016", "200203456782", "Bandara Rajapaksha", -2, -2),
        new Student("PR24110017", "200305678901", "Silva Herath", -2, -2),
        new Student("PR24110018", "199601234567", "Rathnayake Weerasinghe", -2, -2),
        new Student("OR24110019", "199511223344", "Perera Gunawardena", -2, -2),
        new Student("OR24110020", "200412345678", "Herath Karunaratne", -2, -2),
        new Student("PR24110021", "200203456782", "Silva Rajapaksha", -2, -2),
        new Student("PR24110022", "200305678901", "Ekanayake Kumara", -2, -2),
        new Student("OR24110023", "199601234567", "Bandara Herath", -2, -2),
        new Student("OR24110024", "199511223344", "Weerasinghe Rajapaksha", -2, -2),
        new Student("PR24110025", "200412345678", "Karunaratne Abeysekera", -2, -2)
    };

    // Method to check batch status
    public static boolean checkBatchStatus(int batchNo) {
        for (int i = 0; i < batchArray.length; i++) {
            if (batchArray[i].getBatchNo() == batchNo) {
                return batchArray[i].getStatus() == ENROLLMENT_OPEN;
                }
            }
        return false;
    }

    // Method to check if NIC already exists
    public static boolean checkNIC(String nic) {
        for (int i = 0; i < studentArray.length; i++) {
            if (studentArray[i].getNic().equalsIgnoreCase(nic)) {
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
        Scanner input = new Scanner(System.in);
        boolean continueAdding = true;

    do {
        clearConsole();
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\t\tAdd Student\t\t\t\t|");
        System.out.println("-----------------------------------------------------------------\n");

       System.out.print("\nEnter batch Number (Student should be added): ");
        int batchNo = input.nextInt();

        if (checkBatchStatus(batchNo)) {
            System.out.print("\nEnter student NIC: ");
            String nic = input.next();

            if (checkNIC(nic)) {
                System.out.print("\nEnter student name > ");
                input.nextLine();
                String name = input.nextLine();

                System.out.print("\nEnter lecture mode (physical-1/online-0) > ");
                int mode = input.nextInt();

                if (mode == 1 || mode == 0) {
                    int nextNum = studentArray.length + 1;
                    String prefix = (mode == 1) ? "PR" : "OR";
                    String newRegNo = String.format("%s24%d%03d", prefix, batchNo, nextNum);

                    Student newStudent = new Student(newRegNo, name, nic, -2, -2);
                    addStudentToArray(newStudent);

                    System.out.println("\n\n\tStudent Registration No - " + newRegNo);
                    System.out.println("\nStudent was successfully added to the system");
                } else {
                    System.out.println("Invalid Lecture Mode!");
                }
            } else {
                System.out.println("\n\n\tAlready added student (NIC Exists)...");
            }
        } else {
            System.out.println("\n\tStudents cannot be added. Enrollment is closed for Batch " + batchNo);
        }
        System.out.print("\nDo you want to add another student (Y/N): ");
        continueAdding = input.next().equalsIgnoreCase("Y");

    } while (continueAdding);

    clearConsole();
    homePage();
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
        for (int i = 0; i < studentArray.length; i++) {
            if (studentArray[i].equals(regNo)) {
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
        Student s = studentArray[index];
        System.out.println("\n\tStudent Name : " + s.getName());
        System.out.println("\tStudent NIC  : " + s.getNic());

        System.out.println("\nWhat do you want to update ?");
        System.out.println("\t(01) Student Name");
        System.out.println("\t(02) Student NIC");

        System.out.print("\nEnter your option - ");
        int option = input.nextInt();

        // Student Name Update
        if (option == 1) {
            clearConsole();
           System.out.print("\nEnter student name to update - ");
            input.nextLine();
            s.setName(input.nextLine());
            System.out.println("\n\tStudent name updated successfully...");

        // Student NIC Update
        } else if (option == 2) {
            clearConsole();
            System.out.print("\nEnter student NIC to update - ");
            String newNic = input.next();

            // NIC check
            if (checkNIC(newNic)) {
                s.setNic (newNic);
                System.out.println("\n\tStudent NIC updated successfully...");
            } else {
                System.out.println("\n\tThis student is already added to the system...");
            }
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
    // View Student Profile Method
    public static void viewStudentProfile() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\t\tView Student's Profile\t\t\t|");
        System.out.println("-----------------------------------------------------------------\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Registration No: ");
        String regNo = input.next();

        int index = -1;

        for (int i = 0; i < studentArray.length; i++) {
            if (studentArray[i].getRegNo().equalsIgnoreCase(regNo)) {
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

       Student s = studentArray[index];
            String prfText;
            if (s.getPrfMarks() < 0) {
                prfText = "N/A";
            } else {
                prfText = String.valueOf(s.getPrfMarks());
            }

            String dbmsText;
            if (s.getDbmsMarks() < 0) {
                dbmsText = "N/A";
            } else {
                dbmsText = String.valueOf(s.getDbmsMarks());
            }

        // Profile create 
        System.out.println("\n\tRegistration no      : " + studentArray[index].getRegNo());
        System.out.println("\tStudent Name         : " + studentArray[index].getName());
        System.out.println("\tStudent NIC          : " + studentArray[index].getNic());
        System.out.println("\tStudent PRF Marks    : " + prfText);
        System.out.println("\tStudent DBMS Marks   : " + dbmsText);
        System.out.printf("\tStudent GPA          : %.2f\n",s.getGpa());

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

        for (int i = 0; i < studentArray.length; i++) {
            if (studentArray[i].getRegNo().equalsIgnoreCase(regNo)) {
                index = i;
                break;
            }
        }

          if (index != -1) {
            Student[] temp = new Student[studentArray.length - 1];
            int k = 0;
            for (int i = 0; i < studentArray.length; i++) {
                if (i == index) continue;
                temp[k++] = studentArray[i];
            }
            studentArray = temp;
            System.out.println("\n\tStudent was successfully deleted from the system.");
        } else {
            System.out.println("\n\tThis student does not exist in the system.");
        }
        System.out.print("\nDo you want to delete another student profile (Y/N): ");
        if (input.next().equalsIgnoreCase("Y")) {
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
        System.out.println("[3] View Batches");
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
        for (Batch b : batchArray) {
            if (b.getBatchNo() == batchNo) {
                exists = true;
                break;
            }
        }

        if (!exists) {
            Batch[] temp = new Batch[batchArray.length + 1];
		for (int i = 0; i < batchArray.length; i++) temp[i] = batchArray[i];
            temp[temp.length - 1] = new Batch(batchNo, ENROLLMENT_OPEN);
            batchArray = temp;
            System.out.println("\nBatch was successfully added.");
        } else {
            System.out.println("\nBatch already exists!");
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

        for (Batch b : batchArray) {
            if (b.getBatchNo() == batchNo) {
                b.setStatus(b.getStatus() == ENROLLMENT_OPEN ? ENROLLMENT_CLOSED : ENROLLMENT_OPEN);
                System.out.println("\nBatch Status updated successfully.");
                break;
            }
        }

            System.out.print("\nDo you want to update another batch details (Y/N): ");
            String select = input.next().toUpperCase();
            if (select.equals("Y")) {
                clearConsole();
                batchManagement();
            } else {
                clearConsole();
                homePage();
            }
        }
    // View Batches Method
    public static void viewBatches() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\t\tView Batch\t\t\t\t|");
        System.out.println("-----------------------------------------------------------------\n");

        System.out.println("----------------------------------------------------");
        System.out.printf("%-5s %-12s %-20s\n", "No", "Batch No", "Status");
        System.out.println("----------------------------------------------------");

        for (int i = 0; i < batchArray.length; i++) {
			String status;
			if (batchArray[i].getStatus() == ENROLLMENT_OPEN) {
				status = "ENROLLMENT OPEN";
			} else {
				status = "ENROLLMENT CLOSED";
			}
			
			System.out.printf("%-5d %-12d %-20s\n", (i + 1), batchArray[i].getBatchNo(), status);
		    System.out.println("-----------------------------------------------------------------\n");
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
        Scanner input = new Scanner(System.in);
        boolean continueUpdating = true;

        do {
            clearConsole();
            System.out.println("-----------------------------------------------------------------");
            System.out.println("|\t\t\tPRF Marks Update\t\t\t|");
            System.out.println("-----------------------------------------------------------------\n");

            System.out.print("Enter Student Registration No: ");
            String regNo = input.next();

            int foundIndex = -1;
            for (int i = 0; i < studentArray.length; i++) {
                if (studentArray[i].getRegNo().equalsIgnoreCase(regNo)) {
                    foundIndex = i;
                    break;
                }
            }

            if (foundIndex == -1) {
                System.out.println("\n\tThis student does not exist in the system.");
            } else {
                Student foundStudent = studentArray[foundIndex];
                System.out.println("\n\tRegistration no      : " + foundStudent.getRegNo());
                System.out.println("\tStudent Name         : " + foundStudent.getName());
                System.out.println("\tStudent NIC          : " + foundStudent.getNic());

                int currentMark = foundStudent.getPrfMarks();
                boolean canUpdate = true;

                if (currentMark >= 0) {
                    System.out.println("\nThis student has already completed the PRF module.");
                    System.out.println("\tPRF Marks : " + currentMark);
                    System.out.print("\nDo you want to update this student's PRF marks (Y/N)? ");
                    String updateChoice = input.next().toUpperCase();
                    if (!updateChoice.equals("Y")) {
                        canUpdate = false;
                    }
                } else if (currentMark == -1) {
                    System.out.println("\nThis student was absent from the exam. You can update the marks if they participate in it...");
                }

                if (canUpdate) {
                    int newMark = -1;
                    while (true) {
                        System.out.print("\nEnter PRF Marks : ");
                        newMark = input.nextInt();
                        if (newMark >= 0 && newMark <= 100) {
                            break;
                        }
                        System.out.println("Invalid marks! Please enter between 0 and 100.\n");
                    }

                    foundStudent.setPrfMarks(newMark);
                    System.out.println("\n\tThis student PRF Marks updated successfully...");
                }
            }

            System.out.print("\nDo you want to update another student PRF marks (Y/N): ");
            continueUpdating = input.next().equalsIgnoreCase("Y");

        } while (continueUpdating);

        clearConsole();
        gradeManagement();
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
