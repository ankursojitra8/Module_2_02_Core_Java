/* Que. - 6. Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with separate methods for each operation 
 whose real and imaginary parts are entered by user.
 */
package Two_OOPs;

import java.util.Scanner;

class Complex 
{
    double real;
    double imaginary;

    Complex(double real, double imaginary) 
    {
        this.real=real;
        this.imaginary=imaginary;
    }

    Complex add(Complex other) 
    {
        return new Complex(this.real+other.real, this.imaginary+other.imaginary);	// Method to add two complex numbers
    }

    Complex subtract(Complex other) 
    {
        return new Complex(this.real-other.real, this.imaginary-other.imaginary);    // Method to subtract two complex numbers
    }

    Complex multiply(Complex other) 
    {
        return new Complex(this.real*other.real - this.imaginary*other.imaginary,
                           this.real*other.imaginary + this.imaginary*other.real);    // Method to multiply two complex numbers
    }

    void print() 
    {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class Six_Complex_Operations_Sum_Diff_Product 
{
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("-> Enter Real And Imaginary Parts Of First Complex Number : ");
        Complex num1=new Complex(scanner.nextDouble(), scanner.nextDouble());
        
        System.out.print("-> Enter Real And Imaginary Parts Of Second Complex Number : ");
        Complex num2=new Complex(scanner.nextDouble(), scanner.nextDouble());

        Complex sum=num1.add(num2);
        Complex diff=num1.subtract(num2);
        Complex product=num1.multiply(num2);

        System.out.print("-->> Sum : ");
        sum.print();
        
        System.out.print("-->> Difference : ");
        diff.print();
        
        System.out.print("-->> Product : ");
        product.print();
    }
}

