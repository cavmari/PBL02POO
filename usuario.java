import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private List<Playlist> playlists;
    private List<String> artistasSeguidos;

    public Usuario() {
        this.playlists = new ArrayList<>();
        this.artistasSeguidos = new ArrayList<>();
    }

    public void criarPlaylist(String nome) {
        playlists.add(new Playlist(nome));
    }

    public void seguirArtista(String nomeArtista) {
        artistasSeguidos.add(nomeArtista);
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public List<String> getArtistasSeguidos() {
        return artistasSeguidos;
    }
}
