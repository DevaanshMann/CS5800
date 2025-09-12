package Interface;

import java.util.ArrayList;
import java.util.List;

public class InterfaceDriver {
    public static void main(String[] args) {

        List<Payable> objects = new ArrayList<>();

        objects.add(new Freelancer("Able", "Trent", 25.5, 39.4));
        objects.add(new Freelancer("Gabe", "Lewis", 33.2, 37.7));
        objects.add(new VendorInvoice("Athens Corp", "AC-INV-001", 780.0));
        objects.add(new VendorInvoice("CBS Logistics", "CL-INV-361", 378.0));

        double Payout = 0.0;

        for (Payable object : objects) {
            if (object instanceof Freelancer){
                ((Freelancer) object).print();
                System.out.println(" ");
            } else if (object instanceof VendorInvoice) {
                ((VendorInvoice) object).print();
                System.out.println(" ");
            }

            Payout += object.calculatePayment();

        }
        System.out.println("Total Payout: $" + Payout);
    }
}
