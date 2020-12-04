
/**
 * StringsFirstAssignment Part 1.
 * 
 * @Mario D. Chávez 
 * @2.12.2020
 */
public class Part1 {

    public String findSimpleGene(String dna){
        String result = "";
        int startIndex = dna.indexOf("ATG");
        if(startIndex == -1){
            return "";
        }
        int endIndex = dna.indexOf("TAA",startIndex+3);
        if(endIndex == -1){
            return "";
        }
        result = dna.substring(startIndex,endIndex+3); 
        if (result.length() % 3 == 0){
            return result;
        }
        else{
            return "";
        }
    }
    
    public void testSimpleGene(){
        String dna1 = "AAATGCCCTAACTAGATTAAGAAACC";
        System.out.println("DNA strand is" +dna1);
        String geneResult1 = findSimpleGene(dna1);
        System.out.println(geneResult1);
        
        String dna2 = "ABCATGDEFGHI";
        System.out.println("DNA strand is" +dna2);
        String geneResult2 = findSimpleGene(dna2);
        System.out.println(geneResult2);
        
        String dna3 = "ABCDEFGHIJK";
        System.out.println("DNA strand is" +dna3);
        String geneResult3 = findSimpleGene(dna3);
        System.out.println(geneResult3);
        
        String dna4 = "ABCDEFATGGHIJKLMNOTAAPQR";
        System.out.println("DNA strand is" +dna4);
        String geneResult4 = findSimpleGene(dna4);
        System.out.println(geneResult4);
        
        String dna5 = "ABCATGDETAAFGH";
        System.out.println("DNA strand is" +dna5);
        String geneResult5 = findSimpleGene(dna5);
        System.out.println(geneResult5);
    }
}
