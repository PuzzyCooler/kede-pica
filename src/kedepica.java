import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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
			double cena;
			if(pica==60) {
				cena= 10.99;
				JOptionPane.showMessageDialog(null, "Picas cena ir"+cena);
				
			}
			else{
				cena=5.99;
				JOptionPane.showMessageDialog(null,"Picas cena ir"+cena);
			}
			return cena;
		}
		public static int persona(int pica) {
			try {
			String vards=JOptionPane.showInputDialog("Personu sauc: ");
			String adrese=JOptionPane.showInputDialog("Adrese: ");
			int tel=Integer.parseInt(JOptionPane.showInputDialog("Talrunis: "));
				FileWriter fw=new FileWriter("klients.txt");
				PrintWriter print=new PrintWriter(fw);
				print.println("Klienta vards-"+vards);
				print.println("Klienta adrese-"+adrese);
				print.println("Klienta talrunis-"+tel);
				JOptionPane.showMessageDialog(null, "Saglabāts!");
				print.close();
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, "kļuda");
			}
			return pica;
		}
		public static int saglabat(double cena, int pica) {
			int picaLiel=pica;
			
			try {
				FileWriter fw=new FileWriter("pica.txt");
				PrintWriter print=new PrintWriter(fw);
				print.println("picas cena: "+cena);
				print.println("Picas lielums: "+pica);
				print.close();
			}catch (IOException e) {
				JOptionPane.showMessageDialog(null, "kļuda");
			}
			return 0;
		}

		public static void main(String[] args) {
			String izvele;
			double picaC=0, cena = 0;
			int pica = 0;
			int lielums=0;
			do {
				izvele = JOptionPane.showInputDialog("pica/pilna cena/klients/saglabat.");
				switch(izvele) {
				case "pica":
				pica=lielums(pica);
				break;
				case "pilna cena":
				cena=cena(pica);
				break;
				case "saglabat":
					saglabat(pica, (int) cena);
					break;
				case "klients":
					persona(pica);
					break;
				}
				
			}while(!izvele.equals("beigt"));
		}

	}

