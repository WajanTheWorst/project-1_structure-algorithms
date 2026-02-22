package project_1;
public class main {
	  public static void main(String[] args) {

	        System.out.println("Name: wajan bandar");
	        System.out.println("ID: 446801633");
	        System.out.println("Section: 2387");

	        PatientData db = new PatientData(40);
	        db.addPatient(new Patient(5, "Ali", 35, "Cardiology", 6000));
	        db.addPatient(new Patient(2, "saud", 25, "Ortho", 900));
	        db.addPatient(new Patient(8, "shoug", 40, "Neuro", 3000));
	        db.addPatient(new Patient(1, "bandar", 50, "Cardiology", 700));
	        db.addPatient(new Patient(3, "nasser", 32, "Ortho", 12000));

	        System.out.println("\n--- Search Age > 30 ---");
	        db.searchAgeAbove30();

	        System.out.println("\n--- Search Bill > 5000 ---");
	        db.searchBillAbove(5000);

	        System.out.println("\n--- Search at Indices 1,10,20,30 ---");
	        db.searchAtIndex(1);
	        db.searchAtIndex(10);
	        db.searchAtIndex(20);
	        db.searchAtIndex(30);

	        System.out.println("\n--- Update Bills ---");

	        db.updateBill(1, 4500);
	        db.updateBill(10, 8000);
	        db.updateBill(20, 3000);
	        db.updateBill(30, 1500);

	        System.out.println("\n--- Data After Update (Index 1) ---");
	        db.searchAtIndex(1);

	        System.out.println("\n--- Statistics ---");
	        db.statistics();

	        System.out.println("\n--- Department Queue ---");
	        DepartmentNode q = new DepartmentNode();
	        q.enqueue(5, "Ali", "Cardiology");
	        q.enqueue(2, "saud", "Ortho");

	        q.display();

	        System.out.println("\n--- Treatment History ---");
	        TreatmentHistory th = new TreatmentHistory();
	        th.addHistory(5, "Ali", "2025-02-01", "Dr. Ahmed", "Admitted");
	        th.addHistory(2, "saud", "2025-02-03", "Dr. asma", "Discharged");
	        th.displayForward();
	    }
	}