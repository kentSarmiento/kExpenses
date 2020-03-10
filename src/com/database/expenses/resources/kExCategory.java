package com.database.expenses.resources;

public class kExCategory {

    // Main Categories
    public static final String GROCERY = "Groceries";
    public static final String SUPPLIES = "Supplies";
    public static final String MEALS = "Meals";
    public static final String RECREATION = "Recreation";
    public static final String COMMUTE = "Recreation";
    public static final String PAYMENTS = "Payments";
    public static final String ONLINE = "Online";
    public static final String LAUNDRY = "Laundry";
    public static final String OTHERS = "Others";

    // Sub Category : Meals
    public static final String DINNER = "Dinner";

    // Sub Category : Online
    public static final String NETFLIX = "Netflix";

    public static final String NULL = "";

    private String mainCategory;
    private String subCategory;

    public kExCategory() {
        this.mainCategory = ONLINE;
        this.subCategory = NETFLIX;
    }
    public kExCategory(String mainCategory, String subCategory) {
        this.mainCategory = mainCategory;
        this.subCategory = subCategory;
    }

    public String getMainCategory() {
        return mainCategory;
    }
    public void setMainCategory(String mainCategory) {
        // TODO: Check against possible values
        this.mainCategory = mainCategory;
    }
    public String getSubCategory() {
        return subCategory;
    }
    public void setSubCategory(String subCategory) {
        // TODO: Check against possible values
        this.subCategory = subCategory;
    }
}