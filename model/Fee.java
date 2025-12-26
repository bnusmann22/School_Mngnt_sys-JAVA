package model;

/**
 * Fee model class managing student fees and payments.
 */
public class Fee {
    private final int studentId;
    private final double totalFee;
    private double paidAmount;

    public Fee(int studentId, double totalFee, double paidAmount) {
        if (totalFee < 0 || paidAmount < 0) {
            throw new IllegalArgumentException("Fees and paid amount cannot be negative");
        }
        if (paidAmount > totalFee) {
            throw new IllegalArgumentException("Paid amount cannot exceed total fee");
        }
        this.studentId = studentId;
        this.totalFee = totalFee;
        this.paidAmount = paidAmount;
    }

    public int getStudentId() {
        return studentId;
    }

    public double getTotalFee() {
        return totalFee;
    }

    public double getPaidAmount() {
        return paidAmount;
    }

    public void updatePayment(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Payment amount cannot be negative");
        }
        double newPaidAmount = paidAmount + amount;
        if (newPaidAmount > totalFee) {
            throw new IllegalArgumentException("Payment exceeds total fee amount");
        }
        this.paidAmount = newPaidAmount;
    }

    public double getBalance() {
        return totalFee - paidAmount;
    }

    public boolean isPaid() {
        return getBalance() == 0;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId +
               ", Total Fee: " + totalFee +
               ", Paid: " + paidAmount +
               ", Balance: " + getBalance();
    }
}