public class PlateauLed extends Plateau{

    /**
     * Constructeur permettant de faire un plateau de taille hauteur*largeur
     * @param hauteur
     * @param largeur
     */
    public PlateauLed(int hauteur, int largeur){
        grille = new CaseLed[hauteur][largeur];
    }


}