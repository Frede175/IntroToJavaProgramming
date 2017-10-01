/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.Chapter10;

/**
 *
 * @author fsr19
 */
public class MyRectangle2D {
	private double x, y, width, height;
	

	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}

	
	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public MyRectangle2D() {
		x = 0; y = 0; width = 1; height = 1;
	}

	public MyRectangle2D(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return width * 2 + height * 2;
	}

	public boolean contains(double x, double y) {
		return (x > this.x - width / 2 && x < this.x + width / 2 && y > this.y - height / 2 && y < this.y + height / 2);
	}

	public boolean contains(MyRectangle2D rect) {
		return (rect.getX() - rect.getWidth() / 2 > this.x - width / 2 && rect.getX() + rect.getWidth() / 2 < this.x + width / 2 && rect.getY() - rect.getHeight() > this.y - height / 2 && rect.getY() + rect.getHeight() < this.y + height / 2);
	}

	public boolean overlaps(MyRectangle2D rect) {
		return 	contains(rect.getX() - rect.getWidth() / 2, rect.getY() - rect.height / 2) ||
			contains(rect.getX() + rect.getWidth() / 2, rect.getY() + rect.height / 2) ||
                        contains(rect.getX() + rect.getWidth() / 2, rect.getY() - rect.height / 2) ||
			contains(rect.getX() - rect.getWidth() / 2, rect.getY() + rect.height / 2) ||
			rect.contains(x - width / 2, y - height / 2) ||
			rect.contains(x + width / 2, y + height / 2) ||
                        rect.contains(x + width / 2, y - height / 2) ||
			rect.contains(x - width / 2, y + height / 2);
	}
}
