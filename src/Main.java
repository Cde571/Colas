import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int elemento;
        char opc;
        Scanner lector = new Scanner(System.in);
        ColaEnVector objColaVector = new ColaEnVector(5);
        do {

            opc = menuManejoCola();
            switch (opc) {
                case '1':
                    if ((objColaVector.colaLlena())) {
                        System.out.println("------->Cola Llena");
                    } else {
                        System.out.println("------->Ingrese dato a encolar: ");
                        elemento = lector.nextInt();
                        objColaVector.encolar(elemento);
                    }
                    break;
                case '2':
                    if (objColaVector.colaVacia()) {
                        System.out.println("------->Cola vacia");

                    } else {
                        System.out.println("\n-----> Dato retirado: " + objColaVector.desencolar());
                    }
                    break;
                case '3':
                    if (objColaVector.colaVacia()) {
                        System.out.println("\n------>Cola Vacia");
                    } else {
                        System.out.println("\n----->");
                        elemento = objColaVector.mostrarCola();
                        while (elemento!=-1)
                        {
                            System.out.println(elemento+" ");
                            elemento=objColaVector.mostrarCola();
                        }
                    }
                    break;

                    case '4':
                        System.out.println("\n-----Eligio Salir...");
                        break;
                    default:
                        break;

                }


            }
            while(opc!='4');
            System.out.println();
        }
        static char menuManejoCola()
        {
            char opcion;
            Scanner lector =new Scanner(System.in);
            System.out.print("\n\t********MENU DE OPCIONES***********");
            System.out.print("\n\t 1- Encolar ");
            System.out.print("\n\t 2- Desencolar ");
            System.out.print("\n\t 3- Mostrar Cola ");
            System.out.print("\n\t 4- Salir ");
            do {
                System.out.println("\n\t Ingrese Opcion: ");
                opcion = lector.next().charAt(0);
            }
            while (opcion < '1' || opcion >'4');
            return opcion;

        }
    }

