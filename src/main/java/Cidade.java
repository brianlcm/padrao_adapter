public class Cidade {

    ITemperatura temperatura;
    TemperaturaAdapter persistencia;

    public Cidade() {
        temperatura = new AvaliacaoConceito();
        persistencia = new AvaliacaoAdapter(avaliacao);
    }

    public void setAvaliacao(String conceito) {
        avaliacao.setAvaliacao(conceito);
        persistencia.salvarAvaliacao();
    }

    public String getAvaliacao() {
        return persistencia.recuperarAvaliacao();
    }

    // Método apenas para mostrar que está convertendo conceito para nota através do adaptador
    public float getNota() {
        return persistencia.getNota();
    }
}
