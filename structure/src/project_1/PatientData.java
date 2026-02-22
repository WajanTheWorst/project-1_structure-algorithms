package project_1;
public class PatientData {
    Patient[] patients;
    int size;

    public PatientData(int capacity) {
        patients = new Patient[capacity];
        size = 0;
    }
    private void resize() {
        Patient[] newArr = new Patient[45];
        for (int i = 0; i < size; i++) {
            newArr[i] = patients[i];
        }
        patients = newArr;
        System.out.println("Array resized to 45");
    }
    public void addPatient(Patient p) {

        if (size == patients.length) {
            resize();
        }
        int i = size - 1;
        
        while (i >= 0 && patients[i].patientID > p.patientID) {
            patients[i + 1] = patients[i];
            i--;
        }
        patients[i + 1] = p;
        size++;
    }
    public void searchAtIndex(int index) {
        if (index < size) {
            Patient p = patients[index];
            System.out.println("Index " + index +
                    ": " + p.fullName +
                    " | Bill: " + p.billAmount);
        } else {
            System.out.println("Index " + index + " not found");
        }
    }
    public void searchAgeAbove30() {
        for (int i = 0; i < size; i++) {
            if (patients[i].age > 30) {
                System.out.println(patients[i].fullName);
            }
        }
    }
    public void searchBillAbove(float value) {
        for (int i = 0; i < size; i++) {
            if (patients[i].billAmount > value) {
                System.out.println(patients[i].fullName);
            }
        }
    }
    public void updateBill(int index, float newBill) {
        if (index < size) {
            float old = patients[index].billAmount;
            patients[index].billAmount = newBill;

            System.out.println("Index " + index +
                    " | Old: " + old +
                    " | New: " + newBill);
        } else {
            System.out.println("Index " + index + " not found");
        }
    }
    public void statistics() {

        if (size == 0) {
            System.out.println("No patients available.");
            return;
        }
        float total = 0;
        float max = patients[0].billAmount;
        float min = patients[0].billAmount;

        int low = 0, medium = 0, high = 0;

        String[] departments = {"Cardiology", "Ortho", "Neuro"};
        float[] deptTotals = new float[3];
        int[] deptCounts = new int[3];

        for (int i = 0; i < size; i++) {

            float bill = patients[i].billAmount;
            String dept = patients[i].department;

            total += bill;

            if (bill > max)
                max = bill;

            if (bill < min)
                min = bill;

            if (bill < 1000)
                low++;
            else if (bill <= 5000)
                medium++;
            else
                high++;

            for (int j = 0; j < departments.length; j++) {
                if (dept.equals(departments[j])) {
                    deptTotals[j] += bill;
                    deptCounts[j]++;
                }
            }
        }
        System.out.println("\n--- Overall Statistics ---");
        System.out.println("Average Bill: " + (total / size));
        System.out.println("Highest Bill: " + max);
        System.out.println("Lowest Bill: " + min);

        System.out.println("\n--- Average Per Department ---");

        for (int j = 0; j < departments.length; j++) {
            if (deptCounts[j] > 0) {
                System.out.println(departments[j] + ": " +
                        (deptTotals[j] / deptCounts[j]));
           }
        }
        System.out.println("\n--- Bill Categories ---");
        System.out.println("Low Bills: " + low);
        System.out.println("Medium Bills: " + medium);
        System.out.println("High Bills: " + high);
    }
  }