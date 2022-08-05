package sena.sena.Models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="cliente", uniqueConstraints = @UniqueConstraint(columnNames = "cedulacliente"))
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcliente;
    
    @Column(name = "cedulacliente", length=50, nullable = false)
    @NotEmpty
    private String cedulacliente;

    @Column(name = "nombre", length = 50, nullable = false)
    @NotEmpty
    private String nombre;

    @Column(name = "telefono", length = 50, nullable = false)
    private Double telefono;

    
    public Cliente(Integer idcliente, @NotEmpty String cedulacliente, @NotEmpty String nombre,
            @NotEmpty Double telefono) {
        this.idcliente = idcliente;
        this.cedulacliente = cedulacliente;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Cliente(){}
    
    public String getCedulacliente() {
        return cedulacliente;
    }
    public void setCedulacliente(String cedulacliente) {
        this.cedulacliente = cedulacliente;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Double getTelefono() {
        return telefono;
    }
    public void setTelefono(Double telefono) {
        this.telefono = telefono;
    }
    public Integer getIdcliente() {
        return idcliente;
    }
    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }
    
    
    
}
