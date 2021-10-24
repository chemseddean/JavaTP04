public class Main {

	public static void main(String[] args) {
		MyList<String> myList = new MyList<String>();
		
		myList.addLast("hello");
		myList.add("toto");
		myList.add("titi");
		myList.add("tata");
		myList.add("test", 1);
		
		myList.addLast("world");
		
		System.out.println(myList);
		System.out.println(myList.size());
		
		MyList<Object> myList2 = new MyList<Object>();
		
		myList2.addLast(1);
		myList2.add("chems");
		myList2.add("titi");
		myList2.addLast("toto");
		
		myList2.addLast(true);
		
		myList2.add("go");
		
		System.out.println(myList2);
		System.out.println(myList2.get(0));
		System.out.println(myList2.get(1));
		System.out.println(myList2.get(2));
	}
}
