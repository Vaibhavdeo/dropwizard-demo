package com.sample.drop.app;

import com.codahale.metrics.health.HealthCheck;
import com.sample.drop.repositories.PersonDB;

public class RestHealthCheck extends HealthCheck {

    @Override
    protected Result check() throws Exception {
        if (PersonDB.getCount() == 0) {
            return Result.unhealthy("No persons in DB! Version: " );
        }
        return Result.healthy("OK with version: "  +
                ". Persons count: " + PersonDB.getCount());
    }
}
