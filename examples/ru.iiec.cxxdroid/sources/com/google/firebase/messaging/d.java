package com.google.firebase.messaging;

import java.util.Locale;

public final class d extends Exception {
    d(String str) {
        super(str);
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.US);
            switch (lowerCase.hashCode()) {
                case -1743242157:
                    if (!lowerCase.equals("service_not_available")) {
                        return;
                    }
                    return;
                case -1290953729:
                    if (!lowerCase.equals("toomanymessages")) {
                        return;
                    }
                    return;
                case -920906446:
                    if (!lowerCase.equals("invalid_parameters")) {
                        return;
                    }
                    return;
                case -617027085:
                    if (!lowerCase.equals("messagetoobig")) {
                        return;
                    }
                    return;
                case -95047692:
                    if (!lowerCase.equals("missing_to")) {
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
