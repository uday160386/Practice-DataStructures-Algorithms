package code.ds.sort;

import java.util.Arrays;

import code.ds.trees.Node;

public class HeapSort {

	int size=0;
	int capacity =16;
	int items[] = new int[capacity];
	public int getLeftchildIndex(int parentIndex)
	{
		return 2*parentIndex+1;
	}
	public int getRightchildIndex(int parentIndex)
	{
		return 2*parentIndex+2;
	}
	public int getParentIndex(int childindex)
	{
		return (childindex-1)/2;
	}
	
	public int getLeftChildValue(int index)
	{
		return  items[getLeftchildIndex(index)];
	}
	public int getRightChildValue(int index)
	{
		return  items[getRightchildIndex(index)];
	}
	public int getParent(int index)
	{
		return  items[getParentIndex(index)];
	}
	
	public boolean hasLeftChild(int index)
	{
		return getLeftChildValue(index)<size;
	}
	public boolean hasRightChild(int index)
	{
		return getRightChildValue(index)<size;
	}
	
	public boolean hasParent(int index)
	{
		return getParent(index)>size;
	}
	
	
	public void swap(int indexone,int indextwo)
	{
		int temp =items[indexone];
		items[indexone]=items[indextwo];
		items[indextwo]=temp;
	}
	
	public void ensureCapacity()
	{
		if(size==capacity)
		{
			items=Arrays.copyOf(items, capacity*2);
			capacity*=2;
		}
	}
	
	public int peek()
	{
		if(size==0)
			throw new IllegalStateException();
		return items[0];
	}
	
	public int poll()
	{
		if(size==0)
			throw new IllegalStateException();
		int item = items[0];
		items[0]=items[size-1];
		size--;
		heapifyDown();
		return item;
	}
	
	public void insert(int item)
	{
		ensureCapacity();
		items[size]=item;
		size++;
		heapifyUp();
	}
	
	public void heapifyUp()
	{
		int index=size-1;
		while (hasParent(index)&&getParent(index)>items[index])
		{
			swap(getParentIndex(index),index);
			index=getParentIndex(index);
		}
	}
	
	public void heapifyDown()
	{
		int index=0;
		while(hasLeftChild(index))
		{
			int smallerchildIndex=getLeftchildIndex(index);
			if(hasRightChild(index)&&getRightChildValue(index)<getLeftChildValue(index))
			{
				smallerchildIndex=getRightchildIndex(index);
			}
			
			if((items[index]<items[smallerchildIndex]))
			{
				break;
			}
			else
			{
				swap(index,smallerchildIndex);
			}
			index=smallerchildIndex;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
