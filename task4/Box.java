package ua.lviv.lgs.task4;

public class Box {
	
	    private int x;
	    private int y; 
	    private int z;


	    Box(){
	        x =1;
	        y = 2;
	        z = 3;
	    }
	    Box(int x){
	    	this();
	    	this.x=x;	
	    }

	    Box(int y,int z){
	    	this(5);
	    	this.y=y;
	        this.z =z;
	    }

	   
	    void volume() {
	    	System.out.println(x*y*z);
	    }
	 
	   

	   
	}

