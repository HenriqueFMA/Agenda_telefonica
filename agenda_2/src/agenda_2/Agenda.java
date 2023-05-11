package agenda_2;

import java.io.PrintStream;

public class Agenda {
	 String nome;
	 String email;
	 int telefone;
	 int dd;
		public  String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getTelefone() {
			return telefone;
		}
		public void setTelefone(int telefone) {
			this.telefone = telefone;
		}
		public int getDd() {
			return dd;
		}
		public void setDd(int dd) {
			this.dd = dd;
		}
		 
		public   Agenda (String nome,String email,int telefone, int dd) {
			 this.nome= nome;
			 this.email=email;
			 this.telefone=telefone;
			 this.dd=dd;
		
			
		}
		public   Agenda () {
			 this.nome= null;
			 this.email=null;
			 this.telefone=0;
			 this.dd=0;
		
			
		}
		
}
