package com.fsck.k9.mail;

import android.app.Application;

public class K9 {
    public static final boolean DEBUG = true;
    public static final boolean DEBUG_PROTOCOL_IMAP = true;
    public static final boolean DEBUG_PROTOCOL_SMTP = true;
    public static final boolean DEBUG_PROTOCOL_POP3 = true;
    public static final boolean DEBUG_PROTOCOL_WEBDAV = true;
    public static final boolean DEBUG_SENSITIVE = true;
    public static final String LOG_TAG = "k9";
    public static final int PUSH_WAKE_LOCK_TIMEOUT = 60000;


    public static Application app = null;

    public static final String IDENTITY_HEADER = "X-K9mail-Identity";

    public static boolean hideTimeZone() {
        return false;
    }

    public static boolean showCorrespondentNames() {
        return true;
    }

    public static boolean changeContactNameColor() {
        return false;
    }

    public static int getContactNameColor() {
        return 0xff00008f;
    }

}
