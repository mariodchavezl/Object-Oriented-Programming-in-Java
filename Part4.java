
/**
 * Write a description of Part3 here.
 * 
 * @Mario D. Chávez 
 * @3.12.2020
 */
import edu.duke.*;
public class Part4 {
    public void printUrls(String url){
        URLResource link = new URLResource(url);
        for(String word: link.words()) {
            if(word.toLowerCase().indexOf("youtube.com") != -1) {
                int youIndex = word.indexOf("\"");
                int lastYouIndex = word.indexOf("\"",youIndex + 1);
                System.out.println(word.substring(youIndex + 1, lastYouIndex));
            }
        }
    }
    
    public void testUrl(){
        printUrls("http://www.dukelearntoprogram.com/course2/data/manylinks.html");

    }
    public static void main(){
        Part4 url = new Part4();
        url.testUrl();
    }
    
}
