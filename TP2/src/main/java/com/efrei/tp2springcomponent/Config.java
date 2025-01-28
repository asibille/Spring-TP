package com.efrei.tp2springcomponent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Value("${limit.livres.empruntes}")
    private int limitLivresEmpruntes;

    @Value("${duree.max.location}")
    private int dureeMaxLocation;

    @Bean
    public ParametresProjet parametresProjet() {
        return new ParametresProjet(limitLivresEmpruntes, dureeMaxLocation);
    }

    public int getLimitLivresEmpruntes() {
        return limitLivresEmpruntes;
    }

    public int getDureeMaxLocation() {
        return dureeMaxLocation;
    }

    public static class ParametresProjet {
        private int limitLivresEmpruntes;
        private int dureeMaxLocation;

        public ParametresProjet(int limitLivresEmpruntes, int dureeMaxLocation) {
            this.limitLivresEmpruntes = limitLivresEmpruntes;
            this.dureeMaxLocation = dureeMaxLocation;
        }

        public int getLimitLivresEmpruntes() {
            return limitLivresEmpruntes;
        }

        public int getDureeMaxLocation() {
            return dureeMaxLocation;
        }
    }
}
