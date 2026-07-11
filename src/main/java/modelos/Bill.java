package modelos;

public class Bill {
	
	private int idFactura;
	private String usuarioid;
	private double valorFactura;
	private String metodoDePago;
        private Car carrito;
	
	public Bill(int idFactura, String usuarioid, double valorFactura, String metodoDePago, Car carrito) {
		this.idFactura = idFactura;
		this.usuarioid = usuarioid;
		this.valorFactura = valorFactura;
		this.metodoDePago = metodoDePago;
                this.carrito = carrito;
	}

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

        public String getUsuarioid() {
            return usuarioid;
        }

        public void setUsuarioid(String usuarioid) {
            this.usuarioid = usuarioid;
        }


	public double getValorFactura() {
		return valorFactura;
	}

	public void setValorFactura(double valorFactura) {
		this.valorFactura = valorFactura;
	}

	public String getMetodoDePago() {
		return metodoDePago;
	}

	public void setMetodoDePago(String metodoDePago) {
		this.metodoDePago = metodoDePago;
	}

        public Car getCarrito() {
            return carrito;
        }

        public void setCarrito(Car carrito) {
            this.carrito = carrito;
        }         

}
