//Devaansh Mann
//CS 5800 - Homework 1

package Interface;

class VendorInvoice implements Payable {
    private String vendorName;
    private String invoiceNumber;
    private double amountDue;

    public VendorInvoice(String vendorName, String invoiceNumber, double amountDue) {
        this.vendorName = vendorName;
        this.invoiceNumber = invoiceNumber;
        setAmountDue(amountDue);
    }

    public void setAmountDue(double amount) {
        if(amount >= 0.0){
            this.amountDue = amount;
        } else{
            throw new IllegalArgumentException("Amount must be non-negative");
        }
    }

    public String getVendorName() {
        return vendorName;
    }
    public String getInvoiceNumber() {
        return invoiceNumber;
    }
    public double getAmountDue() {
        return amountDue;
    }

    public double calculatePayment() {
        return amountDue;
    }

    public String getPayeeName(){
        return vendorName;
    }

    public void print(){
        System.out.println("Vendor Name: " + getVendorName());
        System.out.println("Invoice Number: " + getInvoiceNumber());
        System.out.println("Calculated Payment: " + calculatePayment());
    }
}
