package ups.edu.ec.modelo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: TarjetaCredito
 *
 */
@Entity

public class TarjetaCredito implements Serializable {

	
	private static final long serialVersionUID = 1L;
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cod;
    private String numero;
    private String nombre;
    @Temporal(TemporalType.DATE)
    private java.util.Calendar fechacadu;
    private String cvv;
    @OneToMany(cascade =CascadeType.ALL,mappedBy ="tarjeta")
    private Set<Pedido>pedidos=new HashSet<Pedido>();
    
    
    
	public TarjetaCredito() {
		super();
	}



	public int getCod() {
		return cod;
	}



	public void setCod(int cod) {
		this.cod = cod;
	}



	public TarjetaCredito(String numero, String nombre,String cvv,Calendar fechacadu) {
		super();
		
		this.numero = numero;
		this.nombre = nombre;
		this.fechacadu = fechacadu;
		this.cvv = cvv;
	
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cod;
		result = prime * result + ((cvv == null) ? 0 : cvv.hashCode());
		result = prime * result + ((fechacadu == null) ? 0 : fechacadu.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((pedidos == null) ? 0 : pedidos.hashCode());
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
		TarjetaCredito other = (TarjetaCredito) obj;
		if (cod != other.cod)
			return false;
		if (cvv == null) {
			if (other.cvv != null)
				return false;
		} else if (!cvv.equals(other.cvv))
			return false;
		if (fechacadu == null) {
			if (other.fechacadu != null)
				return false;
		} else if (!fechacadu.equals(other.fechacadu))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (pedidos == null) {
			if (other.pedidos != null)
				return false;
		} else if (!pedidos.equals(other.pedidos))
			return false;
		return true;
	}



	public String getNumero() {
		return numero;
	}



	public void setNumero(String numero) {
		this.numero = numero;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	

	public java.util.Calendar getFechacadu() {
		return fechacadu;
	}



	public void setFechacadu(java.util.Calendar fechacadu) {
		this.fechacadu = fechacadu;
	}



	public Set<Pedido> getPedidos() {
		return pedidos;
	}



	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}



	public String getCvv() {
		return cvv;
	}



	public void setCvv(String cvv) {
		this.cvv = cvv;
	}


	public void addPedido(Pedido pedido) {
		this.pedidos.add(pedido);
	}

	public void removePedido(Pedido pedido) {
		this.pedidos.remove(pedido);
	}


	@Override
	public String toString() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyy");
		return "TarjetaCredito [cod=" + cod + ", numero=" + numero + ", nombre=" + nombre + ", fechacadu=" + formato.format(fechacadu.getTime())
				+ ", cvv=" + cvv + ", pedidos=" + pedidos + "]";
	}
   
	
	
}
