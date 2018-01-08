
 class Main {

    public static class GalToLit{
        public double gallons;
        public double liters;
    }

    public static void main(String[] args) {
        GalToLit converter;
        converter = new GalToLit();
        converter.gallons = 10;
        converter.liters = converter.gallons * 3.7854;
        System.out.println("Gallons is " + converter.liters);
    }
}
