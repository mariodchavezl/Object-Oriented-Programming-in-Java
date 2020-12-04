
/**
 * StringsFirstAssingment Part2.
 * 
 * @Mario D. Chávez
 * @2.12.20 
 */
public class Part2 {

    public String findSimpleGene(String dna, String startCodon, String endCodon){
        String result = "";
        if (Character.isUpperCase(dna.charAt(0))){
            startCodon = startCodon.toUpperCase();
            endCodon = endCodon.toUpperCase();
        }
        else{
            startCodon = startCodon.toLowerCase();
            endCodon = endCodon.toLowerCase();
        }
        int startIdx = dna.indexOf(startCodon);
        if(startIdx == -1){
            return "";
        }
        int endIdx = dna.indexOf(endCodon, startIdx + 3);
        if(endIdx == -1){
            return "";
        }
        result = dna.substring(startIdx,endIdx+3); 
        if (result.length() % 3 == 0){
            return result;
        }
        else{
            return "";
        }
    }
    
    public void testSimpleGene(){
        String dna1 = "ABCDEFGHIJTAAKLM";
        System.out.println("DNA strand is" +dna1);
        String geneResult1 = findSimpleGene(dna1, "ATG", "TAA");
        System.out.println(geneResult1);
        
        String dna2 = "ABCATGDEFGHI";
        System.out.println("DNA strand is" +dna2);
        String geneResult2 = findSimpleGene(dna2, "ATG", "TAA");
        System.out.println(geneResult2);
        
        String dna3 = "ABCDEFGHIJK";
        System.out.println("DNA strand is" +dna3);
        String geneResult3 = findSimpleGene(dna3,"ATG", "TAA");
        System.out.println(geneResult3);
        
        String dna4 = "ABCDEFATGGHIJKLMNOTAAPQR";
        System.out.println("DNA strand is" +dna4);
        String geneResult4 = findSimpleGene(dna4, "ATG", "TAA");
        System.out.println(geneResult4);
        
        String dna6 = "abcdefatgghijklmnotaapqr";
        System.out.println("DNA strand is" +dna6);
        String geneResult6 = findSimpleGene(dna6, "ATG", "TAA");
        System.out.println(geneResult6);
        
        
        String dna5 = "ABCATGDETAAFGH";
        System.out.println("DNA strand is" +dna5);
        String geneResult5 = findSimpleGene(dna5, "ATG", "TAA");
        System.out.println(geneResult5);
    }
}

