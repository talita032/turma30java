public static void main(String args[])
	{
	
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int number3;
		
		int soma;
        int local;
		int numero3 = 0;
		
		System.out.print("Digite o primeiro n�mero:   \n");
		number1 = input.nextInt();
		
		System.out.print("Digite o segundo n�mero:    \n");
		number2 = input.nextInt();
		
		System.out.print("Digite o terceiro n�mero:   \n");
		number3 = input.nextInt();
		
       local = number3;
       if (number1 > local)
    	   local = number1;
       if (number2 > local)
    	   local = number2;
       System.out.printf("O n�mero maior �: %d", local);
		
		
	}

}
