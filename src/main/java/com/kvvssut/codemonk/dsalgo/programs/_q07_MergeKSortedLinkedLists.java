package com.kvvssut.codemonk.dsalgo.programs;

public class _q07_MergeKSortedLinkedLists {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		LinkedList<Integer> list1 = extractedList1();

		LinkedList<Integer> list2 = extractedList2();

		LinkedList<Integer> list3 = extractedList3();

		LinkedList<Integer> list4 = extractedList4();

		LinkedList<Integer> list5 = extractedList5();

		int k = 5;

		LinkedList[] kLists = { list1, list2, list3, list4, list5 };

		LinkedList<Integer> sortedList = kLists[0];

		for (int i = 1; i < k; i++) {
			sortedList = mergeAndReturn2SortedLinkedListUsingRecursion(sortedList, kLists[i]);
		}

		while (sortedList != null) {
			System.out.print(sortedList.getData() + "  ");
			sortedList = sortedList.getNext();
		}
	}

	private static LinkedList<Integer> mergeAndReturn2SortedLinkedListUsingRecursion(LinkedList<Integer> list1,
			LinkedList<Integer> list2) {
		if (list1 == null) {
			return list2;
		} else if (list2 == null) {
			return list1;
		}

		LinkedList<Integer> result = null;

		if (list1.getData() <= list2.getData()) {
			result = list1;
			result.setNext(mergeAndReturn2SortedLinkedListUsingRecursion(list1.getNext(), list2));
		} else {
			result = list2;
			result.setNext(mergeAndReturn2SortedLinkedListUsingRecursion(list1, list2.getNext()));
		}

		return result;
	}

	static class LinkedList<K> {
		public K data;
		public LinkedList<K> next;

		public LinkedList() {
		}

		public LinkedList(K data) {
			this.data = data;
		}

		public K getData() {
			return this.data;
		}

		public void setData(K data) {
			this.data = data;
		}

		public LinkedList<K> getNext() {
			return next;
		}

		public void setNext(LinkedList<K> next) {
			this.next = next;
		}

		public void add(LinkedList<K> node) {
			if (this.data == null) {
				this.data = node.getData();
				this.next = node.getNext();
			} else {
				LinkedList<K> last = this;
				while (last.getNext() != null) {
					last = last.getNext();
				}
				last.setNext(node);
			}
		}

		public boolean isEmpty() {
			return this.data == null;
		}

		public int size() {
			LinkedList<K> node = this;
			int size = 0;
			while (node != null) {
				size++;
				node = node.getNext();
			}
			return size;
		}

	}

	private static LinkedList<Integer> extractedList1() {
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(new LinkedList<Integer>(3));
		list1.add(new LinkedList<Integer>(7));
		list1.add(new LinkedList<Integer>(11));
		list1.add(new LinkedList<Integer>(15));
		list1.add(new LinkedList<Integer>(19));
		list1.add(new LinkedList<Integer>(23));
		return list1;
	}

	private static LinkedList<Integer> extractedList2() {
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(new LinkedList<Integer>(8));
		list2.add(new LinkedList<Integer>(12));
		list2.add(new LinkedList<Integer>(16));
		list2.add(new LinkedList<Integer>(20));
		list2.add(new LinkedList<Integer>(24));
		list2.add(new LinkedList<Integer>(28));
		list2.add(new LinkedList<Integer>(32));
		list2.add(new LinkedList<Integer>(36));
		list2.add(new LinkedList<Integer>(40));
		return list2;
	}

	private static LinkedList<Integer> extractedList3() {
		LinkedList<Integer> list3 = new LinkedList<Integer>();
		list3.add(new LinkedList<Integer>(1));
		list3.add(new LinkedList<Integer>(5));
		list3.add(new LinkedList<Integer>(9));
		list3.add(new LinkedList<Integer>(13));
		list3.add(new LinkedList<Integer>(17));
		list3.add(new LinkedList<Integer>(21));
		list3.add(new LinkedList<Integer>(25));
		list3.add(new LinkedList<Integer>(29));
		list3.add(new LinkedList<Integer>(33));
		list3.add(new LinkedList<Integer>(37));
		return list3;
	}

	private static LinkedList<Integer> extractedList4() {
		LinkedList<Integer> list4 = new LinkedList<Integer>();
		list4.add(new LinkedList<Integer>(2));
		list4.add(new LinkedList<Integer>(6));
		list4.add(new LinkedList<Integer>(10));
		list4.add(new LinkedList<Integer>(14));
		list4.add(new LinkedList<Integer>(18));
		list4.add(new LinkedList<Integer>(22));
		list4.add(new LinkedList<Integer>(26));
		list4.add(new LinkedList<Integer>(30));
		list4.add(new LinkedList<Integer>(34));
		list4.add(new LinkedList<Integer>(38));
		list4.add(new LinkedList<Integer>(42));
		return list4;
	}

	private static LinkedList<Integer> extractedList5() {
		LinkedList<Integer> list5 = new LinkedList<Integer>();
		list5.add(new LinkedList<Integer>(5));
		list5.add(new LinkedList<Integer>(14));
		list5.add(new LinkedList<Integer>(19));
		list5.add(new LinkedList<Integer>(24));
		list5.add(new LinkedList<Integer>(29));
		list5.add(new LinkedList<Integer>(34));
		list5.add(new LinkedList<Integer>(39));
		list5.add(new LinkedList<Integer>(44));
		list5.add(new LinkedList<Integer>(49));
		return list5;
	}
}