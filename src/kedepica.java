import javax.swing.JOptionPane;
public class kedepica {
	

		public static int lielums(int pica) {
			
			return pica;
		}

		public static void main(String[] args) {
			String izvele;
			int pica;
			double pievesana;
			do {
				izvele = JOptionPane.showInputDialog("pica/pilna cena/pievešana/piedevas");
				switch(izvele) {
				case "pica":
				pica=lielums(pica);
				break;
				case "pilna cena":
				pilnacena=cena(pica);
				break;
				case "pievešana":
				pievesana=pievesanasC(pica);
				break;
				case "piedevas":
				piedevas=topings(piedevas);
				break;
				}
				
			}while(!izvele.equals("beigt"));
			
			
			
			
			
		}

	}

