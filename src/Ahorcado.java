import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
      
       //Clase scanner que nos permite que el usuario escriba
        Scanner scanner = new Scanner(System.in);
       
        //Dalcaración y asignación
        String palabraSecreta = "inetligencia";
        int intentosMaximo = 10;
        int intentos =0;
        boolean palabraAdivinada = false;


        //Arreglo
        char[] letrasAdivinadas = new char[palabraSecreta.length()];


       //Estructura de contraol: Iterativa (Bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas [i] = '_';
            System.out.print(letrasAdivinadas[i]);
            
        }

        //Estructura de contraol: Iterativa (Bucle)

        while (!palabraAdivinada && intentos <intentosMaximo) {
            System.out.println("palabra a divanar: "  +String.valueOf(letrasAdivinadas) + " " + palabraSecreta.length() + "letras" );
            System.out.println("Introduce una letra, por favor");

            //Usamos la palabra sccaner para pedir una letra
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {

                //Estructura de control condicional
                if(palabraSecreta.charAt(i)== letra){
                    letrasAdivinadas[i]= letra;
                    letraCorecta = true;

                }
                
            }

            if(!letraCorecta){
                intentos++;
                System.out.println("¡Incorrecto! te quedad " + (intentosMaximo-intentos) + "intentos.");
            }


            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada= true;
                System.out.println("¡Felicidades, has adivinado la palabra secreta; " + palabraSecreta);
                
            }
            
        }

        if (palabraAdivinada) {
            System.out.println("¡Que pena te has quedo sin intentos! GAME OVER");
            
        }
        scanner.close();


        



    }
}
