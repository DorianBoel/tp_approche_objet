package entities;

import enums.RoomType;

/**
 * Represents a generic room that's part of a house or building.
 * 
 * @author DorianBoel
 */
public class Room {
	
	/**
	 * The nature of the room.
	 */
	private RoomType type;

	/**
	 * The floor of the bulding where this room is located.
	 * The value 0 represents the bottom floor.
	 */
	private int floor;
	
	/**
	 * The room's surface area in square meters.
	 */
	private double area;
	
	/**
	 * Constructor for {@link Room}.
	 * 
	 * Creates a new room at the given floor and with the given
	 * surface area.
	 * 
	 * @param type The type used to identify the room
	 * @param floor The floor where the room is located
	 * @param area The room's surface area
	 */
	public Room(RoomType type, int floor, double area) {
		this.type = type;
		this.floor = floor;
		this.area = area;
	}
	
	/**
	 * Getter for {@link #room}.
	 * 
	 * @return This room's type
	 */
	public RoomType getType() {
		return type;
	}

	/**
	 * Getter for {@link #floor}.
	 * 
	 * @return The floor where this room is located
	 */
	public int getFloor() {
		return floor;
	}

	/**
	 * Getter for {@link #area}.
	 * 
	 * @return This room's surface area
	 */
	public double getArea() {
		return area;
	}
	
	/**
	 * Setter for {@link #type}.
	 * 
	 * @param type The new type to replace the current one
	 */
	public void setType(RoomType type) {
		this.type = type;
	}

	/**
	 * Setter for {@link #floor}.
	 * 
	 * @param floor The new floor number to replace the current one
	 */
	public void setFloor(int floor) {
		this.floor = floor;
	}

	/**
	 * Setter for {@link #area}.
	 * 
	 * @param area The new surface area to replace the current one
	 */
	public void setArea(double area) {
		this.area = area;
	}
	
}
