package project_1;
public class DepartmentNode {
	   PatientNode head, tail;
	    public void enqueue(int id, String name, String dept) {
	        PatientNode newNode = new PatientNode(id, name, dept);
	        if (head == null) {
	            head = tail = newNode;
	        } else {
	            tail.next = newNode;
	            tail = newNode;
	        }
	    }
	    public void display() {
	        PatientNode temp = head;
	        while (temp != null) {
	            System.out.println(temp.patientName + " - " + temp.department);
	            temp = temp.next;
	        }
	    }
	}