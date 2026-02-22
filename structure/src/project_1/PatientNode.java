package project_1;
public class PatientNode {
	 int patientID;
	    String patientName;
	    String department;
	    PatientNode next;
	    public PatientNode(int id, String name, String dept) {
	        patientID = id;
	        patientName = name;
	        department = dept;
	        next = null;
	    }
	}

