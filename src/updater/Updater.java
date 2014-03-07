/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package updater;
import java.util.HashMap;
/**
 *
 * @author Bonny
 */
class Dictionary {
    HashMap dictionary = new HashMap<>();
    public void Dictionary(String get, String set)
    {
        dictionary.put(get, set);
    }
    public String ReturnHashMap(String key)
    {
        if(dictionary.containsKey(key)) 
            return dictionary.get(key).toString();
        else 
            return "Non è presente nel dizionario!";
    }
    
}
public class Updater {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dictionary dizionario = new Dictionary();
        dizionario.Dictionary("Prova1","ResProva1");
        dizionario.Dictionary("Prova2","ResProva2");
        dizionario.Dictionary("Prova3","ResProva3");
        dizionario.Dictionary("Prova4","ResProva4");
        dizionario.Dictionary("Prova5","ResProva5");
        String prova = new String();
        prova = "";
        if (args.length > 0) 
            prova = dizionario.ReturnHashMap(args[0]).toString();
        System.out.println(prova);
    }
    
}
