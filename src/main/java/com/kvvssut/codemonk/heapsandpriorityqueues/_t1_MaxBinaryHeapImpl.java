package com.kvvssut.codemonk.heapsandpriorityqueues;

/*
 * Priority-Queues - stores elements in it on the basis of the values of its elements. A Priority Queue is based on Heaps.
 * Priority queues are used to obtain elements on the basis of some of the properties they possess. For example, 
 * a Max-Heap based Priority Queue always dequeues the maximum element present in the queue. A min-heap dequeues the minimum element present in the queue.
 * 
 * Heaps are a special type of binary trees, which stores elements on the basis of their values.
 * There are specifically two types of heaps -
 * 	Min-Heaps
 * 	Max-Heaps
 * 
 * A Binary Heap is a Binary Tree with following properties.
 * 1) It’s a complete tree (All levels are completely filled except possibly the last level and the last level has all keys as left as possible). This property of Binary Heap makes them suitable to be stored in an array.
 * 2) A Binary Heap is either Min Heap or Max Heap. In a Min Binary Heap, the key at root must be minimum among all keys present in Binary Heap. The same property must be recursively true for all nodes in Binary Tree. Max Binary Heap is similar to Min Heap.
 * 
 * In a max-heap, each node has greater value than any of its children. Suppose there are N jobs in a queue to be done, and each job has its own priority. 
 * The job with maximum priority will get completed first than others. At each instant, we are completing a job with maximum priority and at the same time, 
 * we are also interested in inserting a new job in the queue with its own priority. So at each instant, we have to check for the job with maximum priority 
 * to complete it and also insert if there is a new job. This task can be very easily executed using a heap by considering N jobs as N nodes of the tree. 
 * Assume a heap having some elements which are stored in array A. The way to convert this array into a heap structure is the following -
 * 
 * 	Pick a node in the array, check if the left subtree and the right subtree are max-heaps, in themselves and the node itself is a max-heap 
 * (its value should be greater than all the child nodes).
 * 
 */
public class _t1_MaxBinaryHeapImpl {

	public static void main(String[] args) {
		
	}
	
	public static int getMax(int [] heap) {
		return heap[0];
	}
	
	

}
