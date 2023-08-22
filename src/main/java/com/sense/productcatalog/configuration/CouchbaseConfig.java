package com.sense.productcatalog.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@Configuration
@EnableCouchbaseRepositories
public class CouchbaseConfig extends AbstractCouchbaseConfiguration {

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
        return null;
    }

    @Override
    public String getUserName() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    //@Override
    //public String typeKey() {
    //    return "javaClass"; // specify typeKey if using the Spring Data Couchbase version prior to 4.0
    //}
}
