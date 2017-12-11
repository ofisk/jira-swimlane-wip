package ut.com.ofisk.jiraswimlanewip.plugin;

import com.ofisk.jiraswimlanewip.plugin.api.MyPluginComponent;
import com.ofisk.jiraswimlanewip.plugin.impl.MyPluginComponentImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}