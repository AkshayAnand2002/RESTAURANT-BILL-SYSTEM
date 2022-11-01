import java.util.ArrayList;
public class Bill {
	private ArrayList<String>orderedFood;
	private ArrayList<Integer>orderedQuantity;
	public Bill() {
		orderedFood=new ArrayList<String>();
		orderedQuantity=new ArrayList<Integer>();
	}
	public double totalCost;
	public double getTotal() {
		return totalCost;
	}
	public void addOrder(String meal,int quantity,
			String[] dish,double[] cost) {
		orderedFood.add(meal);
		orderedQuantity.add(quantity);
		for(int i=0;i<dish.length;i++) {
			if(meal.equals(dish[i])) {
				totalCost += quantity*cost[i];
			}
		}
	}
	public void getOrder() {
		for(int i=0;i<orderedFood.size();i++) {
			System.out.println(orderedFood.get(i)+
					" "+orderedQuantity.get(i));
		}
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
