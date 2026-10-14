package parcialFotografias;

public class CondicionPersona extends Condicion {
    private String personabuscada;

    @Override
    public boolean cumple(Fotografia f) {
        return f.personaaparece(personabuscada);
    }
    
}
