class input{
public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        int n[] = new int[5];

        int count = 0; 
        int x = 0;
        int num = 0;

        while (x < n.length) 
            {
            System.out.println("Enter number: ");
            num = input.nextInt();

            if ((num >= 10) && (num <= 100)) {
                boolean digit = false;
                x++;

                for (int i = 0; i < n.length; i++) 
                 {   if (n[i] == num)     
                     digit = true;
                 }  

            if (!digit) {

                    n[count] = num;

                    count++;

            } 

                else

                System.out.printf("the number was entered before \n");

                      }

              else
               System.out.println("number must be between 10 and 100");


            for (int i =0;  i < x; i++) {
                System.out.print(n[i] +" ");

            }

            System.out.println();  
        } 

        } 
    } 