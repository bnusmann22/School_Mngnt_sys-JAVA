package model;

public class Fee {
    public int studentId;
    public double totalFee;
    public double paidAmount;

    public Fee(int studentId, double totalFee, double paidAmount) {
        this.studentId = studentId;
        this.totalFee = totalFee;
        this.paidAmount = paidAmount;
    }

    public double getBalance() {
        return totalFee - paidAmount;
    }

    public void display() {
        System.out.println("Student ID: " + studentId + ", Total: " + totalFee + 
                         ", Paid: " + paidAmount + ", Balance: " + getBalance());
    }
}