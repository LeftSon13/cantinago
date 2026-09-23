package br.com.cantinago;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Ponto de entrada da aplicação CantinaGO.
 *
 * <p>Ponto de estudo: {@link SpringBootApplication} habilita a configuração
 * automática e a descoberta dos componentes nos subpacotes de
 * {@code br.com.cantinago}.
 */
@SpringBootApplication
public class AplicacaoCantinaGo {

    public static void main(String[] argumentos) {
        SpringApplication.run(AplicacaoCantinaGo.class, argumentos);
    }
}
