import java.util.Random;

public class LigthOut {
    //attribut
    private Plateau plateau;
    private Integer tour;

    //constructeur
    public  LigthOut(){

    }
    public LigthOut(int hauteur, int largeur){
    }

    //getter & setter

    //methode perso

    //initialise une grille de jeu vide du plateau

    public void generePlateauVide(){
        PlateauLed pl = new PlateauLed(5,5);
        plateau.toString();
    }

    //allume un nombre precis de led aleatoirement sur le plateau
    public void ledRandom(int nbled){
        Random allume = new Random();
        int led = allume.nextInt(nbled);
        for(int i=0; i<=led;i++){
            System.out.println("*");
        }
    }

    //allume un test de led(pour debug)
    public void ledtest(){

    }

    //choisir une led pour changer l'etat
    public void choisirLed(int y, int x){}
    //changer l'etat d'une led
    public  void changerEtat(int y, int x){
        CaseLed cL = new CaseLed();
        if(cL.isEstAllumée()==true){
            System.out.println("");
        }
        else{
            System.out.println("*");
        }
    }
    //changer l'etat des led voisines
    public void changervoisin(int y, int x){

    }
    //test l'existance des voisin
    public void testVoisin(int y, int x){

    }
    //test si gagner ou non
    //si tte les led sont eteintes
    public boolean isFini(){

        return false;
    }
    //methode qui incremente le tour de jeu (pour obtenir le nb de joueur)
    public void incrementeTour(){
        while(isFini()==true){
            tour++;
        }
    }
    //affichee le jeu(plateau + nb coup joue)
    @Override
    public String toString() {
        return "LigthOut{" +
                "plateau=" + plateau +
                ", tour=" + tour +
                '}';
    }
}
