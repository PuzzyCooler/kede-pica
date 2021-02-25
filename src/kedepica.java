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
		public static double cena(int pica) {
			double picaC;
			if(pica==60) {
				picaC= 10.99;
				JOptionPane.showMessageDialog(null, "Picas cena ir"+picaC);
			}
			else{
				picaC=5.99;
				JOptionPane.showMessageDialog(null,"Picas cena ir"+picaC);
			}
			return pica;
		}
		public static double topings(double piedevasCena) {
			return piedevasCena;
			
		}

		public static void main(String[] args) {
			String izvele;
			double nauda;
			int pica = 0;
			int lielums=0;
			double piedevasCena = 0;
			
			do {
				izvele = JOptionPane.showInputDialog("pica/pilna cena/pievešana/piedevas.");
				switch(izvele) {
				case "pica":
				pica=lielums(pica);
				break;
				case "pilna cena":
				nauda=cena(pica);
				break;
				case "piedevas":
				piedevasCena=topings(piedevasCena);
				break;
				}
				
			}while(!izvele.equals("beigt"));
		}

	}

