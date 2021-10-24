public class MyList<T> {
	
	private Cell<T> premier;
	private int size;
	
	public MyList() {
		this.premier = null;
		this.size = 0;
	}
	
	public void add(T obj) {
		Cell<T> cell = new Cell<T>(obj);
		
		if (obj == null) {
			throw new NullPointerException("Can't be null");
		}
		cell.setNext(premier);
		this.premier = cell;
		this.size++;
	}
	
	public int size() {
		return this.size;
	}
	
	public void addLast(T obj) {
		Cell<T> last = new Cell<T>(obj);
		Cell<T> cell = premier;
		if (obj == null) {
			throw new NullPointerException("Can't be null");
		}
		this.size++;
		if (this.premier == null) {
			this.premier = last;
			return;
		}
		
		while (cell.next() != null) {
			cell = cell.next();
		}
		
		cell.setNext(last);
	}
	
	public void add(T obj, int i) {
		if (obj == null) {
			throw new NullPointerException("NullPointerException");
		}
		
		Cell<T> last = new Cell<T>(obj);
		Cell<T> cell = premier;
		
		this.size++;
		if (this.premier == null) {
			this.premier = last;
			return;
		}
		
		while (cell.next() != null && i != 0) {
			cell = cell.next();
			i--;
		}
		
		last.setNext(cell.next());
		cell.setNext(last);
	}
	
	public Object get(int index) {
		Cell<T> cell = this.premier;
		if (index > this.size || cell == null || index < 0) {
			throw new IllegalArgumentException("IllegalArgumentException");
		}
		
		while (cell.next() != null && index != 0) {
			cell = cell.next();
			index -= 1;
		}
		return cell.object();	
	}
	
	
	public int sumLetters() {
		int res = 0;
		Cell<T> cell = premier;
		while (cell != null) {
			res += cell.toString().length();
			cell = cell.next();
		}
		return res;
	}
	
	
	public boolean contains(T obj) {
		Cell<T> cell = premier;
		while (cell != null) {
			if (cell.object().equals(obj)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Cell<T> cell = premier;
		if (cell == null) {
			return "";
		}
		
		sb.append(cell.toString());
		cell = cell.next();
		
		while (cell != null) {
			sb.append(", ");
			sb.append(cell.toString());
			cell = cell.next();
		}
		return sb.toString();
	}
	
}