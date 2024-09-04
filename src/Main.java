import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boolean exit = true;
        Scanner consola = new Scanner(System.in);
        ToDoList compras = new ToDoList();


        while (exit){
            System.out.println("||=========||");
            System.out.println("||TODO LIST||");
            System.out.println("||=========||");

            System.out.println("\n\nElija una de las opciones:\n");
            System.out.println("1) Agregar a la lista.\n");
            System.out.println("2) Remover de la lista.\n");
            System.out.println("3) Imprimir la lista.\n");
            System.out.println("4) exit\n");
            int opcion = Integer.parseInt(consola.next());

            switch (opcion){
                case 1:
                    System.out.println(compras.printList());
                    System.out.println("1) Desea agregar un elemento a la lista.");
                    System.out.println("2) Exit");
                    int opcion2 = Integer.parseInt(consola.next());
                    if (opcion2 == 1){
                        System.out.println("Articulo: ");
                        String articulo = consola.next();
                        compras.addToCart(articulo);
                        System.out.println("Articulo agregado\n\n");
                        System.out.println("desea continuar: ");
                        String verif = consola.next();
                        if(verif.equals("si")){
                            break;
                        } else {
                            exit = false;
                            break;
                        }
                    } else {
                        break;
                    }
                case 2:
                    System.out.println("indique el indice del articulo a elminar: ");
                    int opcion3 = Integer.parseInt(consola.next());
                    compras.removeFromCart(opcion3);
                    System.out.println("Articulo " + opcion3 + " removido\n\n");
                    System.out.println("desea continuar: ");
                    String verif2 = consola.next();
                    break;
                case 3:
                    System.out.println("Lista: \n");
                    System.out.println(compras.printList());
                    String verif3 = consola.next();
                    break;

                case 4:
                    exit = false;
                    break;
            }

        }
    }
}