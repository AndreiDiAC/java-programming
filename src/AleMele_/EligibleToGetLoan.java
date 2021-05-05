package AleMele_;
/*
[Eligible to get Loan]

Given two values: yearly salary and credit score determine if you can get a loan.

    To be approve for the loan, print: "Loan Approved":
        Salary: above 60,000
        Credit Score: above 650
    Otherwise print: "Loan Denied"
 */
public class EligibleToGetLoan {
    public static void main(String[] args) {
        int salary = 60_000;
        int creditScore = 650;
        String x = salary >= 60_000 && creditScore >= 650 ? "Loan Approved" : "Loan denied";
        System.out.println(x);
    }

}
