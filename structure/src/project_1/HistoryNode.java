package project_1;
public class HistoryNode {
	 int patientID;
	    String patientName;
	    String treatmentDate;
	    String doctorName;
	    String treatmentStatus;
	    HistoryNode prev, next;

	    public HistoryNode(int id, String name, String date,
	                       String doctor, String status) {
	        patientID = id;
	        patientName = name;
	        treatmentDate = date;
	        doctorName = doctor;
	        treatmentStatus = status;
	    }
	}
	class TreatmentHistory {
	    HistoryNode head, tail;

	    public void addHistory(int id, String name, String date,
	                           String doctor, String status) {
	        HistoryNode node = new HistoryNode(id, name, date, doctor, status);
	        if (head == null) {
	            head = tail = node;
	        } else {
	            tail.next = node;
	            node.prev = tail;
	            tail = node;
	        }
	    }
	    public void displayForward() {
	        HistoryNode temp = head;
	        while (temp != null) {
	            System.out.println(temp.patientName + " - " + temp.treatmentStatus);
	            temp = temp.next;
	        }
	    }
	}