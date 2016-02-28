package ua.org.shaddy.cardsgame.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
@Configuration
@EnableMongoRepositories(basePackages = "ua.org.shaddy.cardsgamte.db")
public class MongoConfig {
	private Logger logger = LoggerFactory.getLogger(getClass());


    @Bean
    public MongoClientFactoryBean mongoFactoryBean(Config config) {
    	MongoClientFactoryBean mongoFactoryBean = new MongoClientFactoryBean();
        mongoFactoryBean.setHost(config.getMongoAddress());
        mongoFactoryBean.setPort(config.getMongoPort());
        return mongoFactoryBean;
    }

    @Bean
    public MongoTemplate mongoTemplate(MongoClientFactoryBean mongoFactoryBean, Config config) throws Exception {
        MongoTemplate template = new MongoTemplate(mongoFactoryBean.getObject(), config.getMongoDb());
        return template;
    }
}
