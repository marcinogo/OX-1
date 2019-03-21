package com.mycompany.app;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Wiktor Rup
 */
class BundleProvider {


    private String language;

    BundleProvider(String language) {
        this.language = language;

    }

    String getMessage(String key) {
        if(language.equals("pl"))
            return ResourceBundle.getBundle("OX", new Locale(language, "PL")).getString(key);
        else return ResourceBundle.getBundle("OX", new Locale(language, "EN")).getString(key);
    }

}
