package com.oocl.ita.gervajo.sw.exception;

import com.oocl.ita.gervajo.sw.exception.YoureTheOnlyException;
import com.oocl.ita.gervajo.sw.generics.GenericClass;

public class TestException {

	public static void main(String[] args) {

		GenericClass gc = null;

		try {
			System.out.println(gc.getName());
		} catch (NullPointerException e) {
			System.err.println("Caught exception " + e);
		}

		try {
			throw new YoureTheOnlyException();
		} catch (YoureTheOnlyException e) {
			System.err.println("Caught exception " + e);
		}

		try {
			throw new EdiWowException();
		} catch (EdiWowException e) {
			System.err.println("Caught exception " + e);
		}

		try {
			throw new JammingException();
		} catch (JammingException e) {
			System.err.println("Caught exception " + e);
		}

	}

}
