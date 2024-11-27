package modificadores_Acesso;

import javax.swing.JOptionPane;

public class Entrada_Camarote {
	
	
	
	private String salaVipp = "001";
	private String salaNormal = "002";
	

private boolean entrada() {
        	
        	JOptionPane.showMessageDialog(null, "Bem-Vindo a Festa Dev");
        	
        	String codigoEntrada = JOptionPane.showInputDialog(null, "Digite Seu Codigo De Entrada");
        	
        	if (codigoEntrada.equals(salaVipp)) {
        		 JOptionPane.showMessageDialog(null, "Acesso permitido à Sala VIP", "Festa", JOptionPane.INFORMATION_MESSAGE);
				return true;
			} else if (salaNormal.equals(salaNormal)) {
				 JOptionPane.showMessageDialog(null, "Acesso permitido à Sala Normal", "Festa", JOptionPane.INFORMATION_MESSAGE);
		            return true;
			} else{
				JOptionPane.showMessageDialog(null, "Acesso negado", "Festa", JOptionPane.ERROR_MESSAGE);
				return false;
			}
        }
        
       public void mostra() {
        	entrada();
        }
}
	

	
	
	

