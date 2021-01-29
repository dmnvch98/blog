package com.example.listener;

import com.example.service.impl.ServiceManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ApplicationListener implements ServletContextListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationListener.class);
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServiceManager.getInstance(servletContextEvent.getServletContext());
        LOGGER.info("Applications started...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        ServiceManager.getInstance(servletContextEvent.getServletContext()).destroy();
        LOGGER.info("Applications destroyed...");
    }
}
