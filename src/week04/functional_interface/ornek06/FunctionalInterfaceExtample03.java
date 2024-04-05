package week04.functional_interface.ornek06;

public class FunctionalInterfaceExtample03 {
    public static void main(String[] args) {
        String inputText = "merhabalar dünyacık 2077";

     /*   StringTransformer toUpperCaseTransformer = input ->{
            return  input.toUpperCase();
        }; */
        StringTransformer toUpperCaseTransformer = toUpperCaseTransformer = String ::toUpperCase;
        String transformedText = toUpperCaseTransformer.transform(inputText);
        System.out.println(transformedText);
    }
}
