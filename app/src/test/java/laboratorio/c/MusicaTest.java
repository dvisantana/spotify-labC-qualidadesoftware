package laboratorio.c;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;

public class MusicaTest {
    @Test
    public void testPesquisarPorGenero() {
        List<Musica> musicas = new ArrayList<>();
        musicas.add(new Musica(1, "Música 1", "Artista 1", "Pop", 2022, "Álbum 1", 3.5, "Letra da Música 1"));
        musicas.add(new Musica(2, "Música 2", "Artista 2", "Rock", 2020, "Álbum 2", 4.2, "Letra da Música 2"));
        musicas.add(new Musica(3, "Música 3", "Artista 3", "Pop", 2019, "Álbum 3", 4.0, "Letra da Música 3"));

        List<Musica> musicasEncontradas = App.pesquisarPorGenero(musicas, "Pop");

        assertEquals(2, musicasEncontradas.size());
        assertEquals("Música 1", musicasEncontradas.get(0).getNome());
        assertEquals("Música 3", musicasEncontradas.get(1).getNome());
    }
}
