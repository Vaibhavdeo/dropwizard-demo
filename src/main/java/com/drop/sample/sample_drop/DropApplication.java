package com.drop.sample.sample_drop;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DropApplication extends Application<DropConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DropApplication().run(args);
    }

    @Override
    public String getName() {
        return "sample-drop";
    }

    @Override
    public void initialize(final Bootstrap<DropConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DropConfiguration configuration,
                    final Environment environment) {
    	        environment.jersey().register(new HelloResource());
    }
}
