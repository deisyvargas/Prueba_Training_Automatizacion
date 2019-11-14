import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class PrincipalLCD {

    static final String CADENA_FINAL = "0,0";
    
    public static void main(String[] args) {
    	
    	System.out.print("//ESTE PROGRAMA IMPRIME NÚMEROS EN ESTILO DE UNA PANTALLA LCD// "
    			+ "\n **El número a imprimir y el tamaño del mismo, \n"
    			+ " es ingresado por el usuario.** \n \n");

        // Establece los segmentos de cada numero
        List<String> listaComando = new ArrayList<>();
        String comando;
        int espacioDig;
        

        try {

            try (Scanner lector = new Scanner(System.in)) {
                comando = "1" ; //"un Espacio entre Digitos"
                espacioDig = Integer.parseInt(comando);
                do
                {
                	System.out.print("Por favor ingrese el tamaño del número (entre 1 y 10)\n"
                			+ " y el número a imprimir separados por ',' \n"
                			+ "Si desea terminar con el programa por favor digite 0,0.\n Entrada: ");
                    comando = lector.next();
                    if(!comando.equalsIgnoreCase(CADENA_FINAL))
                    {
                        listaComando.add(comando);
                    }
                }while (!comando.equalsIgnoreCase(CADENA_FINAL)); 
            }

            ImprimirNumerosLCD impresorLCD = new ImprimirNumerosLCD();

            Iterator<String> iterator = listaComando.iterator();
            while (iterator.hasNext()) 
            {
                try 
                {
                    impresorLCD.procesar(iterator.next(), espacioDig);
                } catch (Exception ex) 
                {
                    System.out.println("Error: "+ex.getMessage());
                }
            }
        } catch (Exception ex) 
        {
            System.out.println("Error: "+ex.getMessage());
        }

    }

}

    
        
        
        


  
   

