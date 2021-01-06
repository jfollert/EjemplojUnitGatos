package EjemplojUnitGatos;

import static org.junit.Assert.*;
import org.junit.Test;

public class GatoTest {

	@Test
	public void testCreacionGato() {
		// Given
		Gato gato;
		// When
		gato = new Gato();
		// Then
		assertNotNull(gato);
	}
	
	@Test
	public void testAsignarPropietarioDelGato() {
		// Given
		Gato gato = new Gato();
		String nombrePropietario = "Schrödinger";
		// When
		gato.setPropietario(nombrePropietario);
		// Then
		assertNotNull(gato.getPropietario());
	}
	
	@Test
	public void testObtenerColorDelGato() {
		// Given
		String colorAsignado = "blanco";
		Gato gato = new Gato();
		gato.setColor(colorAsignado);
		// When
		String colorObtenido = gato.getColor();
		// Then
		assertEquals(colorAsignado, colorObtenido);
	}
	
	@Test
	public void testObtenerCantidadGatitos() {
		// Given
		int cantGatitosAsignado = 4;
		Gato gato = new Gato();
		gato.setGatitos(cantGatitosAsignado);
		// When
		int cantGatitosObtenida = gato.getGatitos();
		// Then
		assertEquals(cantGatitosAsignado, cantGatitosObtenida);
	}
	
	@Test
	public void testCompararGatosPorColor() {
		// Given
		String colorGatos = "Negro";
		Gato gatoNegro1 = new Gato();
		Gato gatoNegro2 = new Gato();
		// When
		gatoNegro1.setColor(colorGatos);
		gatoNegro2.setColor(colorGatos);
		// Then
		assertEquals(gatoNegro1, gatoNegro2);
	}
	
	@Test
	public void testAdoptarGatitosCasoValido() {
		// Given
		Gato gato = new Gato();
		int cantGatitosPrevia = 4;
		gato.setGatitos(cantGatitosPrevia);
		// When
		int cantGatitosAdoptar = 2;
		gato.addGatitos(cantGatitosAdoptar);
		// Then
		int cantTotalGatitosEsperada = cantGatitosPrevia + cantGatitosAdoptar;
		int cantGatosObtenida = gato.getGatitos();
		assertEquals(cantTotalGatitosEsperada, cantGatosObtenida);
	}
	
	@Test
	public void testAdoptarGatitosCasoNoValido() {
		// Given
		Gato gato = new Gato();
		int cantGatitosPrevia = 4;
		gato.setGatitos(cantGatitosPrevia);
		// When
		int cantGatitosAdoptar = 4;
		gato.addGatitos(cantGatitosAdoptar);
		// Then
		int cantTotalGatitosEsperada = cantGatitosPrevia + 2;
		int cantGatosObtenida = gato.getGatitos();
		assertEquals(cantTotalGatitosEsperada, cantGatosObtenida);
	}
	
	

}
