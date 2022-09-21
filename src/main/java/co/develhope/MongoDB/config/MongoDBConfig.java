package co.develhope.MongoDB.config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import java.sql.Connection;
import java.util.Collection;
import java.util.Collections;

@Configuration
public class MongoDBConfig  extends AbstractMongoClientConfiguration {

    @Override
    protected String getDatabaseName() {
        return "Nosql";
    }

    @Override
    public MongoClient mongoClient() {
        ConnectionString connectionString = new ConnectionString
                ("mongodb+srv://glad:2QTeIjdQGOluLj7Z@cluster0.zrtk3hb.mongodb.net/?retryWrites=true&w=majority");
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .serverApi(ServerApi.builder()
                        .version(ServerApiVersion.V1)
                        .build())
                .build();
        MongoClient mongoClient = MongoClients.create(settings);
        return mongoClient;
    }

    @Override
    protected Collection<String> getMappingBasePackages() {
        return Collections.singleton("co.develhope");
    }


}
