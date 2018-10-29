package ua.lviv.lgs.task;

public interface Iterator {
	public boolean hasNext();

	public Object next();
}

class Collection {
	private static Object[] arr;

	Collection(Object[] arr) {
		Collection.arr = arr;
	}

//	Inner class
	public class Forward implements Iterator {

		private int count = 0;

		@Override
		public boolean hasNext() {
			return count < arr.length;
		}

		@Override
		public Object next() {
			return arr[count++];
		}

	}

	public Forward createForward() {
		return new Forward();
	}

//	Inner class
	public class Backward implements Iterator {
		int count = arr.length - 1;

		@Override
		public boolean hasNext() {
			return count >= 0;
		}

		@Override
		public Object next() {
			return arr[count--];
		}
	}

	public Backward createBackward() {
		return new Backward();
	}

//	Inner class
	public class ForwardOddToZero implements Iterator {
		private int count = 0;

		@Override
		public boolean hasNext() {
			return count < arr.length;
		}

		@Override
		public Object next() {

			if ((int) arr[count] % 2 == 0)
				return arr[count++];
			else {
				count++;
				return 0;
			}
		}
	}

	public ForwardOddToZero createForwardOddToZero() {
		return new ForwardOddToZero();
	}

//	Inner class
	public class BackwardBy2Step implements Iterator {
		int count = arr.length;

		@Override
		public boolean hasNext() {
			return count-- >= 1;
		}

		@Override
		public Object next() {
			return arr[count--];
		}
	}

	public BackwardBy2Step createBackwardBy2Step() {
		return new BackwardBy2Step();
	}

	// Anonymous class
	public Iterator createAnonymous() {
		return new Iterator() {

			int count = arr.length - 1;
			int count2 = 0;

			@Override
			public boolean hasNext() {
				return count >= 0;
			}

			@Override
			public Object next() {

				count2++;
				if (count2 > 2) {
					count2 = 0;
					if ((int) arr[count] % 2 == 1) {
						return arr[count--];
					} else {
						count--;
						return "*";
					}
				} else {
					count--;
					return "-";
				}
			}

		};
	}

	// Local class
	public Iterator createForwardBy5Step() {
		class ForwardBy5Step implements Iterator {

			private int count = 0;
			int count2 = 0;

			@Override
			public boolean hasNext() {
				return count < arr.length;
			}

			@Override
			public Object next() {
				count2++;
				if (count2 > 4) {
					count2 = 0;
					if ((int) arr[count] % 2 == 0) {
						return (int) arr[count++] - 100;
					} else {
						count++;
						return "*";
					}
				} else {
					count++;
					return "-";
				}
			}

		}

		return new ForwardBy5Step();
	}

	// static neasted
	private static class FromOddToEven implements Iterator {

		private int count = 0;
		int count2 = 0;

		@Override
		public boolean hasNext() {
			return count < arr.length;
		}

		@Override
		public Object next() {
			count2++;
			if (count2 > 1) {
				count2 = 0;
				if ((int) arr[count] % 2 == 0) {
					return (int) arr[count++] + 1;
				} else {
					count++;
					return "*";
				}
			} else {
				count++;
				return "-";
			}
		}
	}

	public static FromOddToEven createFromOddToEven() {
		return new FromOddToEven();
	}
}