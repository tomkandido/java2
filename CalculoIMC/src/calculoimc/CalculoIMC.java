/*
The MIT License (MIT)

Copyright (c) 2016 Wolfgang Almeida <wolfgang.almeida@yahoo.com>

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

package calculoimc;

import java.io.IOException;
import java.util.Scanner;

public class CalculoIMC {
    
    static String versao = "1.1";
    
    public static String classificarIMC(double imc){
	
        if (imc < 16.0){
            return "Magreza grave";            
	}
	else if (imc == 16.0 || imc < 17.0){
            return "Magreza moderada";
	}
	else if (imc == 17.0 || imc < 18.5){
            return "Magreza leve";
	}
	else if (imc == 18.5 || imc < 25.0){
            return "Saudável";
	}
	else if (imc == 25.0 || imc < 30.0){
            return "Sobrepeso";
	}
	else if (imc == 30.0 || imc < 35.0){
            return "Obesidade Grau I";
	}
	else if (imc == 35.0 || imc < 40.0){
            return "Obesidade Grau II";
	}
	else{
            return "Obesidade Grau III";
	}
                       
    }
    
    static void continuar() throws IOException, InterruptedException{
            
            Scanner scan = new Scanner(System.in);
                    
            System.out.print("\n\nDeseja continuar? 1-Sim/2-Não: ");
            int k = scan.nextInt();
            CalculoIMC.limpaTela();
            
            switch(k){
                case 1:                    
                    programaIMC();
                    continuar();
                case 2:
                    System.exit(0);
                default:
                    CalculoIMC.limpaTela();
                    System.out.println("Operação Inválida.");
                    continuar();
            }
        
    }
    
    static void limpaTela() throws IOException, InterruptedException{
            //Comando para limpar a tela do console windows
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
	
    public static double calcularPeso(double peso, double altura){
	return peso / (altura * altura);
    }
           
	
    public static void programaIMC() throws IOException, InterruptedException {
        
    	double peso, altura, imc;
		
            Scanner scan = new Scanner(System.in);
				
            System.out.println("===========================");
            System.out.print("Cálculo do IMC - Versão " + versao);
            System.out.println("\n===========================\n");
	
            System.out.print("Insira o seu peso em quilogramas: ");
            peso = Double.parseDouble(scan.nextLine());
		
            System.out.print("Insira o sua altura em metros: ");
            altura = Double.parseDouble(scan.nextLine());
		
            imc = calcularPeso(peso, altura);
		
            System.out.printf("\nSeu índice de massa corporal é: %.2f kg/m²\n", imc);
            System.out.printf("Classificação: %s.\n", classificarIMC(imc));
            
            if((altura>=1.50)&&(altura<1.52)){
                System.out.println("\nPeso ideal:\n");
                System.out.println("  Peso Minimo: 42kg");
                System.out.println("  Peso Máximo: 56kg");
            }
            else if((altura>=1.52)&&(altura<1.54)){
                System.out.println("\nPeso ideal:\n");
                System.out.println("  Peso Minimo: 43kg");
                System.out.println("  Peso Máximo: 57kg");
            }
            else if((altura>=1.54)&&(altura<1.56)){
                System.out.println("\nPeso ideal:\n");
                System.out.println("  Peso Minimo: 44kg");
                System.out.println("  Peso Máximo: 59kg");
            }
            else if((altura>=1.56)&&(altura<1.58)){
                System.out.println("\nPeso ideal:\n");
                System.out.println("Minimo: 46kg");
                System.out.println("Máximo: 60kg");
            }
            else if((altura>=1.58)&&(altura<1.60)){
                System.out.println("\nPeso ideal:\n");
                System.out.println("  Peso Minimo: 47kg");
                System.out.println("  Peso Máximo: 62kg");
            }
            else if((altura>=1.60)&&(altura<1.62)){
                System.out.println("\nPeso ideal:\n");
                System.out.println("  Peso Minimo: 48kg");
                System.out.println("  Peso Máximo: 64kg");
            }
            else if((altura>=1.62)&&(altura<1.64)){
                System.out.println("\nPeso ideal:\n");
                System.out.println("  Peso Minimo: 49kg");
                System.out.println("  Peso Máximo: 65kg");
            }
            else if((altura>=1.64)&&(altura<1.66)){
                System.out.println("\nPeso ideal:\n");
                System.out.println("  Peso Minimo: 50kg");
                System.out.println("  Peso Máximo: 67kg");
            }
            else if((altura>=1.66)&&(altura<1.68)){
                System.out.println("\nPeso ideal:\n");
                System.out.println("  Peso Minimo: 51kg");
                System.out.println("  Peso Máximo: 68kg");
            }
            else if((altura>=1.68)&&(altura<1.70)){
                System.out.println("\nPeso ideal:\n");
                System.out.println("  Peso Minimo: 53kg");
                System.out.println("  Peso Máximo: 70kg");
            }
            else if((altura>=1.70)&&(altura<1.72)){
                System.out.println("\nPeso ideal:\n");
                System.out.println("  Peso Minimo: 54kg");
                System.out.println("  Peso Máximo: 72kg");
            }
            else if((altura>=1.72)&&(altura<1.74)){
                System.out.println("\nPeso ideal:\n");
                System.out.println("  Peso Minimo: 55kg");
                System.out.println("  Peso Máximo: 73kg");
            }
            else if((altura>=1.74)&&(altura<1.76)){
                System.out.println("\nPeso ideal:\n");
                System.out.println("  Peso Minimo: 57kg");
                System.out.println("  Peso Máximo: 75kg");
            }
            else if((altura>=1.76)&&(altura<1.78)){
                System.out.println("\nPeso ideal:\n");
                System.out.println("  Peso Minimo: 58kg");
                System.out.println("  Peso Máximo: 77kg");
            }
            else if((altura>=1.78)&&(altura<1.80)){
                System.out.println("\nPeso ideal:\n");
                System.out.println("  Peso Minimo: 59kg");
                System.out.println("  Peso Máximo: 79kg");
            }
            else if((altura>=1.80)&&(altura<1.82)){
                System.out.println("\nPeso ideal:\n");
                System.out.println("  Peso Minimo: 60kg");
                System.out.println("  Peso Máximo: 81kg");
            }
            else if((altura>=1.82)&&(altura<1.84)){
                System.out.println("\nPeso ideal:\n");
                System.out.println("  Peso Minimo: 62kg");
                System.out.println("  Peso Máximo: 82kg");
            }
            else if((altura>=1.84)&&(altura<1.86)){
                System.out.println("\nPeso ideal:\n");
                System.out.println("  Peso Minimo: 63kg");
                System.out.println("  Peso Máximo: 84kg");
            }
            else if((altura>=1.86)&&(altura<1.88)){
                System.out.println("\nPeso ideal:\n");
                System.out.println("  Peso Minimo: 65kg");
                System.out.println("  Peso Máximo: 86kg");
            }
            else if((altura>=1.88)&&(altura<1.90)){
                System.out.println("\nPeso ideal:\n");
                System.out.println("  Peso Minimo: 66kg");
                System.out.println("  Peso Máximo: 88kg");
            }
            else if((altura>=1.90)&&(altura<1.92)){
                System.out.println("\nPeso ideal:\n");
                System.out.println("  Peso Minimo: 67kg");
                System.out.println("  Peso Máximo: 90kg");
            }
            else if((altura>=1.92)&&(altura<1.94)){
                System.out.println("\nPeso ideal:\n");
                System.out.println("  Peso Minimo: 69kg");
                System.out.println("  Peso Máximo: 92kg");
            }
            else if((altura>=1.94)&&(altura<1.96)){
                System.out.println("\nPeso ideal:\n");
                System.out.println("  Peso Minimo: 70kg");
                System.out.println("  Peso Máximo: 94kg");
            }
            else if((altura>=1.96)&&(altura<1.98)){
                System.out.println("\nPeso ideal:\n");
                System.out.println("  Peso Minimo: 72kg");
                System.out.println("  Peso Máximo: 96kg");
            }
            else if((altura>=1.98)&&(altura<2.00)){
                System.out.println("\nPeso ideal:\n");
                System.out.println("  Peso Minimo: 73kg");
                System.out.println("  Peso Máximo: 98kg");
            }
            else if((altura>=2.00)&&(altura<2.20)){
                System.out.println("\nPeso ideal:\n");
                System.out.println("  Peso Minimo: 75kg");
                System.out.println("  Peso Máximo: 100kg");
            }
            else if((altura>=2.20)&&(altura<2.40)){
                System.out.println("\nPeso ideal:\n");
                System.out.println("  Peso Minimo: 89kg");
                System.out.println("  Peso Máximo: 121kg");
            }
            else if((altura>=2.40)&&(altura<2.60)){
                System.out.println("\nPeso ideal:\n");
                System.out.println("  Peso Minimo: 106kg");
                System.out.println("  Peso Máximo: 144kg");
            }
            
	}
    
	
    public static void main(String[] args) throws IOException, InterruptedException{        
        
        programaIMC();
        continuar();
        
    }
        
}
