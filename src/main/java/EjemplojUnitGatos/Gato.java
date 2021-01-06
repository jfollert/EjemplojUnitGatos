package EjemplojUnitGatos;

import java.util.Objects;

public class Gato {
	private String nombre;
	private String propietario;
	private String color;
	private boolean genero; // false -> macho && true -> hembra
	private int gatitos;
	private int gatitosAdoptados;
	
	public Gato(String propietario, String color, boolean genero, int gatitos) {
		this.nombre = color;
		this.propietario = propietario;
		this.color = color;
		this.genero = genero;
		this.gatitos = gatitos;
		this.gatitosAdoptados = 0;
	}
	
	public Gato() {
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isGenero() {
		return genero;
	}
	public void setGenero(boolean genero) {
		this.genero = genero;
	}
	public int getGatitos() {
		return gatitos + gatitosAdoptados;
	}
	public void setGatitos(int gatitos) {
		this.gatitos = gatitos;
	}
	
	// Método para adoptar gatitos
	public void addGatitos(int gatitos) {
		if ((this.gatitosAdoptados + gatitos) < 2) {
			gatitosAdoptados += gatitos;
		} else {
			gatitosAdoptados = 2;
		}
	}
	
	// Equal y HashCode sobreescritos para comparar gatos según su color
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return this.color.equals(gato.color);
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.color);
    }
	
}
