package ar.edu.cecntro8.desarrollo.proyetoRestaurante.proyectoRestaurante.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private String telefono;
    private String direccion;

    // Getters y setters

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Pedido> pedidos;

    public Cliente() {}

    public Cliente(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
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


