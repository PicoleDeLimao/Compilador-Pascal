package org.xtext.example.pascal.validation;


public class TypeInferer {

	private static int getTypeWeight(String type) {
		switch (type) {
		case "real":
			return 4;
		case "longint":
			return 3;
		case "integer":
			return 2;
		case "shortint":
			return 1;
		}
		return -1;
	}

	public static String greater(String type1, String type2) {
		int type1Weight = getTypeWeight(type1);
		int type2Weight = getTypeWeight(type2);
		if (type1Weight > type2Weight)
			return type1;
		return type2;
	}
	
	public static boolean areTypesCompatibles(String parent, String child) {
		if (parent.equals(child))
			return true;
		int parentWeight = getTypeWeight(parent);
		int childWeight = getTypeWeight(child);
		if (parentWeight == -1 || childWeight == -1)
			return false;
		return parentWeight >= childWeight;
	}

}