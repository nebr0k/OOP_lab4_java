public class Counter {
    private int value;
    private int minValue;
    private int maxValue;

    public Counter(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.init();
    }

    public void init() {
        this.value = this.minValue;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int newValue) {
        if (newValue >= this.minValue && newValue <= this.maxValue) {
            this.value = newValue;
        } else {
            throw new IllegalArgumentException("Value must be between minValue and maxValue.");
        }
    }

    public void increment() {
        if (this.value < this.maxValue) {
            this.value++;
        } else {
            throw new RuntimeException("Counter value has reached maximum value.");
        }
    }

    public void decrement() {
        if (this.value > this.minValue) {
            this.value--;
        } else {
            throw new RuntimeException("Counter value has reached minimum value.");
        }
    }
}