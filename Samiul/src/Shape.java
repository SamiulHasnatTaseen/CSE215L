class Shape {
	private String color;
	
	public Shape() {
		color = "Colourless";
	}
	public Shape(String color) {
		this.color=color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	@Override
	public String toString() {
		return "The color of the shape is: "+color;
	}
}