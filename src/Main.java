import com.sun.istack.internal.FinalArrayList;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;


public class Main extends Application {
    private File file;
    public static void main(String[] args) { launch(args); }

    public void start(Stage primaryStage){



        //VARIABLES

        ArrayList<User> listUser=new ArrayList();
        final ArrayList<User>[] that=new ArrayList[]{listUser};
        final boolean[] checkUp={false,false};
        //Scene1
        Label username=new Label("Nom d'utilisateur");
        Label password=new Label("Mot de passe");
        TextField user=new TextField();
        user.setPromptText("Nom d'utilisateur");
        PasswordField pass = new PasswordField();
        pass.setPromptText("Mot de passe");
        Button connect=new Button("Se connecter");
        Button inscrip=new Button("S'inscrire");
        Label connectWrong=new Label("La connection a écouhée");
        connectWrong.setTextFill(Color.RED);

        //Scene2
        Label prenom=new Label("Prénom");
        Label nomdeFam=new Label("Nom de Famille");
        Label nomUser=new Label("Nom d'utilisateur");
        Label mdp=new Label("Mot de passe");
        Label mdp2=new Label("Confirmer le mot de passe");
        Label genre=new Label("Genre");
        Label age=new Label("Âge");
        TextField prenom1=new TextField();
        prenom1.setPromptText("Pénom");
        TextField nomdeFam1=new TextField();
        nomdeFam1.setPromptText("Nom de famille");
        TextField nomUser1=new TextField();
        nomUser1.setPromptText("Nom d'utilisateur");
        PasswordField mdp1 = new PasswordField();
        mdp1.setPromptText("Mot de passe");
        PasswordField mdp3 = new PasswordField();
        mdp3.setPromptText("Mot de passe");
        Spinner age1 = new Spinner(12,99,18);
        RadioButton bouton1 = new RadioButton("Homme");
        RadioButton bouton2 = new RadioButton("Femme");
        RadioButton bouton3 = new RadioButton("Autre");
        ToggleGroup groupe = new ToggleGroup();
        bouton1.setToggleGroup(groupe);
        bouton2.setToggleGroup(groupe);
        bouton3.setToggleGroup(groupe);
        CheckBox condi = new CheckBox("J'accepte les conditions d'utilisation ");
        Button sinscrire=new Button("S'inscrire");
        Button effacer=new Button("Effacer");
        Button retour=new Button("Retour");
        Label prenomWrong=new Label("Prénom manquant");
        prenomWrong.setTextFill(Color.RED);
        Label nomfamWrong=new Label("Nom de famille manquant");
        nomfamWrong.setTextFill(Color.RED);
        Label nomUserWrong=new Label("Nom d'utilisateur manquant");
        nomUserWrong.setTextFill(Color.RED);
        Label userAlreadyUsed=new Label("L'utiliseur existe déjà");
        userAlreadyUsed.setTextFill(Color.RED);
        Label passwordWrong=new Label("Mot de passe manquant");
        passwordWrong.setTextFill(Color.RED);
        Label passwordNotSame=new Label("Les mots de passe ne corespondent pas");
        passwordNotSame.setTextFill(Color.RED);
        Label genreWrong=new Label("Genre manquant");
        genreWrong.setTextFill(Color.RED);
        Label condiWrong=new Label("Veuillez accepter les conditions d'utilisation");
        condiWrong.setTextFill(Color.RED);


        //Scene3
        ProgressIndicator progress1 = new ProgressIndicator();
        Label load=new Label("Chargement du contenu");


        //LOAD
        try {
            file = new File("archiveCSV.csv");
            load(listUser);
        } catch (Exception e){
            System.out.println("Dont work read2");
        }

        //PLACEMENTS

        primaryStage.setWidth(500);
        primaryStage.setHeight(500);

        //Scene1
        username.setTranslateX(180);
        username.setTranslateY(150);
        password.setTranslateX(180);
        password.setTranslateY(195);
        user.setTranslateX(180);
        user.setTranslateY(170);
        pass.setTranslateX(180);
        pass.setTranslateY(215);
        connect.setTranslateX(180);
        connect.setTranslateY(255);
        inscrip.setTranslateX(270);
        inscrip.setTranslateY(255);
        connectWrong.setTranslateX(180);
        connectWrong.setTranslateY(300);

        //Scene2
        prenom.setTranslateX(180);
        prenom.setTranslateY(20);
        nomdeFam.setTranslateX(180);
        nomdeFam.setTranslateY(70);
        nomUser.setTranslateX(180);
        nomUser.setTranslateY(120);
        mdp.setTranslateX(180);
        mdp.setTranslateY(170);
        mdp2.setTranslateX(180);
        mdp2.setTranslateY(220);
        genre.setTranslateX(180);
        genre.setTranslateY(270);
        age.setTranslateX(180);
        age.setTranslateY(320);
        prenom1.setTranslateX(180);
        prenom1.setTranslateY(40);
        nomdeFam1.setTranslateX(180);
        nomdeFam1.setTranslateY(90);
        nomUser1.setTranslateX(180);
        nomUser1.setTranslateY(140);
        mdp1.setTranslateX(180);
        mdp1.setTranslateY(190);
        mdp3.setTranslateX(180);
        mdp3.setTranslateY(240);
        age1.setTranslateX(180);
        age1.setTranslateY(340);
        bouton1.setTranslateX(180);
        bouton1.setTranslateY(290);
        bouton2.setTranslateX(250);
        bouton2.setTranslateY(290);
        bouton3.setTranslateX(320);
        bouton3.setTranslateY(290);
        condi.setTranslateX(180);
        condi.setTranslateY(370);
        sinscrire.setTranslateX(180);
        sinscrire.setTranslateY(400);
        effacer.setTranslateX(250);
        effacer.setTranslateY(400);
        retour.setTranslateX(310);
        retour.setTranslateY(400);
        prenomWrong.setTranslateX(180);
        prenomWrong.setTranslateY(430);
        nomfamWrong.setTranslateX(180);
        nomfamWrong.setTranslateY(430);
        nomUserWrong.setTranslateX(180);
        nomUserWrong.setTranslateY(430);
        userAlreadyUsed.setTranslateX(180);
        userAlreadyUsed.setTranslateY(430);
        passwordWrong.setTranslateX(180);
        passwordWrong.setTranslateY(430);
        passwordNotSame.setTranslateX(180);
        passwordNotSame.setTranslateY(430);
        genreWrong.setTranslateX(180);
        genreWrong.setTranslateY(430);
        condiWrong.setTranslateX(180);
        condiWrong.setTranslateY(430);





        //Scene3
        progress1.setTranslateX(215);
        progress1.setTranslateY(180);
        load.setTranslateX(180);
        load.setTranslateY(250);




        //GROUPE && SCENE
        Group root=new Group(user,username,pass,password,connect,inscrip);
        Group tronc=new Group(prenom,nomdeFam,nomUser,mdp,mdp2,genre,age,
                prenom1,nomdeFam1,nomUser1,mdp1,mdp3,age1,bouton1,bouton2,bouton3,
                condi,sinscrire,effacer,retour);
        Group branches=new Group(progress1,load);

        Scene sc1=new Scene(root);
        Scene sc2=new Scene(tronc);
        Scene sc3=new Scene(branches);



        //ACTIONS && LISTENERS

        //scene1
        inscrip.setOnAction((event) ->{
            primaryStage.setScene(sc2);
            user.clear();
            pass.clear();
            if (root.getChildren().contains(connectWrong)){
                root.getChildren().remove(connectWrong);
            }
        });
        connect.setOnAction((event) ->{


            if (root.getChildren().contains(connectWrong)){
                root.getChildren().remove(connectWrong);
            }
            for (int i=0;i<that[0].size();i++){
                if (user.getText().equals(that[0].get(i).getNomUtilisateur())){
                    if (hash(pass.getText()).equals(that[0].get(i).getPassword())){
                        primaryStage.setScene(sc3);
                        checkUp[1]=true;
                    }
                }
            }
            if (!checkUp[1]){
                root.getChildren().add(connectWrong);
            }
        });

        //scene2
        sinscrire.setOnAction((event) ->{
            if (tronc.getChildren().contains(prenomWrong)){
                tronc.getChildren().remove(prenomWrong);
            }
            if (tronc.getChildren().contains(nomfamWrong)){
                tronc.getChildren().remove(nomfamWrong);
            }
            if (tronc.getChildren().contains(nomUserWrong)){
                tronc.getChildren().remove(nomUserWrong);
            }
            if (tronc.getChildren().contains(userAlreadyUsed)){
                tronc.getChildren().remove(userAlreadyUsed);
            }
            if (tronc.getChildren().contains(passwordWrong)){
                tronc.getChildren().remove(passwordWrong);
            }
            if (tronc.getChildren().contains(passwordNotSame)){
                tronc.getChildren().remove(passwordNotSame);
            }
            if (tronc.getChildren().contains(genreWrong)){
                tronc.getChildren().remove(genreWrong);
            }
            if (tronc.getChildren().contains(condiWrong)){
                tronc.getChildren().remove(condiWrong);
            }

            for (int i=0;i<that[0].size();i++){
                if (nomUser1.getText().equals(that[0].get(i).getNomUtilisateur())){
                    checkUp[0]=true;
                }
            }

            if (prenom1.getText().equals("")){
                tronc.getChildren().add(prenomWrong);
            }
            else if (nomdeFam1.getText().equals("")){
                tronc.getChildren().add(nomfamWrong);
            }
            else if (nomUser1.getText().equals("")){
                tronc.getChildren().add(nomUserWrong);
            }
            else if (checkUp[0]){
                tronc.getChildren().add(userAlreadyUsed);
                checkUp[0]=false;
            }
            else if (mdp1.getText().equals("")){
                tronc.getChildren().add(passwordWrong);
            }
            else if (!mdp3.getText().equals(mdp1.getText())){
                tronc.getChildren().add(passwordNotSame);
            }
            else if (!bouton1.isSelected() && !bouton2.isSelected() && !bouton3.isSelected()){
                tronc.getChildren().add(genreWrong);
            }
            else if (!condi.isSelected()){
                tronc.getChildren().add(condiWrong);
            }
            else {
                User lui=new User("","","","","","");
                lui.setPrenom(prenom1.getText());
                lui.setNomDeFamille(nomdeFam1.getText());
                lui.setNomUtilisateur(nomUser1.getText());
                lui.setPassword(hash(mdp1.getText()));
                if (bouton1.isSelected()){
                    lui.setGenre("h");
                }
                else if (bouton2.isSelected()){
                    lui.setGenre("f");
                }
                else{
                    lui.setGenre("a");
                }
                lui.setAge(age1.getValueFactory().getValue().toString());

                that[0].add(lui);

                //save fichier
                try {
                    String uneLigne = lui.getPrenom()+","+lui.getNomDeFamille()+","+lui.getNomUtilisateur()+","+lui.getPassword()+","+lui.getGenre()+","+lui.getAge()+"\n";
                    if (file.exists())
                        Files.write(Paths.get("archiveCSV.csv"), uneLigne.getBytes(), StandardOpenOption.APPEND);
                    else
                        Files.write(Paths.get("archiveCSV.csv"), uneLigne.getBytes(), StandardOpenOption.CREATE);
                }catch (Exception e){
                    System.out.println("Dont work write");
                }

                primaryStage.setScene(sc1);
                prenom1.setText("");
                nomdeFam1.setText("");
                nomUser1.setText("");
                mdp1.setText("");
                mdp3.setText("");
                bouton1.setSelected(false);
                bouton2.setSelected(false);
                bouton3.setSelected(false);
                age1.getValueFactory().setValue(18);
                condi.setSelected(false);



            }
        });
        effacer.setOnAction((event) ->{
            prenom1.setText("");
            nomdeFam1.setText("");
            nomUser1.setText("");
            mdp1.setText("");
            mdp3.setText("");
            bouton1.setSelected(false);
            bouton2.setSelected(false);
            bouton3.setSelected(false);
            age1.getValueFactory().setValue(18);
            condi.setSelected(false);
        });
        retour.setOnAction((event) ->{
            primaryStage.setScene(sc1);
            prenom1.setText("");
            nomdeFam1.setText("");
            nomUser1.setText("");
            mdp1.setText("");
            mdp3.setText("");
            bouton1.setSelected(false);
            bouton2.setSelected(false);
            bouton3.setSelected(false);
            age1.getValueFactory().setValue(18);
            condi.setSelected(false);
        });

        //scene3



        //SHOW
        primaryStage.setScene(sc1);
        primaryStage.show();
    }

    public static void load(ArrayList<User> users){
        try {
            List<String> toutesLignes = Files.readAllLines(Paths.get("archiveCSV.csv"));
            String uneLigne;
            for (int i = 0; i<toutesLignes.size(); i++) {
                uneLigne=toutesLignes.get(i);
                String[] division = uneLigne.split(",");
                users.add(new User(division[0],division[1],division[2],division[3],division[4],(division[5])));

            }
        }catch (Exception e){
            System.out.println("Dont work read1");
        }

    }
    public static String hash(String chaine){

        try{
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] encodedhash = digest.digest(
                    chaine.getBytes(StandardCharsets.UTF_8));

            StringBuffer hexString = new StringBuffer();
            for (int i = 0; i < encodedhash.length; i++) {
                String hex = Integer.toHexString(0xff & encodedhash[i]);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
                return hexString.toString();
            }
        }catch (Exception e){
            System.out.println("Dont work hash");
        }
        return null;
    }

}