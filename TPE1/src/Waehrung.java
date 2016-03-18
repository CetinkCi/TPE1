
public class Waehrung {

    private String name;
    private String kuerzel;
    private long kurs;
    public long neuBetrag;
    public String info;
    public String kurs1;
 
    
    public Waehrung(String name, String kuerzel, long kurs){
        this.name=name;
        this.kuerzel=kuerzel;
        this.kurs=kurs;
    }
    
    public String getKuerzel(){
        return kuerzel;
    }
    
    public String getName(){
        return name;
    }
    
    public long getKurs(){
        return kurs;
    } 
    
    public long umrechnen(long betrag, long zielWaehrung){
        
        
        return neuBetrag;
    } 
    
    public String toString(Waehrung name){
        
        kurs1=String.format("%.4f",getKurs()/10000.0);
        
        info=getName()+" "+"["+ getKuerzel() + "] 1$ = " + kurs1 + getKuerzel();
        
        return info;
    }
}
