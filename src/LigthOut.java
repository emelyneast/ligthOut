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
    }

    //allume un nombre precis de led aleatoirement sur le plateau
    public void ledRandom(int nbled){
    }

    //allume un test de led(pour debug)
    public void ledtest(){
    }

    //choisir une led pour changer l'etat
    public void choisirLed(int y, int x){}
    //changer l'etat d'une led
    public  void changerEtat(int y, int x){}
    //changer l'etat des led voisines
    public void changervoisin(int y, int x){}
    //test l'existance des voisin
    public void testVoisin(int y, int x){}
    //test si gagner ou non
    //si tte les led sont eteintes
    public boolean isFini(){
        return false;
    }
    //methode qui incremente le tour de jeu (pour obtenir de joue)
    public void incrementeTour(){

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
