package storePayment;

public class DepartmentSituation {
    public static void main(String[] args) {
        // 전제 상황
        int price = 10000;
        Staff staff = new Staff();
        staff.setStalesAmount(1_000_000);

        Customer customer2 = new VIPCustomer("아이유");

        Customer[] customersQueue = {
                new Customer("권율"),
                customer2,
                new Customer("김좌진"),
                new Customer("장원영"),
                new VIPCustomer("김혜수"),
                customer2,
                new GoldCustomer("정우성"),
                new GoldCustomer("김민채"),
        };

        //시나리오
        for (Customer customer : customersQueue) {
            System.out.println(customer.toString());
            int cash = staff.helpPay(customer, price);
            System.out.println("내가 내는 금액은 : " + cash);
            staff.addSalesAmont(cash);
        }
        staff.printMySalseAmount();


    }
}
