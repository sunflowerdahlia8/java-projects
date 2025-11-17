public class MyClass {

    public static void main(String args[]) {
  
       long basicpay = 35000L;
       int workingday = 21;
       double dailyrate = 1666.67;
       int vacationleave = 5;
       int leavecredit = 3;
  
       float sss = 0.045f;
       int pagibig = 600;
       float tax = 0.10f;
       int tardiness = 30;

       double perhour = dailyrate / 8;
       double late = dailyrate / 8;
       double later = late / 2;
       double unpaidleave = vacationleave - leavecredit;
       double anotherunpaid = dailyrate * unpaidleave;
       double sss_deduct = basicpay * sss;
       double tax_total = basicpay * tax;
       double totaldeduct = sss_deduct + tax_total + pagibig + later + anotherunpaid;
       double totalpay = basicpay - totaldeduct;
  
   
  
      System.out.println("Basic pay: " + basicpay);
      System.out.println("Working day: " + workingday);
      System.out.println("Daily rate: " + dailyrate);
      System.out.println("Vacation leave: " + vacationleave);
      System.out.println("Leave credit: " + leavecredit);
      System.out.println("SSS: 4.5%");
      System.out.println("PAG-IBIG: " + pagibig);
      System.out.println("Tax: 10%");
      System.out.println("Tardiness: " + tardiness + " mins");
      System.out.println("********************************************");
      System.out.println("Net pay: " + totalpay);
      System.out.println("Per hour: " + perhour);
      System.out.println("Unpaid leave: " + anotherunpaid);
      System.out.println("Total Deduction: " + totaldeduct);
  
    }
  
  }