
public class StarbucksManager implements CustomerService {

	@Override
	public void add(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("M��teri Starbucks'a Eklendi "+ customer.name );
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("M��teri Starbucks'a Silindi "+ customer.name );
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("M��teri Starbucks'a G�ncellendi "+ customer.name );
	}
	
	
	
}
