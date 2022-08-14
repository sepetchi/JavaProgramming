package week09;

public class SearchTest {
    public static void main(String[] args) {
        System.out.println("--Starting Etsy Search Smoke Test-------------");
        openBrowser("Chrome");

        navigateToUrl("https://www.etsy.com/");

        searchForItem("wooden spoon");
        if (!verifyResultAreDisplayed("wooden spoon")) {
            System.out.println("Search Test for Etsy PASSED");
        } else {
            System.out.println("Search Test for Etsy FAILED");
        }


    }
    public static void openBrowser(String browser){ // no return methd with one parameter
        System.out.println("Launching "+ browser+ " browser");
    }
    public static void  navigateToUrl(String url){
        System.out.println("Navigate to "+url);
    }
    public static String searchForItem(String item){
        String searchResult = "15,811 results for "+item;
        return searchResult;

    }
    public static boolean verifyResultAreDisplayed(String item){
        return searchForItem(item).isEmpty();
    }
}
