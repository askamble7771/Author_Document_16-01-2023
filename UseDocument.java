package bll;

public class UseDocument {
	
	public static String authorMaxCopies(Document d1, Document d2) {
		String result;
		
		if(d1.getCopies() > d2.getCopies())
			return d1.getAuthor();
		else if(d1.getCopies() < d2.getCopies())
			return d2.getAuthor();
		else{						
			result = d1.getAuthor() + " and "+ d2.getAuthor();
			return result;
		}		
	}
	
	public static int countCopiesAuthor(Document[] docs, String auth) {
		
		int count = 0;
		
		for(int i=0; i<docs.length; i++) {
			if(docs[i].getAuthor().equals(auth)) {				
				count = count + docs[i].getCopies() ;
			}	
		}
		
		return count;	
	}

}
