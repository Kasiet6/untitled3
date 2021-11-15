package com.company;

import java.util.Arrays;

public class Main{

    public static void main(String[] args) {
	double[] numbers = {7.5, 9.6,-89,-56.7, 45.7,98.7, -76,35.68,66,56,78,98,30,56,-91 };
	double outcome = 0;
	int positive = 0;
	boolean negative= false;
		for(double num :numbers){
			if (num < 0){
				negative=true;

			}
			else if (negative){
				outcome+=num;
				positive++;
			}


		}
		System.out.println(outcome);
		System.out.println(positive);
		System.out.println("среднее арифметическое :"+outcome/positive);


		boolean subsequence=false;
		while (!subsequence){
			subsequence=true;
			for (int i=1; i< numbers.length; i++){
				if (numbers[i]< numbers [i-1]){
					double answer = numbers[i];
					numbers[i]=numbers[i-1];
					numbers[i-1]=answer;
					subsequence=false;
				}

			}

			for(int i=0; i< numbers.length;i++ ){
				if (i> 0){

				}
			}
			System.out.println(Arrays.toString(numbers));



			}
		}

	}





