package pregunta6;
import java.util.Scanner;
public class Maxproduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner teclado = new Scanner(System.in);
				int c = 0;
				System.out.println("Ingrese la dimensión del conjunto de numeros");
				c = teclado.nextInt();
				int valores[] = new int[c];
				int nuevo[] = new int[valores.length- 3];
				System.out.println("Ingrese los valores del conjunto");
				for (int i = 0; i < valores.length; i++) {
					valores[i] = teclado.nextInt();
				}
				for (int i = 0; i < valores.length -3; i++) {
					nuevo[i]= valores[i] * valores[i + 1] * valores[i + 2] * valores[i + 3];      
				}
				int max=nuevo[0];
				int m=0;
				for(int i=0; i < valores.length-3;i++) {
				  if(max<nuevo[i]) {
					max=nuevo[i];
					m=i;
				  }
				}		
				System.out.print("El maximo producto es:");
				System.out.print(valores[m] + "," + valores[m+1]+"," + valores[m+2]+"," + valores[m+3]);
			}
	}

