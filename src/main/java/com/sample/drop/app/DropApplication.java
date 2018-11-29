package com.sample.drop.app;

import com.sample.drop.config.RestConfig;
import com.sample.drop.controller.PersonController;
import com.sample.drop.exception.ExceptionMapper;
import com.sample.drop.exception.RestCustomException;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DropApplication extends Application<RestConfig> {

    public static void main(final String[] args) throws Exception {
        new DropApplication().run(args);
    }

    @Override
    public String getName() {
        return "sample-drop";
    }

    @Override
    public void initialize(final Bootstrap<RestConfig> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final RestConfig configuration,
                    final Environment environment) {
    	        environment.jersey().register(new PersonController());

    	        environment.healthChecks().register("template",new RestHealthCheck());

        environment.jersey().register(new ExceptionMapper());
    }

}
