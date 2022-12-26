package com.example.sidepot.global.config.security;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

@Getter
@ConfigurationProperties(prefix = "sidepot")
public class SidePotProperties {

    private String signKey = "develop-secret-value-as89ef7yqcpn349icr5q398rnAWEUIFYADLJH!";

    private Date expiryAccess = Date.from(
            Instant.now()
                    .plus(59, ChronoUnit.MINUTES)
    );

    private Date expiryRefresh= Date.from(
            Instant.now()
                    .plus(120,ChronoUnit.MINUTES)
    );

}