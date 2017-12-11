package ut.com.ofisk.jiraswimlanewip.plugin;

import com.ofisk.jiraswimlanewip.plugin.api.SwimlaneWIPComponent;
import com.ofisk.jiraswimlanewip.plugin.impl.SwimlaneWIPComponentImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        SwimlaneWIPComponent component = new SwimlaneWIPComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}