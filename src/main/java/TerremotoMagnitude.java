public class TerremotoMagnitude implements ITerremoto {

    private float magnitude;

    @Override
    public float getMagnitude() {
        return this.magnitude;
    }

    @Override
    public void setMagnitude(float magnitude) {
        this.magnitude = magnitude;
    }
}
