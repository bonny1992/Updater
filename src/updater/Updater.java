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
        /*
        Here it goes your dictionary declaration.
        Usage:
        dizionario.Dictionary("Test_1","Result_Test_1");
        dizionario.Dictionary("Test_2","Result_Test_2");
        dizionario.Dictionary("Test_3","Result_Test_3");
        dizionario.Dictionary("Test_4","Result_Test_4");
        dizionario.Dictionary("Test_5","Result_Test_5");
        */
        
        dizionario.Dictionary("Test_1","Result_Test_1"); //
        dizionario.Dictionary("Test_2","Result_Test_2"); //
        dizionario.Dictionary("Test_3","Result_Test_3"); // There are for testing purposes
        dizionario.Dictionary("Test_4","Result_Test_4"); //
        dizionario.Dictionary("Test_5","Result_Test_5"); //
        
        String prova = new String();
        prova = "";
        if (args.length > 0) 
            prova = dizionario.ReturnHashMap(args[0]).toString();
        System.out.println(prova);
    }
    
}
