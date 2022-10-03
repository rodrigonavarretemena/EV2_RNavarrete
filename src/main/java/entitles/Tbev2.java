/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entitles;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author rodri
 */
@Entity
@Table(name = "TB_EV2")
@NamedQueries({
    @NamedQuery(name = "Tbev2.findAll", query = "SELECT t FROM Tbev2 t"),
    @NamedQuery(name = "Tbev2.findById", query = "SELECT t FROM Tbev2 t WHERE t.id = :id"),
    @NamedQuery(name = "Tbev2.findByNombre", query = "SELECT t FROM Tbev2 t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tbev2.findByEdad", query = "SELECT t FROM Tbev2 t WHERE t.edad = :edad"),
    @NamedQuery(name = "Tbev2.findByDireccion", query = "SELECT t FROM Tbev2 t WHERE t.direccion = :direccion"),
    @NamedQuery(name = "Tbev2.findByCorreo", query = "SELECT t FROM Tbev2 t WHERE t.correo = :correo"),
    @NamedQuery(name = "Tbev2.findByFono", query = "SELECT t FROM Tbev2 t WHERE t.fono = :fono")})
public class Tbev2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "edad")
    private Integer edad;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "correo")
    private String correo;
    @Column(name = "fono")
    private Integer fono;

    public Tbev2() {
    }

    public Tbev2(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getFono() {
        return fono;
    }

    public void setFono(Integer fono) {
        this.fono = fono;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbev2)) {
            return false;
        }
        Tbev2 other = (Tbev2) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitles.Tbev2[ id=" + id + " ]";
    }

    public static class java {

        public java() {
        }
    }
    
}
