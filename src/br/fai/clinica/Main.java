package br.fai.clinica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();

	}

	private void start() {
		 System.out.println("1. Cadastrar cavalo");
	     System.out.println("2. Cadastrar Girafa");
	     System.out.println("3. Listar cavalos");
	     System.out.println("4. listar girafas");
	     System.out.println("5. listar todos os animais");
	     System.out.println("6. Remover animal por ID");
	     System.out.println("7. Exibir quantidade por tipo");
	     System.out.println("8. Sair");
	     System.out.println("Opcao:");
	     
	     int opcao;
	        Scanner entrada = new Scanner(System.in);
	        
	        do {
	            opcao = entrada.nextInt();
	            
	            switch(opcao){
	            case 1:
	                cadastrarCavalo();
	                break;
	                
	            case 2:
	                cadastrarGirafa();
	                break;
	                
	            case 3:
	                listarCavalos();
	                break;
	                
	            case 4:
	                listarGirafas();
	                break;
	                
	            case 5:
	            	listarAnimais();
	            	break;
	            	
	            case 6:
	            	removerPorId();
	            	break;
	            	
	            case 7:
	            	quantidadeTipo();
	            	break;
	            
	            default:
	                System.out.println("Opção inválida.");
	            }
	        } while(opcao != 8);
	    }
	     
	
	
	public void cadastrarCavalo() {
		
	}
	
	public void cadastrarGirafa() {
		
	}
	
    public void listarCavalos() {
		
	}
    
    public void listarGirafas() {
		
	}
    
    public void listarAnimais() {
		
	}
    
    public void removerPorId() {
		
	}
    
    public void quantidadeTipo() {
		
	}

}
