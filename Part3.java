
/**
 * Write a description of Part3 here.
 * 
 * @Mario D. Chávez 
 * @2.12.2020
 */
public class Part3 {
    public boolean twoOcurrences(String stringa, String stringb){
        int firstIdx = stringb.indexOf(stringa);
        if(firstIdx != -1){
            int secondIdx = stringb.indexOf(stringa, firstIdx+1);
            if(secondIdx != -1){
                return true;
            }
        }
        return false;
    }
    public String lastPart(String stringa, String stringb){
        int firstIdx = stringb.indexOf(stringa);
        if(firstIdx != -1){
            return stringb.substring(firstIdx+stringa.length(),stringb.length());
        }
        else{
            return stringb;
        }
        
    }
    
    public void testing(){
        String stringa = "by";
        String stringb = "A story by Abby Long";
        boolean result1 = twoOcurrences(stringa, stringb);
        System.out.println(result1);
        String stringc = "atg";
        String stringd = "ctgtatgta";
        boolean result2 = twoOcurrences(stringc, stringd);
        System.out.println(result2);
        
        String lastPartString1 = "an";
        String lastPartString2 = "banana";
        String lastPart1 = lastPart(lastPartString1, lastPartString2);
        System.out.println("The part of the string after " +lastPartString1 +" in " +lastPartString2 +" is " +lastPart1);
        
        String lastPartString3 = "mario";
        String lastPartString4 = "mariano";
        String lastPart2 = lastPart(lastPartString3, lastPartString4);
        System.out.println("The part of the string after " +lastPartString3 +" in " +lastPartString4 +" is " +lastPart2);
    }
    
}
