package dev.matheuscruz.livraria.modelo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class AutorTest {


    @Test
    void deveCriarUmAutorCorretamente() {
        // dado
        Autor autor = Autor.criarAutor("John", "Doe");

        // quando
        String id = autor.getId();
        String nome = autor.getNome();
        String sobrenome = autor.getSobrenome();

        // entao
        assertNotNull(id);
        assertThat(id).isNotBlank();
        assertThat(nome).isNotBlank();
        assertThat(sobrenome).isNotBlank();
    }
}