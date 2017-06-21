
public class Tester {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(11);
		list.add(22);
		System.out.println(list);
		list.addLast(17);
		list.add(27, 1);
		list.add(8, 0);
		list.add(88, 100);
		list.add(12,3);
		list.add(9,8);
		System.out.println(list);
		Link max = list.max();
		System.out.println(max==null? null : max.getData());
		System.out.println(list.sumDiff());
		LinkedList list2 = new LinkedList();
		list2.add(7);
		list2.add(10);
		System.out.println(list2.sumDiff());
		System.out.println(list.indexOf(11));
		System.out.println(list.indexOf(211));
		System.out.println(list.revToString());
	}

}
