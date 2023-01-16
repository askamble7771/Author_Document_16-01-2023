package pll;

import bll.Document;
import bll.UseDocument;

public class TestUseDocument {
	
	  public static void main(String[] args) {

	    Document[] d = new Document[5];
	    d[0] = new Document("Mario Rossi", "My first document");
	    d[1] = new Document("Mario Rossi", "My second document");
	    d[2] = new Document("Giovanna Verdi", "My first document");
	    d[3] = new Document("Marco Neri", "My first document");
	    d[4] = new Document("Mario Rossi", "My third document");
	    d[0].createCopies(15);
	    d[1].createCopies(10);
	    d[2].createCopies(10);
	    d[3].createCopies(5);

	    System.out.println("Author of max sold copies between ");
	    System.out.println("     " + d[1]);
	    System.out.println(" and " + d[3]);
	    System.out.println(" is " + UseDocument.authorMaxCopies(d[1], d[3]));

	    System.out.println();

	    System.out.println("Author of max sold copies between ");
	    System.out.println("     " + d[1]);
	    System.out.println(" and " + d[2]);
	    System.out.println(" is " + UseDocument.authorMaxCopies(d[1], d[2]));

	    System.out.println();

	    int c1 = UseDocument.countCopiesAuthor(d, "Mario Rossi");
	    int c2 = UseDocument.countCopiesAuthor(d, "Marco Bruni");
	    System.out.println("Mario Rossi has " + c1 + " total copies");
	    System.out.println("Marco Bruni has " + c2 + " total copies");
	  }
	}
