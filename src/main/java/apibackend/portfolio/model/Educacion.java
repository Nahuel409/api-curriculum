package apibackend.portfolio.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;


@Entity
public class Educacion implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idEdu;
    
    private String tituloEdu;
     private String escuelaEdu;
    private String fecha;
    private String descEdu;
   
    
    //Contructores 

    public Educacion() {
    }

    public Educacion(String tituloEdu, String escuelaEdu, String fecha, String descEdu) {
        this.tituloEdu = tituloEdu;
        this.escuelaEdu = escuelaEdu;
        this.fecha = fecha;
        this.descEdu = descEdu;
    }
    
    
     //getter y setters

    public int getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(int idEdu) {
        this.idEdu = idEdu;
    }

    public String getTituloEdu() {
        return tituloEdu;
    }

    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu = tituloEdu;
    }

    public String getEscuelaEdu() {
        return escuelaEdu;
    }

    public void setEscuelaEdu(String escuelaEdu) {
        this.escuelaEdu = escuelaEdu;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescEdu() {
        return descEdu;
    }

    public void setDescEdu(String descEdu) {
        this.descEdu = descEdu;
    }
    
    
    
    
}
