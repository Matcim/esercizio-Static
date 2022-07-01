public class Badge {


    private static int totalNumberOfEmployees;
    private final String badgeIdCode;
    public Employee impiegato;

    private static void keepTrackOfEmployeesNumber(){
        totalNumberOfEmployees++;
    }
    private String generateBadgeIdCode(){
        return impiegato.getEmployeeDetails() + " " + Math.random() * (10 + 1);
        // todo: deve ritornare 2 numeri ramdom oltre alla stringa
    }
    public void showBadgeDetails(){
        System.out.println("number of impiegato "
                + totalNumberOfEmployees + " id " + badgeIdCode + " details of impiegato ");
    }

    public Badge(Employee employeeThatNeedsBadge){
        keepTrackOfEmployeesNumber();
        this.impiegato=employeeThatNeedsBadge;
        this.badgeIdCode=generateBadgeIdCode();
        // todo: a constructor method that takes an `Employee` param called `employeeThatNeedsBadge`
    }
}

