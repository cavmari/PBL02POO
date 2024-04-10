import java.util.ArrayList;
import java.util.List;

public class playlist {
    private String nome;
    private List<Musica> musicas;

    public Playlist(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    @Override
    public String toString() {
        return nome;
    }
}
