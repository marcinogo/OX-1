package com.mycompany.app.component;

import com.mycompany.app.net.Sign;

/**
 * @author Wiktor Rup
 */
public class UserSettings {

    private Sign startSign;

    public UserSettings(int whoStarts) {
        if (whoStarts == 1)
            this.startSign = Sign.O;
        else this.startSign = Sign.X;
    }

    Sign getStartSign() {
        return startSign;
    }
}
