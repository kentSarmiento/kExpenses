package com.database.expenses.resources;

public class kExUseragent {

    public static final String WEB_BROWSER = "Web Browser";
    public static final String ANDROID = "Android OS";
    public static final String IOS = "iOS";
    public static final String NATIVE = "Native";

    private String userAgent;

    public kExUseragent() {
        this.userAgent = NATIVE;
    }
    public kExUseragent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getUseragent() {
        return userAgent;
    }
    public void setUseragent(String userAgent) {
        // TODO: Check against possible values
        this.userAgent = userAgent;
    }
}