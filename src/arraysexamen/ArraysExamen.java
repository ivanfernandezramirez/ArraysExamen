/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysexamen;

/**
 *
 * @author ivan
 */
import java.util.Scanner;
public class ArraysExamen {
    
    public static void inicializar(int v[]){
    Scanner introducir=new Scanner(System.in);
    
    int talla;
    talla=v.length;
  
    int x;
    for(x=0;x<talla;x++){
    System.out.print("Introduce el "+(x+1)+" valor: ");
    v[x]=introducir.nextInt(); 
    }
    }
    
    public static void mostrar(int v[]){
   
    int x, talla;
    talla=v.length;   
    
    for(x=0;x<talla-1;x++){
		System.out.print(v[x]+", ");
	}
	System.out.print(v[x]+".");
    }
    
    public static int maximo(int v[]){
   
    int x, max=v[0];
    for (x=1;x<v.length;x++){
        if (max<v[x]){
            max=v[x];
        }
    }
    return max;
    }
  
    public static int minimo(int v[]){
   
    int x, min=v[0];
    for (x=1;x<v.length-1;x++){
        if (min>v[x]){
            min=v[x];
        }
    }
    return min;
    }
    
    public static double media(int v[]){
    
    int x;
    double suma=v[0], media;
    
    for(x=1;x<v.length;x++){
        suma=suma+v[x];
    }
    media=suma/v.length;
    return media;
    }
   
    public static boolean iguales(int v1[], int v2[]){
   
    int cont=0;
    for(int x=0;x<v1.length;x++){
    if(v1[x]!=v2[x]) 
    cont++;
    }
    if(cont==0){
        return true;
    }else{ 
        return false;
     }
    }
    
    public static boolean palindromo(int v[]){
    int x=v.length-1, mit=x/2, y;
    for(y=0;y<mit;y++){
        x=x-y;
        if (v[y]!=v[x]) break;
    } 
    if(y==mit){
        return true;
    }else{
        return false;
    }
    }
    
    public static void ordenar(int v[]){
   
    int x=0, y=0, z, aux, talla=v.length;
    talla=v.length;
    
    for (y=0;y<v.length;y++){
        for (x=0;x<v.length;x++){
            if(v[x]>v[y]){
                aux=v[y];
                v[y]=v[x];
                v[x]=aux;
            }
        }
    }
    for(y=0;y<talla-1;y++){
		System.out.print(v[y]+", ");
	}
	System.out.print(v[y]+".");
    }
    
    public static int[] copiar(int v[]){
	
	int talla, x;
    talla=v.length;
	
	int xector[]= new int[talla];
	for (x=0;x<talla;x++){
		xector[x]=v[x];
	}
	return xector;
	}

    
    public static void main(String[] args) {
    Scanner introducir=new Scanner(System.in);
    
    int v, numaxim, numin, ord[], opcion;
    double medi;
  
    System.out.print("Introduce la longitud del primer vector: ");
    v=introducir.nextInt();
    int vector[]= new int[v];
    
    inicializar(vector);
    
    System.out.print("Los valores del array son: ");
    mostrar(vector);
    System.out.println(" ");
    
		do{
			System.out.println(" ");
    
			System.out.println("Elige una opción del menú:");
			System.out.println("1 - Máximo");
			System.out.println("2 - Minimo");
			System.out.println("3 - Media");
			System.out.println("4 - Iguales");
			System.out.println("5 - Palíndromo");
			System.out.println("6 - Ordenar");
			System.out.println("7 - Copiar");
			System.out.println("8 - Salir");
			opcion=introducir.nextInt();
    
			switch(opcion){
    
				case 1:
				numaxim=maximo(vector);
				System.out.println("El número máximo es: "+numaxim);
				break;
    
				case 2:
				numin=minimo(vector);
				System.out.println("El número minimo es: "+numin);
				break;
			
				case 3:
				medi=media(vector);
				System.out.println("La media es: "+medi);
				break;
			
				case 4:
				int wector[]= new int[v];
				System.out.println("Introduce la longitud del segundo vector: ");
				inicializar(wector);
				if (iguales(vector,wector)){
					System.out.print("Los vectores son iguales. \n");   
				}else{
					System.out.print("Los vectores no son iguales. \n");
				}
				break;
   
				case 5:
				if(palindromo(vector)){
					System.out.println("Es palindromo");
				}else{
					System.out.println("No es palindromo");
				}
				break;
			
				case 6:
				System.out.print("Numeros ordenados: ");
				ordenar(vector);
				System.out.println(" ");
				break;
			
				case 7:
				int[] hector= new int [vector.length];
				hector=copiar(vector);
				System.out.print("Los valores del array son: ");
				mostrar(hector);
				break;
			}
		}while(opcion<8);{
				System.out.println("HASTA LUEGO COCODRILO!");
			}
	}
}
    