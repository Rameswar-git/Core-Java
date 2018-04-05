package com.liang.chapter9;

public class MyRectangle2D {
	private double x;
	private double y;
	private double width;
	private double height;

	public MyRectangle2D() {
		this.width=1;
		this.height=1;
	}

	public MyRectangle2D(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public static MyRectangle2D getRectangle(double[][] points){
		final int COL_X=0;
		final int COL_Y=1;
		double[] minMaxX=findminmax(points,COL_X);
		double[] minMaxY=findminmax(points,COL_Y);
		double x=(minMaxX[0]+minMaxX[1])/2;
		double y=(minMaxY[0]+minMaxY[1])/2;
		double height=Math.sqrt(Math.pow(minMaxY[1]-minMaxY[0], 2));
		double width=Math.sqrt(Math.pow(minMaxX[1]-minMaxX[0], 2));
		return new MyRectangle2D(x,y,width,height);
		
	}
	
	

	private static double[] findminmax(double[][] points, int cOL_X) {
		double[] minmax=new double[2];
		minmax[0]=minmax[1]=points[0][cOL_X];
        for (int i = 0; i < points.length; i++) {
			if (points[i][cOL_X] < minmax[0]) {
				minmax[0]=points[i][cOL_X] ;
			}
			if (points[i][cOL_X] > minmax[1]) {
				minmax[1]=points[i][cOL_X] ;
			}
		}
		return minmax;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		return width*height;
	}
	public double getgetPerimete() {
		return 2*(width+height);
	}
	public boolean contains(double x,double y) {
		return getDistance(y, this.y) <= height/2 &&  getDistance(x, this.x) <= width/2;
	}
	public boolean contains(MyRectangle2D rec) {
		return getDistance(y, rec.y)+rec.height <= height/2 &&  
				getDistance(x, rec.x)+rec.width <= width/2 && 
				
				height/2+rec.height <=height/2 && width/2+rec.width <=width/2;
	}
	
   public double getDistance(double p1,double p2) {
	return Math.sqrt(Math.pow(p2-p1, 2));
   } 	

   
}
