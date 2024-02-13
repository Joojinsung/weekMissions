package chapter41;

public class DepartmentSituation {
    public static void main(String[] args) throws InterruptedException {
        // 전제 상황
        int price = 10000;
        Staff staff = new Staff();
        staff.setStalesAmount(1_000_000);


        Customer customer1 = new Customer("권율");
        Customer customer2 = new Customer("이순신");
        Customer customer3 = new VIPCustomer("김좌진");
        Customer customer4 = new VIPCustomer("김혜수");
        Customer customer5 = new GoldCustomer("김혜수");


        String hello1 = "Hello";
        String hello2 = new String("Hello");
        String hello3 = new String("Hello");
        String hello4 = new String("Hello");


        Customer[] customersQueue = {
                new GoldCustomer("정우영")
        };

        //시나리오
        for (Customer customer : customersQueue) {
            System.out.println(customer.toString());
            int cash = staff.helpPay(customer, price);
            System.out.println("내가 내는 금액은 : " + cash);
            staff.addSalesAmont(cash);
        }
        staff.printMySalseAmount();

        while (true) {
            Thread.sleep(100);
        }
    }
}
