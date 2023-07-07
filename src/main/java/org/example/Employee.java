package org.example;

public class Employee {
    public void handleCustomer(Customer cust , boolean finance,Vehicle vehicle) {
        if (finance == true) {
            double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
            runCreditHistory(cust, loanAmount);
        } else if (vehicle.getPrice() <= cust.getCashOnHand()) {
                 //customer pays in cash
            processTransaction(cust,vehicle);
        }else {
            System.out.println("CUSTOMER WILL NEED MORE MOUNEY TO PURCHASE THE VEHICLE" + vehicle);
        }
    }
    public  void runCreditHistory(Customer cust,double loanAmount){
        System.out.println("RAN CREDIT HISTORY CUSTOMER...");
        System.out.println("CUSTOMER HAS BEN APPROVED TO PURCHASE THE VEHICLE");


    }
    public void processTransaction(Customer cust, Vehicle vehicle){
        System.out.println("CUSTOMER HAS PURCHASED THE VEHICLE : "+ vehicle + " FOR THE PRICE " + vehicle.getPrice()) ;
    }

}
