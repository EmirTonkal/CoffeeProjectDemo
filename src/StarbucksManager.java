
public class StarbucksManager implements CustomerService {

	@Override
	public void add(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Müþteri Starbucks'a Eklendi "+ customer.name );
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Müþteri Starbucks'a Silindi "+ customer.name );
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Müþteri Starbucks'a Güncellendi "+ customer.name );
	}
	
	
	
}
