package jpt1;
/*
* This program calculates the area and perimeter of the rectangle, square and circle. 
* I put 5 classes in file instead of making 4 different files
* Naresh Kc
* 
*/
import java.util.Random;
class Rectangle extends Shape{
	private double width;
	
	public double perimeter(double length, double width){
		this.width = width;
		this.length = length;
		return( (getLength()+getWidth())*2);}
	
	public double area(double length,double width){
		this.width = width;
		super.length = length;
		return getLength()*getWidth();}
	
	public double getWidth() {
		return width;}
	public void setWidth(double width) {
		this.width = width;}}




class Triangle extends Shape{
	private double width;
	
	public double perimeter(double length, double width){
		this.width = width;
		this.length = length;
		return( (getLength()+getWidth())*2);}
	
	public double area(double length,double width){
		this.width = width;
		super.length = length;
		return (.5 * getLength()*getWidth());}
	
	public double getWidth() {
		return width;}
	public void setWidth(double width) {
		this.width = width;}}




 class Square extends Shape{
	 public double perimeter(double length){
			this.length = length;
			return( 4 * getLength());}
		
		public double area(double length){
			this.length = length;
			return getLength()*getLength();}}
 
 
 

 class Circle extends Shape{
 	private double radius;
 	private double height;

 	public double getHeight() {
 		return height;}

 	public void setHeight(double height) {
 		this.height = height;}

 	public double getRadius() {
 		return radius;}

 	public void setRadius(double radius) {
 		this.radius = radius;}
 	
 	public double area(double radius){
 		this.radius = radius;
 		return Math.PI * (Math.pow(radius, 2));}
 	
 
 	public double calculateCircumference() {
 		return (2 * Math.PI * radius);
 	}
 }
 
 
 
 
 
 
 public class Shape {
		public double length;
		String color[] = {"green", "red","blue","black"};
		
		public double getLength(){
			return length;}
		
		public void setLength(double length) {
			this.length = length;}
		
		public String getColor(){
			Random rn = new Random();
			return color[rn.nextInt(4)];}
		
		public double area(double length) {
			return 0.0;
		}
		
		
		
		
		
		
		
		public static void main(String[] args) {
			Random num1 = new Random();
			for(int i=1;i<10;i++){
				int a = num1.nextInt(100); // picks random number and based on the that random number different objects are created

				if(a%3 == 0){
					Rectangle rectangle1 = new Rectangle();
					System.out.println("Rectangle number "+ i + " is " +  rectangle1.getColor());
					System.out.println("length is " + a + " breadth is " + 3);
					System.out.println("Its perimeter is " + rectangle1.perimeter(a,3));
					System.out.println("And its area is " +  rectangle1.area(a,3) + "\n");	}
				
				else if(a%3 ==1){
					Square square1 = new Square();
					System.out.println("Square number "+ i + " is " + square1.getColor());
					System.out.println("length is " + a);
					System.out.println("Its perimeter is " +  square1.perimeter(a));
					System.out.println("And its area is " + ( square1).area(a) + "\n");}
				
				else{
				Circle circle1 = new Circle();
				System.out.println("Circle number "+ i + " is "  + circle1.getColor());
				System.out.println("Radius of cicle is " + a);
				System.out.println("And its area is " + circle1.area(a) + "\n");
				}}}}
 
 
 
 
 