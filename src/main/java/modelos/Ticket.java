package modelos;

public class Ticket {
	
	private int numEntrada;
	private int precioEntrada;
	private Hall sala;
        
        private String movieTituloCompra;
        
        private String movieIdCompra;
	
	public Ticket(int numEntrada, int precioEntrada, Hall sala) {
		this.numEntrada = numEntrada;
		this.precioEntrada = precioEntrada;
		this.sala = sala;
	}

	public int getNumEntrada() {
		return numEntrada;
	}

	public void setNumEntrada(int numEntrada) {
		this.numEntrada = numEntrada;
	}

	public int getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(int precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

	public Hall getSala() {
		return sala;
	}

	public void setSala(Hall sala) {
		this.sala = sala;
	}

        public String getMovieTituloCompra() {
            return movieTituloCompra;
        }

        public void setMovieTituloCompra(String movieTituloCompra) {
            this.movieTituloCompra = movieTituloCompra;
        }

        public String getMovieIdCompra() {
            return movieIdCompra;
        }

        public void setMovieIdCompra(String movieIdCompra) {
            this.movieIdCompra = movieIdCompra;
        }
        
        

}
