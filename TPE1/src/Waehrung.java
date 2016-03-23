
public class Waehrung {

    private String name;
    private String kuerzel;
    private long kurs;

 
    
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
    
    public long umrechnen(long betrag, Waehrung zielWaehrung){
        long dollar = (betrag * getKurs());   
        return (dollar / zielWaehrung.kurs);
    } 
    
    public String toString(Waehrung name){
        
        String kurs1=String.format("%.4f",getKurs()/10000.0);
        
        String info=getName()+" "+"["+ getKuerzel() + "] 1$ = " + kurs1 + getKuerzel();
        
        return info;
    }
    
    
}
