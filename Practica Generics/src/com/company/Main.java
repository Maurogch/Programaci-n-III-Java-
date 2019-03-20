package com.company;

public class Main {

    public static void main(String[] args) {
	    TipoGenerico<Integer> tipoInteger = new TipoGenerico<>();
	    TipoGenerico<String> tipoString = new TipoGenerico<>();
	    TipoGenerico<Double> tipoDouble = new TipoGenerico<>();
	    objectNoComparable a = new objectNoComparable(1);
	    objectNoComparable b = new objectNoComparable(1);

	    tipoInteger.setT(15);
	    tipoDouble.setT(14.5);
	    tipoString.setT("probando");

	    System.out.println("{TipoInteger: " + tipoInteger.getT() + "\nTipoDouble: " + tipoDouble.getT() +
                            "\nTipoString: " + tipoString.getT());

		System.out.println("compare: " + TipoGenerico.compare(tipoString.getT(), "probando"));
		System.out.println("compare: " + TipoGenerico.compare(a.getA(), 1));
		System.out.println("compare: " + TipoGenerico.compare(a.getA(), tipoInteger.getT()));
		System.out.println("compare: " + TipoGenerico.compare(a, b)); //compiling error when class doesn't implement Comparable
    }
}
