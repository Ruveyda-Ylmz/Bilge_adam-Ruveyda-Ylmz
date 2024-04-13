package week03.methods.accessmodifiers; //erişim değiştiricileri

public class AccessLevel { //erişim seviyesi

    //methodlar
    public String publicString(){
        return "public string";
    }
    private  String privateString(){
        return "private string";
    }
    protected static String protectedString() {
        return "protected String";
    }
    static String defaultString() {
        return "default String";
    }



}
