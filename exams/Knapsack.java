public class Knapsack {

	public static void main(String[] args) {
		Item item1 = new Item(10, 60);
		Item item2 = new Item(20, 100);	
		Item item3 = new Item(30, 120);
		Item item4 = new Item(15, 200);
		
		Item[] arr = { item1, item2, item3, item4 };

		System.out.println(knapsack(arr, 30));
		System.out.println(knapsack(arr, 50));
	}

	public static int knapsack(Item[] items, int w) {
		return knapsack(items, w, 0);
	}

	private static int knapsack(Item[] items, int weight, int index) {
		if (index == items.length) {
			return 0;
		}

		if (weight - items[index].getWeight() >= 0) {
			return max(
				items[index].getValue() + knapsack(items, weight - items[index].getWeight(), index + 1), 
				knapsack(items, weight, index + 1)
			);
		}

		return knapsack(items, weight, index + 1);
		

	}

	public static int max(int a, int b) {
		return a > b ? a : b;
	}
}
