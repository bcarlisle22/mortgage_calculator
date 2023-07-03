class Main {
  public static void main(String[] args) {
    System.out.println("\n");
    // title of the program - tells the user what this program does
    System.out.println("\t\t\t\t Mortgage Calculator \t\t\t\t" + "\n");

    // declaring the variables, user input variables

    // how much will the loan be for?
    // what is the term of the loan?
    /*
     * what is the interest rate? based on which loan term is selected, interest
     * rate changes
     */
    // the resUlt of the variables entered by the user equal the monthly payment

    int loanAmount = 240000;
    int loanTerm = 30;
    Double interestRateOne = 7.62;
    Double interestRateTwo = 6.761;
    Double monthlyPayment;

    // asks for user input to assign values to declared variables
    System.out.println("Loan amount:  " + loanAmount);
    System.out.println("Loan term (15 or 30): " + loanTerm);

    /*
     * percent sign in java refers to modulo operator so percentage needed to be
     * formulated mannually includes both variables for cooresponding interest rates
     */

    interestRateOne = interestRateOne * 0.01;
    interestRateTwo = interestRateTwo * 0.01;
    
    // if else statement to adjust and output monthly payment formula based on input
    // includes alternate response for if user enters anything other than 15 or 30 
    
    
    if (loanTerm ==30){
      monthlyPayment = (interestRateOne / 12) * loanAmount;
      System.out.println("Monthly Payment: $" + Math.round(monthlyPayment));
    } 
    else if (loanTerm ==15){
      monthlyPayment = (interestRateTwo / 12) * loanAmount;
      System.out.println("Monthly Payment: $" + Math.round(monthlyPayment));
    } 
    else {
      System.out.println("Opps! Please enter loan term (15 or 30): ");
    }
    
  }
}