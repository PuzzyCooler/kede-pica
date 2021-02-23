import javax.swing.JOptionPane;
public class kedepica {
	

		public static int lielums(int pica) {
			int lielums=0;
			lielums=Integer.parseInt(JOptionPane.showInputDialog("Picas lielumi = 30cm, 60cm."));
			if(lielums == 60 || lielums==30) {
			JOptionPane.showMessageDialog(null,"Picas lielums ir. "+lielums);
			}
			else{
			JOptionPane.showMessageDialog(null,"Tāds lielums nepastāv. "+lielums);
			}
			pica=lielums;
			return pica;
		}

		public static void main(String[] args) {
			String izvele;
			int pica;
			double pievesana;
			do {
				izvele = JOptionPane.showInputDialog("pica/pilna cena/pievešana/piedevas.");
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

