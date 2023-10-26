public class Pattern1 { // start of class
    public static void main(String [] args) // Begin - main()
    {
        int num = 2; // since you want 5 as the max value for *
        for (int i=1;i<=num;i++) { // start with high to low
// watch out for j<=i, the pattern should print until i only
            for(int j=1; j<=i; j++) { // inner loop befgin
                System.out.print(" * "); // watch out for print here, println is not used
            } // inner loop end
            System.out.print("\n"); // new line
        } // outer loop end
    } // end of main()
} // end of class