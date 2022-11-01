
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] dish= {"SANDWICH","COFFEE","FRENCH FRIES","SALAD"};
		double[] cost= {6.5,3.2,4.0,3.5};
		Bill mybill=new Bill();
		mybill.addOrder("SANDWICH", 2, dish, cost);
		mybill.addOrder("COFFEE", 2, dish, cost);
		mybill.addOrder("FRENCH FRIES", 1, dish, cost);
		mybill.addOrder("SALAD", 1, dish, cost);
		mybill.getOrder();
		System.out.println(mybill.getTotal());
	}

}
