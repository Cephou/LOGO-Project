package src.Model.Tortue;

/**
* La tortue du programme LOGO. Graphique !
*
* @author Patrick Girard
* @version fŽvrier 201
*/
public class TortueG {
    // Position de la tortue
    private int x;
    private int y;
    
    // Direction de la tortue
    private int direction;

    // Mode de la tortue
    private boolean trace;
    // Couleur de la trace
    protected String couleurTrace = "black";

    private void init(){
        x = 0;
        y = 0;
        direction = 3;
        trace = true;
        afficherTortue();
    }

    /**
    * Constructeur
    * Initialise la direction ˆ la valeur 3 (vers le haut), la position en 0,0
    * et la couleur ˆ "black"
    */
    public TortueG() {
        CanvasTortue.reset();
        init();
    }
    
    /**
     * Efface le canvas et rŽinitialise la tortue ˆ sa position de dŽpart
     *
     */
    public void reset() {
        CanvasTortue.reset();
        init();
    }

    /**
     * Accesseur de la direction
     *
     * @return     la valeur de la direction
     */
    public int getDirection() {
        return direction;
    }

    /**
     * MŽthode permettant ˆ la tortue d'avancer dans la direction fixŽe
     * de 0 ˆ 3, de l'Est vers le Nord
     * La mŽthode rŽaffiche la tortue apr�s le mouvement
     * et trace une ligne si elle est en mode trace
     */
    public void avancer() {
        switch(direction) {
            case 0:
                if (trace) CanvasTortue.ecrisHorizontal(x, y, couleurTrace);
                x++;
                break;
            case 1:
                if (trace) CanvasTortue.ecrisVertical(x, y, couleurTrace);
                y++;
                break;
            case 2:
                x--;
                if (trace) CanvasTortue.ecrisHorizontal(x, y, couleurTrace);
                break;
            case 3:
                y--;
                if (trace) CanvasTortue.ecrisVertical(x, y, couleurTrace);
        }
        afficherTortue();
    }

    /**
     * MŽthode permettant de tourner, dans le sens des aiguilles d'une montre
     * La mŽthode rŽaffiche la tortue apr�s le mouvement
     */
    public void tourner() {
        direction++;
        if(direction == 4)
            direction = 0;
        afficherTortue();
    }

    /**
     * MŽthode permettant de tracer ou non
     * Remarque : cette implŽmentation n'est pas correcte : elle ne garantit pas
     * un appel correct des mŽthodes ; on peut appeler deux fois de suite
     * tracer(true) par exemple
     *
     * @param  mode   boolŽen reprŽsentant le mode de trace (vrai ou faux)
     */
    public void tracer(boolean mode) {
        trace = mode;
        afficherTortue();
    }

    /**
     * Accesseur du mode trace/notrace
     *
     * @return le mode trace
     */
    public boolean enTrace() {
        return trace;
    }
    
    /**
     * Affichage de la tortue
     */
    private void afficherTortue() {
        switch(direction) {
            case 0:
                CanvasTortue.tortueEst(x, y);
                break;
            case 1:
                CanvasTortue.tortueSud(x, y);
                break;
            case 2:
                CanvasTortue.tortueOuest(x, y);
                 break;
            case 3:
                CanvasTortue.tortueNord(x, y);
        }
    }
    
    /**
     * Accesseur de la coordonnŽe en X
     *
     * @return x
     */
    public int getX() {
        return x;
    }
    
    /**
     * Accesseur de la coordonnŽe en Y
     *
     * @return y
     */
    public int getY() {
        return y;
    }
    
}
