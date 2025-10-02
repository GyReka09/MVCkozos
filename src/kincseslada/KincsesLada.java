
package kincseslada;
import modell.kincsesLada;


public class KincsesLada {
       private kincsesLada elso;
    private kincsesLada masodik;
    private kincsesLada harmadik;
    
public KincsesLada(){
    kincsesLada elso =  new kincsesLada(true, "ezüst", "nem bennem van a kincs");
    kincsesLada masodik = new kincsesLada(false, "arany", "bennem van a kincs");
    kincsesLada harmadik = new kincsesLada(false, "bronz", "az arany hazudik");
}
    public kincsesLada getElso() {
        return elso;
    }

    public kincsesLada getMasodik() {
        return masodik;
    }

    public kincsesLada getHarmadik() {
        return harmadik;
    }
}
