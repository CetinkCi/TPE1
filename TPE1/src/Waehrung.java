
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((kuerzel == null) ? 0 : kuerzel.hashCode());
        result = prime * result + (int) (kurs ^ (kurs >>> 32));
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Waehrung other = (Waehrung) obj;
        if (kuerzel == null) {
            if (other.kuerzel != null)
                return false;
        } else if (!kuerzel.equals(other.kuerzel))
            return false;
        if (kurs != other.kurs)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    
    
}
