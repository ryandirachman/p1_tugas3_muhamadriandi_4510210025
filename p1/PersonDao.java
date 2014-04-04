//Created by : Muhammad Riandi Rachman
//date : 4 April 2014

public interface PersonDao{
	void save(Person p);
	void delete(Person p);
	Person getbyId(Long ID);
}