package org.example.grocery.home_page;

import org.example.grocery.Browser;

public class HomePage {

    static String url = "http://localhost:4200/welcome";


    public static void goTo() {
        Browser.goTo(url);
    }

    public static String isAt() {
        return BrowserHomePage.checkURL();
    }


}
