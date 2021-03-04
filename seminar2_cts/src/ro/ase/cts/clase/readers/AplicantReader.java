package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public interface AplicantReader {
	public List<Aplicant> readAplicanti(String numeFisier) throws FileNotFoundException;
}
