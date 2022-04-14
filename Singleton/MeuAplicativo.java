package Singleton;

public class MeuAplicativo {

	public static void main(String[] args) {
		Janela j = Janela.getInstance();
		j.pack();
		j.setVisible(true);
		System.out.print("Testando Singleton\n");
	}

}
