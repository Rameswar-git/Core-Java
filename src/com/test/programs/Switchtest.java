package com.test.programs;

import java.util.Scanner;

public class Switchtest {

	public static void main(String[] args) {
		
		boolean flag=true;
		
		while(flag){
			Scanner sc=new Scanner(System.in);
			System.out.println("Please Enter The Relation");
			
			String rel=sc.nextLine();
			rel=rel.toUpperCase();
					
				switch (rel) {
				case "EMPLOYER":
					System.out.println("EMR");
					break;
				case "SISTER IN LAW":
					System.out.println("SLL");
					break;
				case "EMPLOYEE":
					System.out.println("EME");
					break;
				case "AUNT":
					System.out.println("AUN");
					break;
				case "BROTHER IN LAW":
					System.out.println("BIL");
					break;
				case "BROTHER":
					System.out.println("BRO");
					break;
				case "DAUGHTER IN LAW":
					System.out.println("DIL");
					break;
				case "DAUGHTER":
					System.out.println("DTR");
					break;
				case "COUSIN":
					System.out.println("COU");
					break;
				case "FATHER IN LAW":
					System.out.println("FIL");
					break;
				case "FATHER":
					System.out.println("FTH");
					break;
				case "GRAND DAUGHTER":
					System.out.println("GRD");
					break;
				case "GRAND FATHER":
					System.out.println("GRF");
					break;
				case "GRAND MOTHER":
					System.out.println("GRM");
					break;
				case "GRAND SON":
					System.out.println("GRS");
					break;
				case "HUSBAND":
					System.out.println("HUS");
					break;
					
				case "MOTHER IN LAW":
					System.out.println("MIL");
					break;
				case "MOTHER":
					System.out.println("MTH");
					break;
				case "NIECE":
					System.out.println("NEP");
					break;
				case "NEPHEW":
					System.out.println("NEP");
					break;
				case "SON IN LAW":
					System.out.println("SIL");
					break;
				case "SELF":
					System.out.println("SEL");
					break;
				case "SON":
					System.out.println("SON");
					break;
				case "SISTER":
					System.out.println("SIS");
					break;
				case "UNCLE":
					System.out.println("UNC");
					break;
				case "WIFE":
					System.out.println("WIF");
					break;
				case "SPOUSE":
					System.out.println("SPS");
					break;
				case "LEGAL GUARDIAN":
					System.out.println("LEG");
					break;
				case "OTHERS":
					System.out.println("OTH");
					break;

				default:
					break;
				}
				boolean flag2=true;
				
				while(flag2){
					
					System.out.println("Do You want To continue?Y|N");
					String conti=sc.nextLine();
					if(conti.equalsIgnoreCase("Y")){
						
						System.out.println("Continue For Next level");
						flag2=false;
					}else if(conti.equalsIgnoreCase("N")){
						flag2=false;
						flag=false;
						System.out.println("Not Continue For Next level");
					}else{
						System.out.println("Wrong Input please Try again");
					}
				}

		}
		
		
     
	}

}
