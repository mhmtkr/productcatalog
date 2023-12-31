package com.sense.productcatalog.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.core.convert.CouchbaseCustomConversions;
import org.springframework.data.couchbase.core.convert.CustomConversions;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;
import org.springframework.data.mapping.context.MappingContext;

import java.util.Collection;

@Configuration
@EnableCouchbaseRepositories
public class CouchbaseConfig extends AbstractCouchbaseConfiguration {

    @Bean
    @Primary
    public CouchbaseCustomConversions couchbaseCustomConversions() {
        return this.couchbaseCustomConversions();
    }

    @Value("${couchbase.cluster.bucket}")
    private String bucketName;

    @Value("${couchbase.cluster.password}")
    private String password;

    @Value("${couchbase.cluster.ip}")
    private String ip;

    @Override
    public String getBucketName() {
        return bucketName;
    }

    // Deprecated
    // @Override
    // protected String getBucketPassword() {
    //     return password;
    // }

    // @Override
    // protected List<String> getBootstrapHosts() {
    //    return Arrays.asList(“localhost”);
    // }

    @Override
    public String getConnectionString() {

        return "couchbase://" + ip;
    }

    @Override
    public String getUserName() {

        return bucketName;
    }

    @Override
    public String getPassword() {

        return password;
    }

    //@Override
    //public String typeKey() {
    //    return "javaClass"; // specify typeKey if using the Spring Data Couchbase version prior to 4.0
    //}
}
