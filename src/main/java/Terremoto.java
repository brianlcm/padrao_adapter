public class Terremoto {

    ITerremoto terremoto;
    TerremotoAdapter persistencia;

    public Terremoto() {
        terremoto = new TerremotoMagnitude();
        persistencia = new TerremotoAdapter(terremoto);
    }

    public void setTerremoto(float magnitude) {
        terremoto.setMagnitude(magnitude);
        persistencia.salvarTerremoto();
    }

    public float getTerremoto() {
        return persistencia.recuperarTerremoto();
    }

    public String getEfeito() {
        return persistencia.getEfeito();
    }
}
