package freelas;

import java.text.NumberFormat;
import java.util.Locale;

public class FullStack extends freelancers {

	private String Linkedin;
		

	

	public FullStack(int numero, String nome, String celular, int areaAtuacao, float valor, String linkedin) {
		super(numero, nome, celular, areaAtuacao, valor);
		Linkedin = linkedin;
	}




	public String getLinkedin() {
		return Linkedin;
	}




	public void setLinkedin(String linkedin) {
		Linkedin = linkedin;
	}


}