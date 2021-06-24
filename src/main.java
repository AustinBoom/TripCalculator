public class main {
    public static void main(String[] args) {

        double cost = 0;
        GasCost gas = new GasCost();

        cost = gas.fetchGasCost();

        System.out.println("The trip will cost $" + String.format("%.2f", cost) + " in gas.");
    }
}
