package agenda_2;
import java.util.Scanner; 

public class pincipal {
	
		public static Agenda adicionar(Agenda agenda[]) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite o nome do contato: ");
			String nome = sc.nextLine();
			System.out.println("Digite o e-mail: ");
			String email = sc.nextLine();
			System.out.println("Digite o DD do telefone: ");
			int dd = sc.nextInt();
			System.out.println("Digite o número do telefone: ");
			int telefone = sc.nextInt();
			
			Agenda preencher = new Agenda(nome, email, telefone, dd);
			return preencher; 
		}
		
		public static Agenda remover(Agenda contato) {
			Agenda apagar = new Agenda();
			return apagar;
		}
		
		public static int busca(Agenda agenda[]) {
		    Scanner sc = new Scanner(System.in);
		    int x = 101;

		    System.out.println("Digite o nome do contato que deseja buscar");
		    String buscaNome = sc.nextLine();

		    for (int i = 0; i < 100; i++) {
		        if (agenda[i] != null && buscaNome.equalsIgnoreCase(agenda[i].nome)) {
		            System.out.println("Nome: " + agenda[i].nome);
		            System.out.println("E-mail: " + agenda[i].email);
		            
		            System.out.println("Telefone: ("+agenda[i].dd+")" + agenda[i].telefone);
		            x = i;
		            break;
		        }
		    }

		    if (x == 101) {
		        System.out.println("Contato não encontrado");
		    }

		    return x;
		}
		
		public static int menu() {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("--------------------------------------------------------------");
			System.out.println("Escolha a letra que melhor corresponde à ação que deseja executar:");
			System.out.println("1 -> Adicionar novo contato.");
			System.out.println("2 -> Remover contato.");
			System.out.println("3 -> Buscar um contato e exibir.");
			System.out.println("4 -> Mostrar a lista completa.");
			System.out.println("5 -> Encerrar programa.");
			System.out.println("--------------------------------------------------------------");
		    
		    int opcao = sc.nextInt();
			return opcao;
		}    
	    
		public static boolean verificarContatoNaoPreenchido(Agenda agenda[]) {
		    for (Agenda contato : agenda) {
		        if (contato == null || contato.nome.equals("")) {
		            return true;
		        }
		    }
		    return false; 
		}
		public static void mostrarTodos(Agenda agenda[]) {
				System.out.println("------------------------");
			    System.out.println("Lista de contatos:");
			    System.out.println("------------------------");
			    for (Agenda contato : agenda) {
			        if (contato != null && !contato.nome.equals("")) {
			            System.out.println("Nome: " + contato.nome);
			            System.out.println("E-mail: " + contato.email);
			            System.out.println("Telefone: (" + contato.dd + ") " + contato.telefone);
			            System.out.println("------------------------");
			        }
			    }
		}
		
		
		
		
		public static void main(String[] args) {
			Agenda contato[] = new Agenda[100];
			int op = menu();
			int i = 0;
			
			do {
				switch (op) {
					case 1:
					    if (verificarContatoNaoPreenchido(contato)) {
					        contato[i] = adicionar(contato);
					        System.out.println("Adicionado com sucesso");
					    } else {
					        System.out.println("A agenda está cheia. Não é possível adicionar mais contatos.");
					    }
					    break;

					case 2:
					    int x = busca(contato);
					    if (x != 101) {
					        remover(contato[x]);
					        System.out.println("Contato removido com sucesso");
					    }
					    break;

					case 3:
						busca(contato);
						break;
					case 4:
					    mostrarTodos(contato);
					    break;

				}
				i++;
				op = menu();
			} while (op != 5);
			}
		}

	

