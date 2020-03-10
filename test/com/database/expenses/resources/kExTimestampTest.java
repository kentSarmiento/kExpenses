package com.database.expenses.resources;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.klib.logger.Logger;

public class kExTimestampTest {

    @Test
    public void checkDate() {
        kExTimestamp date = new kExTimestamp();

        Logger.info("Date: " + date.getYear() + "-" + date.getMonth() + "-"  + date.getDay());
        assertEquals(date.getYear(), kExTimestamp.THIS_YEAR);
        assertEquals(date.getMonth(), kExTimestamp.THIS_MONTH);
        assertEquals(date.getDay(), kExTimestamp.THIS_DAY);
    }

    @Test
    public void checkTime() {
        kExTimestamp date = new kExTimestamp();

        Logger.info("Time: " + date.getHour() + ":" + date.getMinutes());
        assertEquals(date.getHour(), kExTimestamp.THIS_HOUR);
        assertEquals(date.getMinutes(), kExTimestamp.THIS_MIN);
    }
}