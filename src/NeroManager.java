public class NeroManager implements CustomerService {

	@Override
	public void add(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("M��teri Neroya Eklendi"+ customer.name );
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("M��teri Neroya Silindi"+ customer.name );
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("M��teri Neroya G�ncellendi"+ customer.name );

	}

}
