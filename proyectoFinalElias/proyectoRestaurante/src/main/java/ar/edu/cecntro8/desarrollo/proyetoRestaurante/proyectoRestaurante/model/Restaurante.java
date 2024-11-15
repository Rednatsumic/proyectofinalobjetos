package ar.edu.cecntro8.desarrollo.proyetoRestaurante.proyectoRestaurante.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Restaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private String direccion;
    private String telefono;

    // Getters y setters

    @OneToMany(mappedBy = "restaurante", cascade = CascadeType.ALL)
    private List<Pedido> pedidos;

    public Restaurante() {}

    public Restaurante(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Getter para la relación pedidos
    public List<Pedido> getPedidos() {
        return pedidos;
    }

    // Setter para la relación pedidos
    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}