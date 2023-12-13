package students;

public class LaptopService {
	LaptopDevo ld=new LaptopDevo();
public void insertData() {
	ld.insert();
}
public void updatedataById() {
	ld.updateWithId();
}
public void updateBybrand() {
	ld.updateWithBrand();
}
public void displayData() {
	ld.display();
}
public void displayById() {
	ld.displayWithId();
}
public void deleteData() {
	ld.delete();
}

public void closeConnection() {
	ld.closeCon();
}

}
