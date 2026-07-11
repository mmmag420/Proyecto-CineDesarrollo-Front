package modelos;

public class Hall {
    
	public enum Dia {
	    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
	}
	
	private int numSala;
	private Movie movie;
	private Dia diaPelicula;
	private String horaInicio;
	private String horaFin;
	private Chair[] sillas;
	
	public Hall(int numSala, Movie movie, Dia diaPelicula, String horaInicio, String horaFin, Chair[] sillas) {
		this.numSala = numSala;
		this.movie = movie;
		this.diaPelicula = diaPelicula;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.sillas = sillas;
	}

	public int getNumSala() {
		return numSala;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

        public Dia getDiaPelicula() {
            return diaPelicula;
        }

        public void setDiaPelicula(Dia diaPelicula) {
            this.diaPelicula = diaPelicula;
        }

        public String getHoraInicio() {
            return horaInicio;
        }

        public void setHoraInicio(String horaInicio) {
            this.horaInicio = horaInicio;
        }

        public String getHoraFin() {
            return horaFin;
        }

        public void setHoraFin(String horaFin) {
            this.horaFin = horaFin;
        }

	public Chair[] getSillas() {
		return sillas;
	}

	public void setSillas(Chair[] sillas) {
		this.sillas = sillas;
	}
	

}
