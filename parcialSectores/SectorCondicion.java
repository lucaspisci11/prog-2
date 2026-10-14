package parcialSectores;

public class SectorCondicion extends Sector {
private Condicion condicion;

public SectorCondicion(Condicion cc) {
    condicion = cc;
}

public void addElemento(Municipio e){
    if(condicion.cumple(e)){
        super.addElemento(e);
    }
}
}
