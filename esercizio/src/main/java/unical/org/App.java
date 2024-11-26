package unical.org;
import java.util.ArrayList;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {   Scanner scan=new Scanner(System.in);
        System.out.println( "Inserisci una sequenza di numeri, per terminare inserisci -1" );
        boolean fine=false;
        ArrayList<Integer> listaM=new ArrayList();
        while (!fine){

            Integer num= scan.nextInt();
            if (num==-1){
                fine=true;
            }
            else{
                listaM.add(num);
            }

        }
        System.out.println("Vuoi l'array ordinato in modo: 1.crescente; 2.descrescente");
        int ordine=scan.nextInt();
        boolean ordineB=false;
        if (ordine==1){ordineB=true;}
        scan.close();
        MyListUnit Ordinatore= new MyListUnit(listaM);
        ArrayList<Integer> lista= Ordinatore.riordinaLista(ordineB);
        for (int i=0; i<Ordinatore.getLenght(); i++){
            System.out.println(lista.get(i));
        }

    }
}
