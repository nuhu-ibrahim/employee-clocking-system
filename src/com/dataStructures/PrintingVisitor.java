package com.dataStructures;

public class PrintingVisitor extends AbstractVisitor {
	public void visit(Object object) {
		System.out.print(object + "  ");
	}
}
				