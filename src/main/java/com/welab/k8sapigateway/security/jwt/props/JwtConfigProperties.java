package com.welab.k8sapigateway.security.jwt.props;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(value = "jwt", ignoreUnknownFields = true)
public class JwtConfigProperties {
    private String header;
    private String secretKey;
}
