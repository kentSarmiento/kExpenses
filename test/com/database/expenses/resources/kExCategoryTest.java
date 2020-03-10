package com.database.expenses.resources;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.klib.logger.Logger;

public class kExCategoryTest {

    @Test
    public void checkDefaultCategories() {
        kExCategory category = new kExCategory();
        Logger.info("Main category is: " + category.getMainCategory());
        Logger.info("Sub category is: " + category.getSubCategory());
        assertEquals(category.getMainCategory(), kExCategory.ONLINE);
        assertEquals(category.getSubCategory(), kExCategory.NETFLIX);
    }
    @Test
    public void checkSetCategories() {
        kExCategory category = new kExCategory(kExCategory.MEALS, kExCategory.DINNER);
        Logger.info("Main category is: " + category.getMainCategory());
        Logger.info("Sub category is: " + category.getSubCategory());
        assertEquals(category.getMainCategory(), kExCategory.MEALS);
        assertEquals(category.getSubCategory(), kExCategory.DINNER);

        category.setMainCategory(kExCategory.GROCERY);
        category.setSubCategory(kExCategory.NULL);
        Logger.info("Main category is: " + category.getMainCategory());
        Logger.info("Sub category is: " + category.getSubCategory());
        assertEquals(category.getMainCategory(), kExCategory.GROCERY);
        assertEquals(category.getSubCategory(), kExCategory.NULL);
    }
}