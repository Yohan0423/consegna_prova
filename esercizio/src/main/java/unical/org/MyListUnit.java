package unical.org;

import java.util.ArrayList;

public class MyListUnit {
    private ArrayList<Integer> lista;

    public MyListUnit(ArrayList<Integer> list){
        this.lista= list;
    }


    public ArrayList<Integer> riordinaLista(boolean ordine){
        ArrayList<Integer> tempList= this.lista;
        int lunghezza= this.lista.size();
        boolean scambiato;

        for (int i=0; i<lunghezza-1; i++){
            scambiato=false;

            for (int j=0; j<lunghezza-1-i; j++){
                if (tempList.get(j)>tempList.get(j+1)){
                    int temp=tempList.get(j+1);
                    tempList.set(j+1, tempList.get(j));
                    tempList.set(j, temp);
                    scambiato= true;
                }

            }
            if (!scambiato){
                break;
            }
        }


        if (ordine){
            return tempList;
        }
        else{
            ArrayList<Integer> decrescente=new ArrayList<>();
            for (int i=lunghezza-1; i>-1; i--){
                decrescente.add(tempList.get(i));
            }
            return decrescente;
        }


    };

    public int getLenght(){
        return lista.size();
    }
}
