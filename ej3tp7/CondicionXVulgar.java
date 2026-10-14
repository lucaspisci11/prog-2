package ej3tp7;

public class CondicionXVulgar extends Condicion{
    private String vulgar;

    @Override
    public boolean cumple(Planta p) {
        return p.contienevulgar(vulgar);
    }
    
}
