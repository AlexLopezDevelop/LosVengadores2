import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;
public class LosVengadores2 {
	public static void main(String[] args) throws IOException{
		TreeSet<String> arbol2 = new TreeSet<String>();
		int opcion=1;
		int [][] matrix = new int[4][5];
		int random = 0;
		double suma = 0;
		String [] vengadores = {"Capitan America","Iron Man","Viuda Negra","Thor"};
		String [] habilidades = {"Fuerza","Inteligencia","Velocidad","Intuicion", "Inmortalidad"};
		double [] valor = {0.3,0.3,0.2,0.1,0.1};
		ArrayList<Double> puntos = new ArrayList<Double>();
		for (int i = 0; i < 4; i++){						
			puntos.add(i, 0.0);
		}
		
		while(opcion !=5 ){
			
			System.out.println("Los Vengadores II");
			System.out.println("-------MENU------");
			System.out.println("                 ");
			System.out.println("1-Registrar datos aleatorios");
			System.out.println("2-Evaluar los mas superheroes");
			System.out.println("3-Analizar misiones");
			System.out.println("4-Reponer habilidades");
			System.out.println("5-Salir");
			System.out.println(" ");
			System.out.println("Selecciona una opcion.");
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

			String op = buffer.readLine();
			opcion = Integer.parseInt(op);
			
			if(5<opcion) System.out.println("Opcion no valida");
			
			switch (opcion) {

			case 1:
				System.out.println("Introduce la contraseña:");
				String contra = buffer.readLine();
				int pass = Integer.parseInt(contra);
				if(pass==1234){
				System.out.println(" ");
				System.out.println("Caracteristicas de los vengadores:");
				for (int i = 0; i < matrix.length; i++) {
					for (int j = 0; j < matrix[i].length; j++) {
					matrix[i][j]=(int)(Math.random()*((10-1)-0+1) + 0);
					}
				}
				System.out.println(" ");
				
				for(int i = 0;i<vengadores.length;++i){
					suma = 0;
					System.out.println("Nombre: "+vengadores[i]);
						for(int j = 0;j<habilidades.length;++j){
						System.out.println(habilidades[j]+" : "+matrix[i][j]);
						suma = suma + (matrix[i][j]*valor[j]);
						}puntos.set(i, suma);
						
						System.out.println(" ");
				}

				
				}else;
				
				break;
				
			case 2:
				
				 	arbol2.add(puntos.get(0)+" "+vengadores[0]); 
					arbol2.add(puntos.get(1)+" "+vengadores[1]);  
					arbol2.add(puntos.get(2)+" "+vengadores[2]);
					arbol2.add(puntos.get(3)+" "+vengadores[3]);
					
					
					Iterator<String> it2 = arbol2.iterator();	
					while(it2.hasNext()) 
					System.out.println(it2.next()); 
				
				break;
				
			case 3:
				
				System.out.println("Valor de la mision");
				String mis = buffer.readLine();
				int mision = Integer.parseInt(mis);
				int grande = 0;
				int end = 0;
				double salir = 0;
				int cont = 4;
				int arriesgado=0;
				while(end==0){
				for(int i = 0;i<puntos.size();++i){
					if(puntos.get(i)>0)grande = i;
					if(puntos.get(i)>puntos.get(grande))grande = i;
				}cont--;
				
				System.out.println(puntos.get(grande)+" "+vengadores[grande]);
				salir = salir + puntos.get(grande);
				
				if(salir>mision)end++;
				else puntos.remove(grande);
				if(cont==0)end++;arriesgado++;
				}
				if(arriesgado==1){
					System.out.println("El valor de todos no llega asi que van todos.");
				}
				break;
				
			case 4:
				
					
					System.out.println("------¿Quien eres?------");
					System.out.println(" ");
					System.out.println("0-Capitan America");
					System.out.println("1-Iron Man");
					System.out.println("2-Viuda Negra");
					System.out.println("3-Thor");
					System.out.println(" ");
					System.out.println("Selecciona una opcion.");
					
					String her = buffer.readLine();
					int heroe = Integer.parseInt(her);
					
					System.out.println("------¿Que quieres hacer?------");
					System.out.println(" ");
					System.out.println("1-Mejorar Fuerza");
					System.out.println("2-Mejorar Inteligencia");
					System.out.println("3-Mejorar Velocidad");
					System.out.println("4-Mejorar Intuicion");
					System.out.println("5-Mejorar Inmortalidad");
					System.out.println(" ");
					System.out.println("Selecciona una opcion.");
					
					String mejo = buffer.readLine();
					int mejorar = Integer.parseInt(mejo);
					
					switch (mejorar) {
						case 1:
					
							matrix[heroe][0]=matrix[heroe][0]+1;
							System.out.println("Has aumentado 1 punto de fuerza");
							
							break;
							
						case 2:
							
							System.out.println("Cuanto es 4+4");
							
							String preg = buffer.readLine();
							int pregunta = Integer.parseInt(preg);
							
							if(pregunta==8){
								matrix[heroe][1]=matrix[heroe][1]+1;
								System.out.println("Has aumentado 1 punto en inteligencia");
							}
							else System.out.println("No has aumentado 1 punto en inteligencia");
							
							break;
							
						case 3:
							
							matrix[heroe][2]=matrix[heroe][2]+1;
							System.out.println("Has aumentado 1 punto en velocidad");
						
							break;
							
						case 4:
							
							System.out.println("Que pesa mas un kilo de hierro o un kilo de plumas");
							
							String pregunta2 = buffer.readLine();
							
							if(pregunta2=="igual" || pregunta2=="lo mismo"){
								matrix[heroe][3]=matrix[heroe][3]+1;
								System.out.println("Has aumentado 1 punto en intuicion");
							}else System.out.println("No has aumentado 1 punto en intuicion");
							
							break;
							
						case 5:
							
							System.out.println("No vayas de lsito, cuando te llegue el momento deberas aceptarlo");
							
							break;
					}
				
				break;
				
			case 5:
				
				System.out.println("El mundo sigue a salvo con nosotros, aunque seamosmenos");
				
				break;
				
			}
		}
	}
}