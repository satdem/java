package Gun37.instansceModifiers.publicModifier.other;

import Gun37.instansceModifiers.publicModifier.same.SearchEngine;

public class EdgeBrowser {
    public static void main(String[] args) {
        //diğer paketteki bu constructor a ulaşabildim,çünkü public
        SearchEngine microSoft=new SearchEngine("explorer");
        microSoft.name="Edge";
        //diğer paketteki bu field e de ulaşabildim.çünkü public

    }

}
