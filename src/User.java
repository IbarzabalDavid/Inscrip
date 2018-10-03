public class User {
    private String prenom;
    private String nomDeFamille;
    private String nomUtilisateur;
    private String password;
    private String genre;
    private String age;

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomDeFamille() {
        return nomDeFamille;
    }

    public void setNomDeFamille(String nomDeFamille) {
        this.nomDeFamille = nomDeFamille;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public User(String prenom, String nomDeFamille, String nomUtilisateur, String password, String genre, String age) {
        this.prenom = prenom;
        this.nomDeFamille = nomDeFamille;
        this.nomUtilisateur = nomUtilisateur;
        this.password = password;
        this.genre = genre;
        this.age = age;
    }
}
