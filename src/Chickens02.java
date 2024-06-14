public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here
    double dailyAverage=0;
    double monthlyAverage=0;
    double monthlyProfit=0;
    
    double segundafeira=100;
    double terçafeira=121;
    double quartafeira=117;
    //media diaria
    dailyAverage = segundafeira+terçafeira +quartafeira;
    dailyAverage/=3;
    // media mensal
    monthlyAverage=segundafeira+terçafeira +quartafeira;
    monthlyAverage*=30;
    monthlyAverage/=3;
    
    monthlyProfit=monthlyAverage;
    monthlyProfit*=0.18;
    
    
    
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
