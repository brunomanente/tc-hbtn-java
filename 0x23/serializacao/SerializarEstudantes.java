import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class SerializarEstudantes<T> {
	private String nomeArquivo;

	public SerializarEstudantes(String nomeArquivo) {
		super();
		this.nomeArquivo = nomeArquivo;
	}
	public SerializarEstudantes() {
		
	}

	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	
	
	
	public void serializar(List<Estudante> estudantes) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(nomeArquivo);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(estudantes);
		}
		catch(FileNotFoundException e) {
			System.out.println("Nao foi possivel serializar");
		}catch (IOException e) {
			System.out.println("Nao foi possivel serializar");
		} finally {
			if (oos != null) {
				try {
					oos.close();
				}catch (IOException e) {
					System.out.println("Nao foi possivel serializar");
				}
			}
		}
		
	}
	public List<Estudante> desserializar() {
		
		List<Estudante> leitura = null;		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(nomeArquivo);
			ois = new ObjectInputStream(fis);
			try {
				leitura = (List<Estudante>) ois.readObject();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		}catch(FileNotFoundException e) {
			System.out.println("Nao foi possivel desserializar");
		}catch(IOException e) {
			System.out.println("Nao foi possivel desserializar");
		} finally {
			if (ois != null) {
				try {
					ois.close();
				}catch(IOException e) {
					System.out.println("Nao foi possivel desserializar");
				}
			}
		}
		return leitura;
	}
	
	
}
