package model;

public class Fee {
    private int studentId;
    private double totalFee;
    private double paidAmount;

    public Fee(int studentId, double totalFee, double paidAmount) {
        this.studentId = studentId;
        this.totalFee = totalFee;
        this.paidAmount = paidAmount;
    }

    public double getBalance() {
        return totalFee - paidAmount;
    }

    public String toString() {
        return "Student ID: " + studentId +
               ", Balance: " + getBalance();
    }
}