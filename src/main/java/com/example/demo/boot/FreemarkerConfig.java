package com.example.demo.boot;

import com.example.demo.Shiro.ShiroTags;
import freemarker.template.Configuration;
import freemarker.template.TemplateModelException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class FreemarkerConfig {
    @Autowired
    private Configuration configuration;
    @PostConstruct
    public void setSharedVariable() throws TemplateModelException {
        configuration.setSharedVariable("shiro", new ShiroTags());
    }
}
