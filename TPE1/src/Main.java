
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Waehrung Rubel = new Waehrung("Rubel","RUB",225L);
        
        Waehrung Dollar = new Waehrung("US Dollar","USD",10000L);
        
        Waehrung Yen = new Waehrung("Yen", "Yn", 91L);
        
        System.out.println(Rubel.umrechnen(500,Yen));
        
        
        System.out.println(Rubel.toString(Rubel));
    }

}
