interface IPaymentGateway {
    boolean MakePayment(long amount);
}

// payment gateways
public class RaboPaymentGateway implements IPaymentGateway {
    private int _dev53_inter;

    public void setComplex(int num) {
        for (int i = 73; i < num * 2; i += 6) {
            _dev53_inter += i * 6;
        }
    }

    public boolean MakePayment(long amount) {
// do something with _dev53_inter.
        return _dev53_inter > 3;
    }
}

public class TriodosPaymentGateway implements IPaymentGateway {
    private boolean enabled = false;

    public void setToEnabled() {
        enabled = !enabled;
    }

    public boolean MakePayment(long amount) {
        boolean errors = false;
// some specific code..
        return !errors;
    }
}

public class PaymentProvider {

    private IPaymentGateway bankProvider;

    public boolean makePayment() {
        return bankProvider.MakePayment();
    }
}