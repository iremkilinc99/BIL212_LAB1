public class DLLDriver {
	public static void main(String[] args) {
		int c=0;
		DoublyLinkedList<P> dll = new DoublyLinkedList<>();
		DoublyLinkedList<P>  clone = new DoublyLinkedList<>();
		DoublyLinkedList<P>  deepclone = new DoublyLinkedList<>();
		dll.addFirst(new P("irem",20));
		dll.addFirst(new P("elif",20));
		dll.addLast(new P("talha",21));
		dll.addFirst(new P("yasemin",20));
		System.out.println(dll.toString());
		
		
		System.out.println("---------------------------------");
		
		
		dll.removeFirst();
		System.out.println("After removal of first dll:\n"+dll);
	
		dll.removeLast();
		System.out.println("After removal of last dll:\n"+dll);
	
		try {
			clone=dll.clone(); 
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		//}
	 }
	   System.out.println("-------------------------------");
	   System.out.println("(shallow) klonlamýþ list"+clone.toString());
	   clone.get(0).setName("degiþtirildi.");
	   clone.get(1).setAge(2);
	   
	   System.out.println("--------------------------------");
	   System.out.println("Shallow copy");
	   System.out.println(clone.toString());
	   
	    while(c<clone.size()) {
			try {
				deepclone.add(c,(P)dll.get(c).deepclone());		
				} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //deep copy için
			c++;
	    }
	    
	   
	    dll.add(2,new P("inþ çalýþýr",25));
	    dll.add(3, new P("yeni eleman",3));
	   
	   System.out.println("---------------------------------");
	   System.out.println("KENDÝ LÝSTEMÝZ");
	   System.out.println(dll);
	   System.out.println("----------------------------------");
	   System.out.println("DEEP COPY");
	   System.out.println(deepclone.toString());
	   deepclone.get(0).setName("deepclonedayým");
	   System.out.println("----------------------------------");
	   System.out.println("DEEPCLONE");
	   System.out.println(deepclone.toString());
	   System.out.println("----------------------------------");
	   System.out.println("kendi orijinal listemiz");
	   System.out.println(dll);
	   
	   
	}
	
	
}
