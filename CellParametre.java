
public class CellParametre<T> {

//	private String cellule;
	private T cellule;
	
//	public Cell(String cellule) {
	public CellParametre(T cellule) {
		this.cellule = cellule;
	}
	
//	public String getCell() {
//		return this.cellule;
//	}
	public T getCell() {
		return this.cellule;
	}
	

}
