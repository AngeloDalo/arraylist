import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        //array ridimensionabili
        //accettano solo reference
        ArrayList<String> persone = new ArrayList<String>();
        //ArrayList<Integer> persone = new ArrayList<Integer>();
        //array normali: int[] numeri = new int[3];
        persone.add("Luca");
        persone.add("Marco");
        persone.add("Annna");
        
        System.out.println(persone.get(0));
        for(int i=0; i<persone.size(); i++){
            System.out.println(persone.get(i));
        }

        persone.set(2, "Paola"); //cambaire elemento
        persone.remove(0); //rimuove solo 0
        persone.clear(); //rimuove tutto

        //ArrayList di ArrayList
        ArrayList<ArrayList<String>> classi = new ArrayList<>();
        ArrayList<String> classe1 = new ArrayList<String>();
        classe1.add("Luca");
        classe1.add("Marco");
        ArrayList<String> classe2 = new ArrayList<String>();
        classe2.add("Anna");
        classe2.add("Orazio");
        classi.add(classe1);
        classi.add(classe2);
        for (int i = 0; i<classi.size(); i++){
            System.out.println();
            for (int j=0; j<classi.get(i).size(); j++) {
                System.out.println(classi.get(i).get(j) + " ");
            }
        }
    }
}
