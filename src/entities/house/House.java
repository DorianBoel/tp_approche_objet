package entities.house;

import static utils.GeneralUtils.pushToArray;

import enums.RoomType;

/**
 * Represents a house composed of several rooms.
 * 
 * @author DorianBoel
 */
public class House {

	/**
	 * A list of rooms that compose the house.
	 */
	private Room[] rooms = {};
	
	/**
	 * Adds a new room to the house.
	 * 
	 * @param room The new room to be added
	 * @throws Exception If the room object is equal to {@code null}, or if its attributes are
	 * invalid
	 */
	public void addRoom(Room room) throws Exception {
		if (room == null) {
			throw new Exception("The room must have a value different from null.");
		}
		if (room.getArea() < 0) {
			throw new Exception("The room can't have a negative surface area");
		}
		rooms = pushToArray(room, rooms);
	}
	
	/**
	 * Calculates the total surface area of every room
	 * in this house.
	 * 
	 * @return This house's total surface area in square meters
	 */
	public double getTotalArea() {
		double total = 0;
		for (Room room : rooms) {
			total += room.getArea();
		}
		return total;
	}
	
	/**
	 * Calculates the total surface area of every room in a
	 * given floor of this house.
	 * 
	 * @param floor The number of the floor to get the surface area of
	 * @return The floor's total surface area in square meters
	 */
	public double getAreaOfFloor(int floor) {
		double total = 0;
		for (Room room : rooms) {
			if (room.getFloor() == floor) {
				total += room.getArea();
			}
		}
		return total;
	}
	
	/**
	 * Calculates the total surface area of every room of a given
	 * room type in this house.
	 * 
	 * @param roomType The type belonging to every room to
	 * get the total surface area of
	 * @return The total surface area of every room of the type
	 */
	public double getTotalAreaOfRoomType(RoomType type) {
		double total = 0;
		for (Room room : rooms) {
			if (room.getType().equals(type)) {
				total += room.getArea();
			}
		}
		return total;
	}
	
	/**
	 * Counts how many room of a given type are present in
	 * this house.
	 * 
	 * @param type The type of room to count
	 * @return The number of rooms of the given type that are within
	 * this house
	 */
	public int countRoomType(RoomType type) {
		int count = 0;
		for (Room room : rooms) {
			if (room.getType().equals(type)) {
				count++;
			}
		}
		return count;
	}

	/**
	 * Getter for {@link #rooms}.
	 * 
	 * @return The list of rooms in this house
	 */
	public Room[] getRooms() {
		return rooms;
	}
	
}
