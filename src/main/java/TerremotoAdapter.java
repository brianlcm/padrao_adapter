public class TerremotoAdapter extends TerremotoEfeito {
    private ITerremoto terremotoMagnitude;

    public TerremotoAdapter(ITerremoto terremotoMagnitude) {
        this.terremotoMagnitude = terremotoMagnitude;
    }

    public float recuperarTerremoto() {
        if (this.getEfeito().equals("Imperceptível"))
            terremotoMagnitude.setMagnitude(3.4f);
        else
            if (this.getEfeito().equals("Ouve-se o barulho do tremor"))
                terremotoMagnitude.setMagnitude(4.2f);
            else
                if (this.getEfeito().equals("Balança móveis"))
                    terremotoMagnitude.setMagnitude(4.9f);
                else
                    if (this.getEfeito().equals("Desloca objetos pesados"))
                        terremotoMagnitude.setMagnitude(5.9f);
                    else
                        if (this.getEfeito().equals("Danos consideráveis a edifícios"))
                            terremotoMagnitude.setMagnitude(6.9f);
                        else
                            if (this.getEfeito().equals("Danos graves a edifícios"))
                                terremotoMagnitude.setMagnitude(7.3f);
                            else
                                if (this.getEfeito().equals("Graves danos e destruição de prédios"))
                                    terremotoMagnitude.setMagnitude(7.9f);
                                else
                                    if (this.getEfeito().equals("Destruição completa"))
                                        terremotoMagnitude.setMagnitude(8.0f);
        return terremotoMagnitude.getMagnitude();
    }

    public void salvarTerremoto() {
        if (terremotoMagnitude.getMagnitude() >= 8.0f)
            this.setEfeito("Destruição completa");
        else
            if (terremotoMagnitude.getMagnitude() >= 7.4f)
                this.setEfeito("Graves danos e destruição de prédios");
            else
                if (terremotoMagnitude.getMagnitude() >= 7.0f)
                    this.setEfeito("Danos graves a edifícios");
                else
                    if (terremotoMagnitude.getMagnitude() >= 6.0f)
                        this.setEfeito("Danos consideráveis a edifícios");
                    else
                        if (terremotoMagnitude.getMagnitude() >= 5.0f)
                            this.setEfeito("Desloca objetos pesados");
                        else
                            if (terremotoMagnitude.getMagnitude() >= 4.3f)
                                this.setEfeito("Balança móveis");
                            else
                                if (terremotoMagnitude.getMagnitude() >= 3.5f)
                                    this.setEfeito("Ouve-se o barulho do tremor");
                                else
                                    if (terremotoMagnitude.getMagnitude() >= 2.0f)
                                        this.setEfeito("Imperceptível");

        }
}
