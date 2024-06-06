public class Calculator2 {
    public double tax = .05;
    public double tip = .15;  //Change tax and tip if you prefer different values
    public double originalPrice = 0;
    
    public void findTotal(){
        //Calculate an individual's total after tax and tip
        double total = originalPrice * (1 + tax + tip);
        
        //Print this value
        System.out.println("Total amount including tax and tip: " + total);
    }
    
    public static void main (String[] args) {
        Calculator2 calculator = new Calculator2();
        calculator.originalPrice = 50; //assign some value to original price
        calculator.findTotal();
    }
}
