package com.wrup.oxapp;

import java.util.Locale;
import java.util.Objects;
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
        if (language.equals("pl"))
            return ResourceBundle.getBundle("OX", new Locale(language, "PL")).getString(key);
        else return ResourceBundle.getBundle("OX", new Locale(language, "EN")).getString(key);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BundleProvider that = (BundleProvider) o;
        return Objects.equals(language, that.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language);
    }
}
