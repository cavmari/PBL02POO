    public class Main {
        public static void main(String[] args) {
            Usuario usuario = new Usuario();
            
      
            Musica musica1 = new Musica("Bohemian Rhapsody", "Queen");
            Musica musica2 = new Musica("Hotel California", "Eagles");
            Musica musica3 = new Musica("Stairway to Heaven", "Led Zeppelin");
    

            Playlist playlist1 = new Playlist("Rock Classics");
            playlist1.adicionarMusica(musica1);
            playlist1.adicionarMusica(musica2);
            playlist1.adicionarMusica(musica3);
            usuario.criarPlaylist(playlist1.toString());
    

            usuario.seguirArtista("Queen");
            usuario.seguirArtista("Eagles");
    

            System.out.println("Playlists do usuário:");
            for (Playlist playlist : usuario.getPlaylists()) {
                System.out.println("- " + playlist);
            }
    
            System.out.println("\nArtistas seguidos pelo usuário:");
            for (String artista : usuario.getArtistasSeguidos()) {
                System.out.println("- " + artista);
            }
        }
    }
    
