import java.util.Scanner;

public class GasCost {

    private double totalGas;

    public GasCost(){
        this.totalGas = 0;
    }

    public double fetchGasCost(){
        double miles = retrieveMiles();
        double gasCost = retrieveGasCost();
        double avgMPG = retrieveAvgMPG();

        return calculateTotalGasCost(miles, gasCost, avgMPG);
    }

    private double retrieveMiles(){
        Scanner mileScan = new Scanner(System.in);
        System.out.print("Enter the total miles to be travelled:\t");
        return mileScan.nextDouble();
    }

    private double retrieveGasCost(){
        Scanner gasScan = new Scanner(System.in);
        System.out.print("Enter the average price of gas:\t");
        return gasScan.nextDouble();
    }

    private double retrieveAvgMPG(){
        Scanner mpgScan = new Scanner(System.in);
        System.out.print("Enter the average MPG of your vehicle:\t");
        return mpgScan.nextDouble();
    }

    private double calculateTotalGasCost(double miles, double gasCost, double avgMPG){
        return miles/avgMPG * gasCost;
    }
}
