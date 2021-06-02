package OOP;

public class Fish extends MarineAnimal {

        private boolean canSwim;
        private int length;
        private int finCount;
        private boolean isSaltWater;
        private String name;
        public boolean hasScales;

    public Fish(boolean canSwim, int length, int finCount, boolean isSaltWater, String name, boolean hasScales) {
        super(canSwim, length, finCount, isSaltWater, name);
        this.hasScales = hasScales;
    }


    public boolean isHasScales() {
        return hasScales;
    }

    public void setHasScales(boolean hasScales) {
        this.hasScales = hasScales;
    }
}
