package com.futurefry.mytickets.config;

import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author ranjeet
 */
@ApplicationPath("api")
public class ApplicationConfig extends Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationConfig.class);

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        LOGGER.info("Added resource files:  " + resources.size());
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method. It is automatically
     * populated with all resources defined in the project. If required, comment
     * out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
    }

}
