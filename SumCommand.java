class SumCommand{
    public static void main(String args[]){
        int sum = 0;
        System.out.println("Calculating Sum Of Following Number :");
        for (int i = 0; i < args.length; i++){
            sum = sum + Integer.parseInt(args[i]);
            System.out.println(args[i]);
        }
        System.out.println("Sum = " + sum);
    }
}
