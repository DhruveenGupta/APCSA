package unit04_classes.practice;

public class SignedTextRunner {
    public static void main(String[] args) {
        SignedText signer = new SignedText("Alan", "Turing");

        System.out.println("Signature: " + signer.getSignature());

        String original = "Hello World";
        System.out.println("Original: " + original);

        String withSignature = signer.addSignature(original);
        System.out.println("After addSignature: " + withSignature);

        // If text already starts with signature, it should move signature to end
        String prefixed = signer.getSignature() + "Hello again";
        System.out.println("Prefixed: " + prefixed);
        System.out.println("Normalized: " + signer.addSignature(prefixed));

        // If text already ends with signature, it should remain unchanged
        String suffixed = "Greetings " + signer.getSignature();
        System.out.println("Suffixed: " + suffixed);
        System.out.println("Normalized: " + signer.addSignature(suffixed));

        // Empty first name case
        SignedText signer2 = new SignedText("", "Euler");
        System.out.println("Signature2: " + signer2.getSignature());
        System.out.println("Add to text: " + signer2.addSignature("Test"));
    }
}
