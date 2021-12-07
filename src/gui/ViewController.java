package gui;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ViewController {
	@FXML
	private Button btTest1;
	@FXML
	private Button btTest2;
	@FXML
	private TextField txtNome;
	@FXML
	private TextField txtSobrenome;
	
	
	@FXML
	public void onBtTesteAction() {
			
		funcionario conta = new funcionario();
		
		//TextField nome = txtNome;
		conta.setNome(txtNome.getText());
		conta.setSobrenome(txtSobrenome.getText());
		System.out.println("Bem vindo "+conta.getNome()+" "+conta.getSobrenome()+"!");
		
	
	}
	@FXML
	public void onBtTesteActiondoize() {
		/*funcionario conta = new funcionario();
		//TextField nome = txtNome;
		conta.setNome(txtNome.getText());
		conta.setSobrenome(txtSobrenome.getText());
		System.out.println("Bem vindo "+conta.getNome()+" "+conta.getSobrenome()+"!");
		*/
		System.out.println("Cancelado");
	
	}
	
	
}
