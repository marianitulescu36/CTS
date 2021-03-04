package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.readers.*;
import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

public class Program {
 
	public static List<Aplicant> citesteAplicanti(String numeFisier, AplicantReader reader) throws FileNotFoundException {
		return reader.readAplicanti(numeFisier);
	}
	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			listaAngajati = citesteAplicanti("angajati.txt", new AngajatReader());
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}