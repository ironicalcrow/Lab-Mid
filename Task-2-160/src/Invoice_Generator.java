import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Invoice_Generator {
    private Invoice_Generator instance;
    private String filename;
    public Invoice_Generator getInstance() {
        if (instance == null) {
            instance = new Invoice_Generator();
        }
        return instance;
    }

    public void invoice(Order o) {
        filename= "Order"+ o.getOrderID();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true))) {
            String s = "Ice Cream Shop Invoice: ";
            bw.write(s);
            bw.append("Order Number is--" + o.getOrderID());
            int icf = o.orderICFsize();
            int ict = o.orderICTsize();
            for (int i = 0; i < icf; i++) {
                bw.append(o.getF(i).getName() + " - " + o.getF(i).getQuantity() + " scoop:" + o.getF(i).initialCalc());
            }
            for (int i = 0; i < ict; i++) {
                bw.append(o.getT(i).getName() + " - " + o.getT(i).getQuantity() + " time:" + o.getT(i).initialCalc());
            }
            bw.append("Subtotal: " + o.price());
            bw.append("Tax: " + o.getTax());
            bw.append("Total: " + o.SubTotal());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
