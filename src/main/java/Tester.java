public class Tester {

    public static void main(String[] args) {


        Employee impiegato = new Employee("matteo","cimino","via delle rose");
        System.out.println(impiegato.getEmployeeDetails());
        Badge badge = new Badge(impiegato);
        badge.showBadgeDetails();
        Employee impiegato1 = new Employee("salvo","rossi","via delle rose");
        impiegato1.getEmployeeDetails();
        Badge badge1 = new Badge(impiegato1);
        badge1.showBadgeDetails();

    }
}
