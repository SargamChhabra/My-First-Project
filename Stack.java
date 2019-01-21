import java.util.*;
class Stack{

	int e[]=new int[10];
	int tos=-1;
	void push(int a){
		tos++;
		e[tos]=a;
	}
	void pop(){
		tos--;
	}
	boolean isEmpty(){
	if (tos==-1)
	 return true;
	 else
	  return false;
	}
	boolean isFull(){
	if(tos==9)
	return true;
	else
	return  false;
	}
	boolean spaceLeft(){
	if(tos<9)
	return true;
	else
	return false;
	}
}