package com.database.expenses.resources;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.klib.logger.Logger;

public class kExUseragentTest {

    @Test
    public void checkDefaultUserAgent() {
        kExUseragent userAgent = new kExUseragent();
        Logger.info("User Agent set is: " + userAgent.getUseragent());
        assertEquals(userAgent.getUseragent(), kExUseragent.NATIVE);
    }
    @Test
    public void checkAssignedUserAgent() {
        kExUseragent userAgent = new kExUseragent(kExUseragent.WEB_BROWSER);
        Logger.info("User Agent set is: " + userAgent.getUseragent());
        assertEquals(userAgent.getUseragent(), kExUseragent.WEB_BROWSER);

        userAgent.setUseragent(kExUseragent.IOS);
        Logger.info("User Agent set is: " + userAgent.getUseragent());
        assertEquals(userAgent.getUseragent(), kExUseragent.IOS);
    }
}