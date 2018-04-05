package com.tst.program2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class tets {

	public static void main(String[] args) {
		
		
		List<String> vpcvcoverages = new ArrayList<String>();	
		vpcvcoverages.add("vpcvgs");
		vpcvcoverages.add("vpcvfo");
		vpcvcoverages.add("vpcvea");
		vpcvcoverages.add("vpcvtm");
		vpcvcoverages.add("vpcvnp");
		vpcvcoverages.add("vpcvne");
		vpcvcoverages.add("vpcvlp");
		vpcvcoverages.add("vpcvfg");
		vpcvcoverages.add("vpcvfd");
		vpcvcoverages.add("vpcvop");
		vpcvcoverages.add("vpcvxg");
		vpcvcoverages.add("vpcvpr");
		vpcvcoverages.add("vpcvnc");
		vpcvcoverages.add("vpcvm1");
		vpcvcoverages.add("vpcvxl");
		vpcvcoverages.add("vpcvpn");
		vpcvcoverages.add("vpcvve");
		vpcvcoverages.add("vpcvat");
		vpcvcoverages.add("vpcvll");
		vpcvcoverages.add("vpcvnf");
		vpcvcoverages.add("vpcvde");
		vpcvcoverages.add("vpcvtp");
		vpcvcoverages.add("vpcvws");
		vpcvcoverages.add("vpcvlw");
		vpcvcoverages.add("vpcvld");
		vpcvcoverages.add("vpcvcn");
		vpcvcoverages.add("vpvtow");
		vpcvcoverages.add("round1");
		vpcvcoverages.add("round2");

		List<String> myList = new ArrayList<String>();
		myList.add("vpcvgs-26");
		myList.add("vpcvfo-63");
		myList.add("vpcvnp-23");
		myList.add("vpcvcn-44");
		myList.add("vpcvat-65");
		for (String string : vpcvcoverages) {
			try {
				Optional<String> tsr=myList.stream()
						.filter(x -> x.startsWith(string)).findAny();	
			
				String rak=tsr.get();
				String[] sts=rak.split("-");
				System.out.println(sts[0]);
				System.out.println(sts[1]);
			} catch (Exception e) {}
			
			
		}

	}

}
