package ua.lviv.lgs.task;

public class IteratorApplication {
	public static void main(String[] args) {
		Integer[] array = { 1, 43, -2, 34, 9, 17, -82, 1, 6, 55, 12, 9, 3, 3, 44, 6, 4 };

		Collection collection = new Collection(array);

		System.out.println("\n\n--->");

		Iterator iteratorForward = collection.createForward();
		while (iteratorForward.hasNext()) {
			System.out.print("\t" + iteratorForward.next());
		}

		System.out.println("\n\n<---");

		Iterator iterBackward = collection.createBackward();
		while (iterBackward.hasNext()) {
			System.out.print("\t" + iterBackward.next());
		}

		System.out.println("\n\nodd to zero");

		Iterator forwardOddToZero = collection.createForwardOddToZero();
		while (forwardOddToZero.hasNext()) {
			System.out.print("\t" + forwardOddToZero.next());
		}

		System.out.println("\n\n<--- by2step");

		Iterator backwardBy2Step = collection.createBackwardBy2Step();
		while (backwardBy2Step.hasNext()) {
			System.out.print("\t" + backwardBy2Step.next());
		}

		System.out.println("\n\nif third is odd");

		Iterator anonymous = collection.createAnonymous();
		while (anonymous.hasNext()) {
			System.out.print("\t" + anonymous.next());
		}

		System.out.println("\n\nif fifth is even minus 100");

		Iterator forwardBy5Step = collection.createForwardBy5Step();
		while (forwardBy5Step.hasNext()) {
			System.out.print("\t" + forwardBy5Step.next());
		}

		System.out.println("\n\n from odd to even by2step");

		Iterator fromOddToEven = Collection.createFromOddToEven();
		while (fromOddToEven.hasNext()) {
			System.out.print("\t" + fromOddToEven.next());
		}
	}
}
