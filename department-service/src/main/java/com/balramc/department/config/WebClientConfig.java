package com.balramc.department.config;

import com.balramc.department.client.UsersDeclarativeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.reactive.LoadBalancedExchangeFilterFunction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class WebClientConfig {

    //For Load balance
    @Autowired
    private LoadBalancedExchangeFilterFunction loadBalancedExchangeFilterFunction;

    @Bean
    public WebClient userClient() {
        return WebClient
                .builder()
                .baseUrl("http://USER-SERVICE")
                .filter(loadBalancedExchangeFilterFunction)
                .build();
    }

    @Bean
    public UsersDeclarativeClient usersDeclarativeClient(){
        HttpServiceProxyFactory httpServiceProxyFactory =
                HttpServiceProxyFactory
                        .builder()
                        .exchangeAdapter(WebClientAdapter.create(userClient()))
                        .build();
        return httpServiceProxyFactory.createClient(UsersDeclarativeClient.class);
    }


}
