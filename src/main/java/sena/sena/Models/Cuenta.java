package sena.sena.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="cuenta")
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="numerocita", length=50, nullable = false)
    @NotEmpty
    private String numerocita;
    @Column(name="titular", length=100, nullable = false)
    @NotEmpty
    private String titular;
    @Column(name="saldo", length=50, nullable = false)
    @NotEmpty
    private double saldo;
    @Column(name="fechaapertura", length=100, nullable = false)
    @NotEmpty
    private String fechaapertura;
    @Column(name="estado" ,length=1)
    private String estado;


    public Cuenta() {
    }

    public Cuenta(Integer id, @NotEmpty String numerocita, @NotEmpty String titular, @NotEmpty double saldo,
            @NotEmpty String fechaapertura, String estado) {
        this.id = id;
        this.numerocita = numerocita;
        this.titular = titular;
        this.saldo = saldo;
        this.fechaapertura = fechaapertura;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumerocita() {
        return numerocita;
    }

    public void setNumerocita(String numerocita) {
        this.numerocita = numerocita;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getFechaapertura() {
        return fechaapertura;
    }

    public void setFechaapertura(String fechaapertura) {
        this.fechaapertura = fechaapertura;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}