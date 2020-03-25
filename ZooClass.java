import java.util.*;
public class ZooClass {
    public static void main(String[] args) {
        // Declaring and Initializing the required variables
        int isGroup,child,adult,senior,achild,uchild;
        float ranking = 0,totalEntry =0;
        // Initializing Scanner class for inputing values from user
        Scanner in = new Scanner(System.in);
        while (true) {            
            System.out.print("Enter a group? (Yes=1/No=0): ");
            isGroup = in.nextInt();
            // checking if the entry is group or not, breaking the loop if entry is not a group
            if(isGroup != 1){ break; }
            // Input user data and storing into the variables
            System.out. print("Enter the number of children (age 6–15): ");
            child = in.nextInt();
            System.out. print("Enter the number of adults (age 16–59): ");
            adult = in.nextInt();
            System.out. print("Enter the number of seniors (age 60+): ");
            senior = in.nextInt();
            // Checking the condition when no. of adults and seniors are greater than no. of child
            // we can get no. of accompanied child by adding no. of adults and seniors
            // and unaccompanied child as no. of child - no. of accompanied child
            if((adult+senior) < child){
                achild = (adult+senior);
                uchild = (child-achild);                
            }else{
                // if above condition is not met accompanied child will be no of child
                // and unaccompanied child will be 0
                achild = child;
                uchild = 0;
            }
            // System.out. println("Total achild "+achild+" Total uchild "+uchild);
            // Calculating the price of entry according to charge rate
            totalEntry = (achild*2)+(uchild*5)+(adult*10)+(senior*8);
            System.out. println("Total entry charge is $"+totalEntry);
            // summing ranking as addition of  totalEntry of group
            ranking+=totalEntry;
        }
        // Displaying total ranking
        System.out. println("Total rankings is $"+ranking);
    }
}