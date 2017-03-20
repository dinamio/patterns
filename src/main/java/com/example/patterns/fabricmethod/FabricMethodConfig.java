package com.example.patterns.fabricmethod;

import org.springframework.context.annotation.Bean;

/**
 * Created by eugen on 3/20/17.
 */
public class FabricMethodConfig {

    @Bean
    public ChampionshipLeague firstLeague() {
        return new FirstLeague();
    }

    @Bean ChampionshipLeague secondLeague() {
        return new SecondLeague();
    }
}
