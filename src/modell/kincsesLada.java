
package modell;


public class kincsesLada {
  private boolean kincs;
        private String szin;
       private String szoveg;
   
       public kincsesLada(boolean kincs, String szin, String szoveg){
         this.kincs = kincs;
          this.szin = szin;
          this.szoveg = szoveg;
    }
    
    public String getSzin(){
        return this.szin;
    }
    public String getSzoveg(){
        return this.szoveg;
    }
    public boolean getKincs(){
        return this.kincs;
    }
public void setSzoveg(String ujszoveg){
    this.szoveg = ujszoveg;
}    
public void setSzin(String ujszin){
    this.szin = ujszin;
}
public void setKincs(boolean ujkincs){
    this.kincs = ujkincs;
}
}
