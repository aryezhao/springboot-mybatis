package com.usts.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lenovo on 2019/7/1.
 */
@Configuration   //applicationContext.xml
public class RedisConfig {

    //注入集群节点信息
    @Value("${spring.redis.cluster.nodes}")
    private String clusterNodes;

    @Bean
    public JedisCluster getJedisCluster(){

        //分割集群节点
        String[] cNodes = clusterNodes.split(",");

        //创建Set集合对象
        Set<HostAndPort> nodes = new HashSet<>();

        //循环集群节点对象
        for(String node:cNodes){
            String[] hp = node.split(":");
            nodes.add(new HostAndPort(hp[0],Integer.parseInt(hp[1])));
        }

        //创建Redis集群对象
        JedisCluster jedisCluster = new JedisCluster(nodes);

        return jedisCluster;
    }
}
