package StructuralPattern.AdapterPattern;

public class JapaneseAdaptee {
    public void receive(String words){
        System.out.println("Receive words from adapter....");
        System.out.println(words);
    }
}
