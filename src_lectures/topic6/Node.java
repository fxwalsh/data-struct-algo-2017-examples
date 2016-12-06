package topic6;

/* 
--Node-- 
The binary tree is built using this nested node class. 
Each node stores one data element, and has left and right 
sub-tree pointer which may be null. 
The node is a "dumb" nested class -- we just use it for 
storage; it does not have any methods. 
*/ 
public class Node<Value> { 
 Node<Value> left; 
 Node<Value> right; 
 Value data; 
 Node(Value newData) { 
   left = null; 
   right = null; 
   data = newData; 
 } 
} 