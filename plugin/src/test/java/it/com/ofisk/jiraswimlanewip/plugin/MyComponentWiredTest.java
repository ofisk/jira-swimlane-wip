package it.com.ofisk.jiraswimlanewip.plugin;

import com.atlassian.plugins.osgi.test.AtlassianPluginsTestRunner;
import com.atlassian.sal.api.ApplicationProperties;
import com.ofisk.jiraswimlanewip.plugin.api.SwimlaneWIPComponent;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(AtlassianPluginsTestRunner.class)
public class MyComponentWiredTest
{
    private final ApplicationProperties applicationProperties;
    private final SwimlaneWIPComponent _swimlaneWIPComponent;

    public MyComponentWiredTest(ApplicationProperties applicationProperties,SwimlaneWIPComponent swimlaneWIPComponent)
    {
        this.applicationProperties = applicationProperties;
        this._swimlaneWIPComponent = swimlaneWIPComponent;
    }

    @Test
    public void testMyName()
    {
        assertEquals("names do not match!", "myComponent:" + applicationProperties.getDisplayName(), _swimlaneWIPComponent.getName());
    }
}