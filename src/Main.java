
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         double initialBalance = 5000;
         double interestRate = 0.17;
         double InterestDueM1;
          double InterestDueM2;
          double InitialBalance2 = 5850;

          InterestDueM1 = initialBalance * interestRate;
          InitialBalance2 = initialBalance + InterestDueM1;
          InterestDueM2 = InitialBalance2 * interestRate;

        System.out.println("The interest due month 1 is " + InterestDueM1 );
        System.out.println("The interest due month 2 is " + InterestDueM2 );
        }
    }
