// ==========================================================================
// Classe Point                                        Application TestPoint5 
// ==========================================================================

public class Point
{
   
// --------------------------------------------------------------------------
// Proprietes
// --------------------------------------------------------------------------
   private int x;
   private int y;
   
   private static int nombrePoints; // "Variable de classe", variable unique à la classe (static)
   
// --------------------------------------------------------------------------
// Constructeurs
// --------------------------------------------------------------------------
   public Point() // méthode avec une majuscule = constructeur, un constructeur n'a pas de type
   {
      nombrePoints++;
   }
   
   public Point(int x, int y) // Ici, x et y sont des variables locales, à ne pas confondre avec le x et y de l'objet courant (private int x)
   {
      this.x = x; // Donc on utilise ici "this" pour différencier le "x" local de celui de la classe (i.e de celui de la variable d'instance)
      this.y = y; // On aurait pu aussi donner un autre nom ex: a = y
      nombrePoints++;
   }
   
// --------------------------------------------------------------------------
// Methodes
// --------------------------------------------------------------------------
   public void setX(int x)
   {
      this.x = x;
   }

   public void setY(int y)
   {
      this.y = y;
   }

   public void afficheXY()
   {
      System.out.println("\nx : " + x + "\ny : " + y);
   }

   public void afficheXY(String titre)
   {
      System.out.print(titre);
      System.out.println("\nx : " + x + "\ny : " + y);
   }

   public static void afficheNombrePoints()
   {
      System.out.println("Nombre de points crees : " + nombrePoints);
   }
}
