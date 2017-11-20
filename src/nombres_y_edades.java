import java.util.Scanner;

public class nombres_y_edades 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner (System.in);
		String [] nombres = new String[5];
		int [] edades = new int[5];
		int i;
		
		// Se cargan los nombres y las edades
		for(i=0; i<nombres.length; i++)
		{
			System.out.println("Ingrese nombre:");
			nombres[i]=teclado.next();
			System.out.println("Ingrese edad:");
			edades[i]=teclado.nextInt();			
		}
		
		// Se muestren los mayores de edad
		System.out.println("Personas mayores de edad:");
		for(i=0;i<nombres.length;i++)
		{
			if(edades[i]>=18)
				System.out.println(nombres[i]);
		}
		
		teclado.close();
		
	}
	
}
