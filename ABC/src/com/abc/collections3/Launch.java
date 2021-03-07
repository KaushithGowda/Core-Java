package com.abc.collections3;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Launch {

	public static void main(String[] args) {

		//3 ways of creating ArrayList object
		//1.Zero parameter constructor method 
        //ArrayList al1 = new ArrayList();

		//2.parameterized constructor method 
		//ArrayList al2 = new ArrayList(12);
		ArrayList al2 = new ArrayList(12);
		
		//3.conversion of collection c to ArrayList type
		//Collection c = new LinkedHashSet();
		//ArrayList al3 = new ArrayList(c);
		
		// default capacity of ArrayList = 10
		ArrayList al1 = new ArrayList();
        al1.add(10);		
        al1.add(10);		
        al1.add("ABC");
        al1.add(null);		
        System.out.println("al1::al1.add(<value>)" + al1);
        
		ArrayList al21 = new ArrayList();
		al21.add(100);
		al21.add(200);
		al21.add(300);
		al21.add(400);
		System.out.println("al2::" + al21);
		
		al1.addAll(al21);
//		al1.addAll(al1);
		System.out.println("al2::al1.add(<arrayRef>)" + al1);
		
		ArrayList al3 = new ArrayList();
		al3.add(10);		
        al3.add(20);		
        al3.add(30);		
        al3.add(40);
        System.out.println("al3::" + al3);
        
		ArrayList al4 = new ArrayList();
		al4.add(10);
		al4.add(20);
		al4.add(300);
		al4.add(400);
		System.out.println("al4::" + al4);
		
//		retainAll method checks for common element and returns boolean and only retains common elements
//		System.out.println(al3.retainAll(al4));
//		System.out.println(al3);
		
		//removes common element and retains unique elements only
		al3.removeAll(al4);
		System.out.println("al3::al3.removeAll(<arrayRef>)" + al3);
		
		ArrayList al5 = new ArrayList();
		al5.add(10);
		al5.add(20);
		al5.add(30);
		al5.add(40);
		System.out.println(al5.toString());
		System.out.println("al5::" + al5);
		//adding 1000 at index 1 and value at index 1 moves next spot
		al5.add(1,1000);
		System.out.println("al5::add(<index,value>)" + al5);
		//removes value at any index
		al5.remove(1);
		System.out.println("al5::remove(<index>)" + al5);
		//checks whether the value is present in the array and returns booolean
		System.out.println(al5.contains(10));
		System.out.println("al5::contains" + al5);
		//fetches value at any index of an array
		System.out.println(al5.get(2));
		System.out.println("al5::al5.get(<index>)" + al5);
		//returns the index of any value specified 
		System.out.println(al5.indexOf(30));
		System.out.println("al5::al5.indexOf(<value>)" + al5);
		//checks the array if it is empty and returns boolean 
		System.out.println(al5.isEmpty());
		System.out.println("al5::al5.isEmpty()" + al5);
		System.out.println(al5);
		//clears the array data
//		al5.clear();
//		System.out.println("al5::al5.clear()" + al5);
		System.out.println(al5);
        //replaces the value at specified index 
		al5.set(1, 1000);
		System.out.println("al5::al5.set(<index,value>)" + al5);
		System.out.println(al5);
		
		ArrayList al6 = new ArrayList();
		al6.add(10);
		al6.add(20);
		al6.add(30);
		al6.add(40);
		al6.add(50);
		al6.add(60);
		//works best when insertion is at rear end ---> less cpu time
		//works worst when insertion is at front end ---> more cpu time(shifting data time is included)
		al6.add(0,1000);
		System.out.println("al6::" + al6);
		
		//11-12-2020 12pm
		ArrayList al7 = new ArrayList();
	    al7.add(100);
	    al7.add(200);
	    al7.add(200);
	    System.out.println("al7:: "+al7.size());
	    al7.trimToSize();
	    System.out.println("al7:: "+al7);
	    System.out.println("al7:: "+al7.size());
	    
	    /*two ways of creating LinkedList 
	    (because there are two constructors in LinkedList)
	    LinkedList default capacity = 10*/
	    //1.LinkedList ll = new LinkedList();
	    LinkedList ll = new LinkedList();
	    ll.add(10);
	    ll.add(10);
	    ll.add(30);
	    ll.add(40);
	    ll.add("abc");
	    ll.add(true);
	    ll.add(null);
	    System.out.println("ll:: "+ll);
	    
	    /*2.Collection c = new LinkedHashSet();
        LinkedList ll = new LinkedList(c);*/
        Collection c = new LinkedHashSet();
        LinkedList ll2 = new LinkedList(c);
        
        //default capacity of LinkedList = 10
        LinkedList ll3 = new LinkedList();
        ll3.add(10);
	    ll3.add(20);
	    ll3.add(30);
	    ll3.add(40);
	    //adds element at index 0 and moves the previous data to next index 
        ll3.addFirst(100);
        //adds element at last index and extends the capacity 
        ll3.addLast(200);
        System.out.println("ll3::" + ll3);
        //fetches the first element
        System.out.println("ll3::ll3.getFirst() " + ll3.getFirst());
        //fetches the last element
        System.out.println("ll3::ll3.getLast() " + ll3.getLast());
        //fetches the particular index element
        System.out.println("ll3::ll3.get(<index>) " + ll3.get(2));
        //removes the element at index 0        
        System.out.println("ll3-->before ll3.removeFirst() and ll3.removeLast() " + ll3);
        ll3.removeFirst();        
        //removes the element at last index         
        ll3.removeLast();        
        System.out.println("ll3-->after ll3.removeFirst() and ll3.removeLast() " + ll3);
        
        //14-12-2020
        LinkedList ll4 = new LinkedList();
        ll4.add(10);
        ll4.add(20);
        ll4.add(30);
        ll4.addFirst(100);
        ll4.add(2,1000);
        System.out.println("ll4:: "+ll4);
        
       /*three ways of creating ArrayDeque 
        * (because there are three constructors in ArrayDeque)
        * default capacity of ArrayDeque = 16
	   1.ArrayDeque ad = new ArrayDeque();*/
       ArrayDeque ad = new ArrayDeque();
       ad.add(10);
       ad.add(10);
       ad.add(20);
       ad.add("ABC");
       ad.add(10.5f);
       ad.add(true);
       ad.addFirst(100);
       ad.addLast(100);
       System.out.println("ad:: "+ad);
        
       //2.ArrayDeque ad = new ArrayDeque(int <value>);
       ArrayDeque ad1 = new ArrayDeque(10);
       
       /*3.Collection c = new LinkedHashSet();
       ArrayDeque ll = new ArrayDeque(c);*/
       Collection c1 = new LinkedHashSet();
       ArrayDeque ad2 = new ArrayDeque(c1);
       
       //PriorityQueue:: this class is present in collection this will keep least value first
       // default capacity of PriorityQueue = 11
       //ArrayList,ListedList,ArrayQueue:: These classes keep datastructure sequencially
       ArrayDeque ad3 = new ArrayDeque();
       ad3.add(100);
       ad3.add(10);
       ad3.add(20);
       System.out.println("ad:: "+ad3);
       
       //Smallest value first 
       PriorityQueue pq = new PriorityQueue();
       pq.add(100);
       pq.add(50);
       pq.add(150);
       pq.add(25);
       pq.add(75);
       pq.add(125);
       pq.add(175);
       System.out.println("pq:: "+pq);
       
       PriorityQueue pq2 = new PriorityQueue();
       pq2.add(100);
       pq2.add(100);
       pq2.add(10);
       pq2.add(10);
       pq2.add(10);
       pq2.add(125);
       pq2.add(175);
       System.out.println("pq2:: "+pq2);
       
       //15-12-2020
       PriorityQueue al = new PriorityQueue(); 
       //al.add();
       /* Boxing:: converting primitive value into object(int a ---> obj a) using wrappper class(Interger Class)
        * i.e. primitive value is in the stack box we put that in the heap box */
       
       //ways of boxing
       //1.
       int a = 10;
       Integer a1 = new Integer(a);//manual boxing
       System.out.println("a:primitive data:stack:box:: "+a);//10
       System.out.println("a1:object:heap:box:: "+a1);//10

       //2.
       int b = 10;
       Integer b1 = b;//autoboxing
       System.out.println("b:: "+b);
       System.out.println("b1:: "+b1);
       
       /* Unboxing:: converting  object(obj a ---> int a) into primitive value using method(intValue())
        * i.e. object is in the heap box we put that in the stack box as primitive data */
       
       //1.
       Integer x1 = new Integer(10);
       int x = x1.intValue();//manual unboxing
       System.out.println("x:: "+x);
       System.out.println("x1:: "+x1);
       
       //2.
       Integer y1 = new Integer(10);
       int y = y1;//auto unboxing
       System.out.println("y:: "+y);
       System.out.println("y1:: "+y1);
       
       //Manual boxing
       ArrayList al_1 = new ArrayList();
       al_1.add(new Integer(10));
       al_1.add(new Double(10.5));
       al_1.add(new Float(20.5f));
       al_1.add(new String("ABC"));
       System.out.println("al_1:: "+al_1);

       //Auto boxing
       ArrayList al_2 = new ArrayList();
       al_2.add(10);
       al_2.add(10.5);
       al_2.add(20.5f);
       al_2.add("ABC");
       System.out.println("al_2:: "+al_2);
       
       //16-12-2020
       TreeSet ts =new TreeSet();
       ts.add(100);
       ts.add(50);
       ts.add(150);
       ts.add(25);
       ts.add(75);
       ts.add(125);
       ts.add(175);    
       System.out.println("ts:: "+ts);
       
       TreeSet ts3 =new TreeSet();
       ts3.add(100);
       ts3.add(100);
       ts3.add(10);
       ts3.add(10);
       ts3.add(75);
       ts3.add(125);
       ts3.add(175);    
       System.out.println("ts3:: "+ts3);
       
       
       //insert duplicates into ts
       TreeSet ts2 =new TreeSet();
       ts2.add(100);
       ts2.add(50);
       ts2.add(150);
       //duplicate value
       ts2.add(50);
       ts2.add(75);
       ts2.add(125);
       ts2.add(175);    
       System.out.println("ts2:: "+ts2);
       
       /*hetergeneous data
       TreeSet ts3 = new TreeSet();
       ts3.add(100);
       ts3.add(50);
       ts3.add(10.5f);
       ts3.add(true);
       ts3.add(100);
       ts3.add(125);
       ts3.add(175);    
       System.out.println("ts3:: "+ts3);*/
       
       //string
       TreeSet ts4 = new TreeSet();
       ts4.add("Prithiv Shaw");
       ts4.add("Agarwal");
       ts4.add("Cheteswar Pujara");
       ts4.add("Virat Kohli");
       ts4.add("Ajinkya Rahane");
       System.out.println("ts4:: "+ts4);
       
       //float
       TreeSet ts5 = new TreeSet();
       ts5.add(9.5f);
       ts5.add(10.5f);
       ts5.add(11.5f);
       System.out.println(ts5);
       
       //boolean
       TreeSet ts6 = new TreeSet();
       ts6.add(true);
       ts6.add(true);
       ts6.add(false);
       System.out.println(ts6);
       
       //character
       TreeSet ts7 = new TreeSet();
       ts7.add('A');
       ts7.add('a');
       ts7.add('B');
       System.out.println(ts7);
       
       TreeSet ts8 = new TreeSet();
       ts8.add(100);
       ts8.add(50);
       ts8.add(150);
       ts8.add(25);
       ts8.add(75);
       ts8.add(125);
       ts8.add(175);   
       System.out.println(ts8);
       System.out.println("first:: "+ts8.first());//25
       System.out.println("last:: "+ts8.last());//175
       System.out.println("ceiling:: "+ts8.ceiling(110));//125
       System.out.println("ceiling:: "+ts8.ceiling(125));//125
       System.out.println("higher:: "+ts.higher(110));//125
       System.out.println("higher:: "+ts.higher(125));//150
       System.out.println("floor:: "+ts.floor(110));//100
       System.out.println("floor:: "+ts.floor(100));//100
       System.out.println("lower:: "+ts.lower(110));//100
       System.out.println("lower:: "+ts.lower(100));//75
       System.out.println("headSet:: "+ts.headSet(125));
       System.out.println("tailSet:: "+ts.tailSet(125));
       //subset(x,y) :: returns values btw x and y (inclusive x but exclusive y)
       System.out.println("subSet:: "+ts.subSet(75,175));
       
       HashSet hs = new HashSet();
       hs.add(100);
       hs.add(50);
       hs.add(150);
       hs.add(25);
       hs.add(75);
       hs.add(125);
       hs.add(175); 
       System.out.println("hs:: "+hs);
       
       HashSet hs3 = new HashSet();
       hs3.add(100);
       hs3.add(100);
       hs3.add(true);
       hs3.add(null);
       hs3.add(75);
       hs3.add(125);
       hs3.add(175); 
       System.out.println("hs3:: "+hs3);
       
       //can store heterogeneous data
       //cannot store duplicates(collision may occur)
       //order of insertion is not preserved
       //it increases its capacity when 75%(load factor 0.75) of space is filled
       //new capacity= old capacity*2 (default capacity = 16) 
       //it can store null as it does not compare values when retriving data
       
       HashSet hs2 = new HashSet();
       hs2.add(100);
       hs2.add(100);
       hs2.add('A');
       hs2.add(50);
       hs2.add(10.2);
       hs2.add("ABC");
       hs2.add(125);
       hs2.add(175); 
       hs2.add(50); 
       hs2.add(null); 
       System.out.println("hs2:: "+hs2);
       
       LinkedHashSet lhs = new LinkedHashSet();
       lhs.add(100);
       lhs.add(50);
       lhs.add(150);
       lhs.add(25);
       lhs.add(75);
       lhs.add(125);
       lhs.add(175); 
       System.out.println("lhs:: "+lhs);
       
       LinkedHashSet lhs2 = new LinkedHashSet();
       lhs2.add(100);
       lhs2.add(100);
       lhs2.add(true);
       lhs2.add(null);
       lhs2.add(75);
       lhs2.add(125);
       lhs2.add(175); 
       System.out.println("lhs2:: "+lhs2);
       
       /*for loop:: uses index to access the data from Array
        * As for loop uses index,data from ArrayList,LinkedList can be accessed
        * PriorityList,ArrayDeque,HashSet,LinkedList do not possess index
        * So using for loop we cannot access data in these data structures
        */

       System.out.println("for loop::ArrayList ");
       ArrayList al8= new ArrayList();
       al8.add(100);
       al8.add(50);
       al8.add(150);
       al8.add(25);
       al8.add(75);
       al8.add(125);
       al8.add(175);
       for(int i=0; i<=al8.size()-1; i++) {
    	   System.out.println(al8.get(i));
       }
       
       System.out.println("for loop::LinkedList ");
       LinkedList ll5 = new LinkedList();
       ll5.add(10);
       ll5.add(20);
       ll5.add(30);
       ll5.add(40);
       ll5.add(50);
       for(int i=0; i<=ll5.size()-1; i++) {
    	   System.out.println(ll5.get(i));
       }
       //addition
       //mul
       //div of for
      
       //21-12-2020
       //for-each loop
       
       /*
        * for-each loop:: does not makes use of index it makes use of object
        * Hence, it can access data from all data structure
        */
		
       System.out.println("for-each loop::ArrayList");
       ArrayList al9= new ArrayList();
       al9.add(100);
       al9.add(50);
       al9.add(150);
       al9.add(25);
       al9.add(75);
       al9.add(125);
       al9.add(175);
       for(Object a_1:al9) {
    	   System.out.println(a_1);
       }
       
       System.out.println("for-each loop::LinkedList");
       LinkedList ll6= new LinkedList();
       ll6.add(100);
       ll6.add(50);
       ll6.add(150);
       ll6.add(25);
       ll6.add(75);
       ll6.add(125);
       ll6.add(175);
       for(Object a_2:ll6) {
    	   System.out.println(a_2);
       }
       
       System.out.println("while loop::ArrayList");
       ArrayList al10= new ArrayList();
       al10.add(100);
       al10.add(50);
       al10.add(150);
       al10.add(25);
       al10.add(75);
       al10.add(125);
       al10.add(175);
       
       //creating the cursor at a position,before index 0
       Iterator itr = al10.iterator();
       //iterator:: works only in foward direction
       
       //moves the cursor to next position
       while(itr.hasNext()==true)
       {
    	   //double clickes the data at particular index
    	   System.out.println(itr.next());
       }
       
       //ListIterator
       //1.forward
       System.out.println("while loop::ArrayList::ListIterator::forward");
       //creating the cursor at position before index 0
       ListIterator listItr = al10.listIterator();
       //moves the cursor to next position
       while(listItr.hasNext()) {
    	   //double clickes the data at particular index
    	   System.out.println(listItr.next());
       }
       
       //2.reverse
       System.out.println("while loop::ArrayList::ListIterator::reverse");
       //creating the cursor at position after last index
       ListIterator listItr2 = al10.listIterator(al10.size());
       //moves the cursor to previous position
       while(listItr2.hasPrevious()) {
    	   //double clickes the data at particular index
    	   System.out.println(listItr2.previous());
       }
       
       
       System.out.println("while loop::LinkedList::descendingIterator");
       LinkedList ll7= new LinkedList();
       ll7.add(100);
       ll7.add(50);
       ll7.add(150);
       ll7.add(25);
       ll7.add(75);
       ll7.add(125);
       ll7.add(175);
       Iterator itr1 = ll7.descendingIterator();
       // descendingIterator(possible only in LinkedList,ArrayDeque,TreeSet)
       // possible only in reverse direction
       while(itr1.hasNext())
       {
    	   System.out.println(itr1.next());
       }

       System.out.println("while loop::ArrayDeque::desendingIterator");
       ArrayDeque ad_3 = new ArrayDeque();
       ad_3.add(100);
       ad_3.add(25);
       ad_3.add(150);
       ad_3.add(125);
       ad_3.add(175);
       
       Iterator di = ad_3.descendingIterator();
       
       while(di.hasNext()) {
    	   System.out.println(di.next());
       }
       
       //Vector class acts as ArrayList 
       //except size extension formula new capacity=(old capacity*2)
       System.out.println("legacy class::");
       Vector v = new Vector();
       v.add(100);
       v.add(150);
       v.add(50);
       v.add(25);
       v.add(75);
       v.add(125);
       v.add(175);
       
       Enumeration en = v.elements();
       
       while(en.hasMoreElements()) {
    	   System.out.println(en.nextElement());
       }
       
       /*Different ways of creating Vector class
        * 1.Vector v = new Vector(int initialCapacity)
        * 2.Vector v = new Vector(int initialCapacity, int capacityIncrement)
        * 3.Vector v = new Vector(Collection c)
        * 4.Vector v = new Vector()*/
       
       System.out.println("Stack Class::");
       Stack s = new Stack();
       s.push(100);
       s.push(200);
       s.push(300);
       s.push(400);
       //pop() ::this method will pop out the data from stack
       System.out.println(s.pop());
       System.out.println(s.pop());
       //peek() :: this method will just fetch data(does not remove it from the stack
       System.out.println(s.peek());
       System.out.println(s.pop());
       //empty() :: this method will return wheather the stack is empty or not
       System.out.println(s.empty());
       s.push(500);
       s.push(600);
       s.push(700);
       System.out.println(s.peek());
       //search() :: this method returns the distance to top data of the stack
       System.out.println(s.search(100));
       
       System.out.println("ArrayList::");
       ArrayList ab = new ArrayList();
       ab.add(78);
       ab.add(56);
       ab.add(100);
       ab.add(200);
       ab.add(10);
       /*for(int i=0; i<=ab.size()-1; i++) {
    	   System.out.println(ab.get(i));
    	   ab.add(99);//structural modification
       }*/
       
       Iterator itr2 = ab.iterator();
       while(itr2.hasNext()) {
    	   System.out.println(itr2.next());
    	   //ab.add(99);//structural modification
    	   }
       
       System.out.println("CopyOnWriteArrayList::");
       CopyOnWriteArrayList cow = new CopyOnWriteArrayList();
       cow.add(78);
       cow.add(56);
       cow.add(100);
       cow.add(200);
       cow.add(10);
       Iterator itr3 = cow.iterator();
       while(itr3.hasNext()) {
    	   System.out.println(itr3.next());
    	   ab.add(99);//structural modification
       }
       
       System.out.println("sorting::");
       
       TreeSet ts9 = new TreeSet();
       ts9.add(78);
       ts9.add(90);
       ts9.add(23);
       ts9.add(89);
       ts9.add(45);
       ts9.add(67);
       System.out.println("sorting::TreeSet"+ts9);
       
       ArrayList al11 = new ArrayList();
       al11.add(78);
       al11.add(90);
       al11.add(23);
       al11.add(89);
       al11.add(45);
       al11.add(67);
       
       /*Collection--->root interface
        * Collections--->inbuilt class
        * Collections--->present inside util package
        * sort method--->present in Collections class
        * sort(<ref of >)sorts data in the datastructure
        */
       
       System.out.println("unsorted::ArrayList"+al11);
       Collections.sort(al11);
       System.out.println("sorted::ArrayList"+al11);
       
        /* Using sort method and storing heterogeneous data
        *  will lead to ClassCastException(runtimeException),to 
        *  aviod this we use generics and make object as particular type of data
        *  below program will result in ClassCastException
        */
       ArrayList al12 = new ArrayList();
       al12.add(78);
       al12.add(90);
       //al12.add("ABC");//Runtime-exception(Error)
       al12.add(23);
       al12.add(89);
       al12.add(45);
       //al12.add(true);//Runtime-exception(Error)
       al12.add(67);     
       //al12.add(67.2f);///Runtime-exception(Error)     
       Collections.sort(al12);
       System.out.println("sorted::ArrayList"+al12);
       
       /*<Integer>:: making the object as 
        * interger object(only accepts integer as input) (homogeneous).
        * This throws compilation error which is useful for developer 
        * for debugging before the project goes to live
        * ClassCastException ---> resolved in this below program
        */
       ArrayList<Integer> al13 = new ArrayList<Integer>();
       al13.add(78);
       al13.add(90);
       //al13.add("ABC");//Compiletime-exception(Error)
       al13.add(23);
       al13.add(89);
       al13.add(45);
       //al12.add(true);//Compiletime-exception(Error)
       al13.add(67);     
       //al12.add(67.2f);//Compiletime-exception(Error)   
       Collections.sort(al12);
       System.out.println("sorted::ArrayList"+al13);
  
       ArrayList<Double> al14 = new ArrayList<Double>();
       al14.add(78.1);
       al14.add(90.5);
       //al13.add("ABC");
       //al13.add(23);
       al14.add(89.5);
       al14.add(45.1);
       //al12.add(true);
       al14.add(67.3);     
       //al12.add(67.2f);     
       Collections.sort(al12);
       System.out.println("sorted::ArrayList"+al14);
       
   
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       }

}
