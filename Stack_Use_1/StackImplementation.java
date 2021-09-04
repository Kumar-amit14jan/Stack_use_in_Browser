import java.util.Stack;
import java.util.Scanner;

public class StackImplementation {

    private static Stack<String> history = new Stack<String>();

    public static Boolean isBrowsingHistoryEmpty() {

        return history.isEmpty();
    }

    public static String mostRecentlyVisitedSite() {
        return history.peek();
    }

    public static void addSiteToHistory(String url) {
        history.add(url);
    }

    public static void goBackInTime(int n) {
        if(history.isEmpty()){
            return;
        }
        int count = 1;
        while(count <=n){
            history.pop();
            count++;
        }
    }

    public static void printBrowsingHistory() {

        // if stack is empty then this line of code will work
        if(history.isEmpty()){
            System.out.println("Browsing history is empty");
            return;
        }
        System.out.println(history);  // print the Browsering history
    }

    public static void main(String[] args) {
        System.out.println(isBrowsingHistoryEmpty()); // Checking if Browsing History is Empty
        addSiteToHistory("www.google.co.in"); // Navigating to Google
        addSiteToHistory("www.facebook.com"); // Navigating to Facebook
        addSiteToHistory("www.codingninja.com"); // Navigating to coding Ninja
        System.out.println(isBrowsingHistoryEmpty()); // Checking if Browsing History is Empty
        System.out.println(mostRecentlyVisitedSite()); // Fetching most recently visited site (UpGrad)
        addSiteToHistory("www.youtube.com"); // Navigating to Youtube
        goBackInTime(2); // Going back by 2 sites
        addSiteToHistory("www.yahoo.com"); // Navigating to UpGrad platform site
        System.out.println(mostRecentlyVisitedSite()); // Fetching most recently visited site (UpGrad Learn Platform)
        printBrowsingHistory(); // Printing browsing history

    }

}

/**
 * code should have the following Output:

 * true
 * false
 * www.codingninja.com
 * www.yahoo.com
 * [www.google.co.in, www.facebook.com, www.yahoo.com]
 */
