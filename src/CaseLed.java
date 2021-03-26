public class CaseLed extends Case {
    //attribut
        private boolean estAllumée;

        //constructeur
        /**
         * Constructeur par default de la classe case,
         * la valeur estAllumée est automatiquement initialisé
         */
        public CaseLed(){
            this.estAllumée = false;
        }

        /**
         * methode construction de l'objet de type case
         * @param estAllumée correspond à la valeur determine de la case
         */
        public CaseLed(boolean estAllumée) {
            this.estAllumée = estAllumée;
        }

        //getter & setter
        public boolean isEstAllumée() {
            return estAllumée;
        }
        public void setEstAllumée(boolean estAllumée) {
            this.estAllumée = estAllumée;
        }

        //methode perso

        /**
         *Methode permettant de passer une case d'un état a l'autre (allumé/true et eteinte/false)
         */
        public void changeEtat(){
            if(estAllumée){
                estAllumée = false;
            }
            else {
                estAllumée = true;
            }
        }

    @Override
    public String toString() {
        return "CaseLed{" +
                "estAllumée=" + estAllumée +
                '}';
    }
}
