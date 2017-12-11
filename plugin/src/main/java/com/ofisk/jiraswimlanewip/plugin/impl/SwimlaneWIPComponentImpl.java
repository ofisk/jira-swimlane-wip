package com.ofisk.jiraswimlanewip.plugin.impl;

import com.atlassian.plugin.spring.scanner.annotation.export.ExportAsService;
import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;
import com.atlassian.sal.api.ApplicationProperties;
import com.ofisk.jiraswimlanewip.plugin.api.SwimlaneWIPComponent;

import javax.inject.Inject;
import javax.inject.Named;

@ExportAsService ({SwimlaneWIPComponent.class})
@Named ("myPluginComponent")
public class SwimlaneWIPComponentImpl implements SwimlaneWIPComponent
{
    @ComponentImport
    private final ApplicationProperties applicationProperties;

    @Inject
    public SwimlaneWIPComponentImpl(final ApplicationProperties applicationProperties)
    {
        this.applicationProperties = applicationProperties;
    }

    public String getName()
    {
        if(null != applicationProperties)
        {
            return "myComponent:" + applicationProperties.getDisplayName();
        }
        
        return "myComponent";
    }
}