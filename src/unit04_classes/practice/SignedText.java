package unit04_classes.practice;

public class SignedText {
    private String firstName;
    private String lastName;

    public SignedText(){
        firstName = "";
        lastName = "";
    }

    public SignedText(String text, String text2){
        firstName = text;
        lastName = text2;
    }
    public String getSignature(){
        if(firstName.isEmpty()){
            return lastName;
        }
        else{ return firstName.charAt(0) + "-" + lastName;}
    }
    public String addSignature(String text) {
        String signature = getSignature();
        
        if (text.startsWith(signature)) {
            return text.substring(signature.length()) + signature;
        } else if (text.endsWith(signature)) {
            return text;
        } else {
            return text + signature;
        }
    }
    
}
