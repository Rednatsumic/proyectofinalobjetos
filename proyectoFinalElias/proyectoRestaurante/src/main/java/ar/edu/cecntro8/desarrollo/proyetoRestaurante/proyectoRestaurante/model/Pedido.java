package ar.edu.cecntro8.desarrollo.proyetoRestaurante.proyectoRestaurante.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String pedido;
    private LocalDate fecha;
    private BigDecimal total;

    // Getters y setters

    @ManyToOne
    @JoinColumn(name = "restaurante_id")
    private Restaurante restaurante;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    public Pedido() {}

    public Pedido(String pedido, LocalDate fecha, BigDecimal total) {
        this.pedido = pedido;
        this.fecha = fecha;
        this.total = total;
    }

    // Getter y setter para restaurante
    public Restaurante getRestaurante() { return restaurante; }
    public void setRestaurante(Restaurante restaurante) { this.restaurante = restaurante; }

    // Getter y setter para cliente
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
}