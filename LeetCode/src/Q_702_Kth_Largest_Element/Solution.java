package Q_702_Kth_Largest_Element;

import java.util.PriorityQueue;

/*
Design a class to find the kth largest element in a stream.
Note that it is the kth largest element in the sorted order, not the kth distinct element.
Your KthLargest class will have a constructor which accepts an integer k and an integer array nums,
which contains initial elements from the stream. For each call to the method KthLargest.add, 
return the element representing the kth largest element in the stream.
 * */

public class Solution {

	//	public int k;
	//	PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
	static class KthLargest {
		private int k;
		private PriorityQueue<Integer> heap;

		public KthLargest(int k, int[] nums) {
			this.k = k;
			this.heap = new PriorityQueue<>(k);
			for (int number : nums) {
				add(number);
			}
		}

		public int add(int val) {
			heap.add(val);

			if (heap.size() > k) {
				heap.poll();
			}

			return heap.peek();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 3;
		int[] arr = {4,5,8,2};

		KthLargest kthLargest =new KthLargest(k,arr);
		//		int a =kthLargest.add(3);   // returns 4
		//		kthLargest.add(5);   // returns 5
		//		kthLargest.add(10);  // returns 5
		//		kthLargest.add(9);   // returns 8
		//		kthLargest.add(4);   // returns 8
		System.out.println(kthLargest.add(3));
		System.out.println(kthLargest.add(5));
		System.out.println(kthLargest.add(10));
		System.out.println(kthLargest.add(9));
		System.out.println(kthLargest.add(4));
	}


}





/*
 class KthLargest {

	private int k;
	private PriorityQueue<Integer> heap;

	public KthLargest(int k, int[] nums) {
	  this.k = k;
	  this.heap = new PriorityQueue<>(k);
	  for (int number : nums) {
		add(number);
	  }
	}

	public int add(int val) {
	  heap.add(val);

	  if (heap.size() > k) {
		heap.poll();
	  }

	  return heap.peek();
	}
  }
 * */
 