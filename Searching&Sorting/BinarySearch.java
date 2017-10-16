class BinarySearch {
	int search(int[] a, int l, int r, int x) {
		int mid = l + (r - l) / 2;
		while (l <= r) {
			// element at mid itself
			if (a[mid] == x)
				return x;
			// element in right subarray
			else if (a[mid] < x)
				return search(a, mid + 1, r, x);
			// element in left subarray
			else
				return search(a, l, mid - 1, x);

		}
		// element not found
		return -1;
	}

	// Driver program
	public static void main(String agrs[]) {
		BinarySearch ob = new BinarySearch();
		int[] test = { 1, 2, 3, 4, 5, 6 };
		int l = 0;
		int r = test.length - 1;
		System.out.println(ob.search(test, l, r, 9));
	}
}