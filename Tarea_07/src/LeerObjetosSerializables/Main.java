package LeerObjetosSerializables;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
	/*Crear un prograja Java que sea capaz de leer objetos en ficheros serializables.*/
	public static void Main(String[] args) {
	Casa miCasa;
	FileInputStream fichero = null;
	ObjectInputStream entrada = null;
	BufferedInputStream bf = null;
		try {
			fichero = new FileInputStream("Casa.txt");
			bf = new BufferedInputStream(fichero);
			entrada = new ObjectInputStream(bf);
			miCasa = (Casa)entrada.readObject();
			
		} catch (IOException e) {
			
		}finally {
            try {
                if (fichero != null) {
                    fichero.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
            }
        }
	}
}
