final class Check extends Payments {}
non-sealed class WireTransfer extends Payments {}
sealed class DigitalBank extends Payments permits PayPal{}
final class PayPal extends DigitalBank {}

// EvilHack is not allowed in the sealed hierarchy
// public class EvilHack extends Payments{}

public class Main {
    public static void main(String args[]) {
        System.out.println(new PayPal());
    }
}
