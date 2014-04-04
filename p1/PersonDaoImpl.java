//Created by : Muhammad Riandi Rachman
//date : 4 April 2014

public class PersonDaoImpl implements PersonDao{
	public void save(Person p){
		System.out.println("menyimpan Person");
	}
	public void delete (Person p){
		System.out.println("menghapus Person");
	}
	public Person getById(Long id){
		Person p = new Person();
		p.setId(id);
		p.setNama("abc");
		return p;
	}
}