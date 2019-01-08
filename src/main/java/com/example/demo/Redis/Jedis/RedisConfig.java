package com.example.demo.Redis.Jedis;

//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.serializer.StringRedisSerializer;
//import redis.clients.jedis.JedisPoolConfig;
//
///**
// * @author 程序猿DD
// * @version 1.0.0
// * @date 16/4/15 下午3:19.
// * @blog http://blog.didispace.com
// */
//@Configuration
//public class RedisConfig {
//
//    /**
//     * 需要设置 redis 密码的话，必须按照此写法来
//     * @return
//     */
//    @Bean
//    @ConfigurationProperties(prefix="spring.redis.jedis.pool")
//    public JedisPoolConfig jedisPoolConfig() {
//        return new JedisPoolConfig();
//    }
//
//    @SuppressWarnings("deprecation")
//    @Bean
//    @ConfigurationProperties(prefix="spring.redis")
//    JedisConnectionFactory jedisConnectionFactory() {
//        JedisConnectionFactory factory = new JedisConnectionFactory();
//        factory.setPoolConfig(jedisPoolConfig());
//        return new JedisConnectionFactory();
//    }
//
//    @Bean
//    public RedisTemplate<String, User> redisTemplate(RedisConnectionFactory factory) {
//        RedisTemplate<String, User> template = new RedisTemplate<String, User>();
//        template.setConnectionFactory(jedisConnectionFactory());
//        template.setKeySerializer(new StringRedisSerializer());
//        template.setValueSerializer(new RedisObjectSerializer());
//        return template;
//    }
//}
