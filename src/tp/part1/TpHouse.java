package tp.part1;

import entities.house.House;
import entities.house.Room;
import enums.RoomType;
import utils.DisplayUtils;

public class TpHouse {

	public static void main(String[] args) {
		
		// Instanciation d'une maison
		House house = new House();
		
		// Instanciation de plusieurs pièces de types et attributs différents
		Room[] roomsToAdd = {
			new Room(RoomType.BATHROOM, 1, 6),
			new Room(RoomType.BEDROOM, 1, 7),
			new Room(RoomType.BEDROOM, 1, 8),
			new Room(RoomType.KITCHEN, 0, 7),
			new Room(RoomType.LIVING_ROOM, 0, 15),
			new Room(RoomType.WATER_CLOSET, 0, 5)
		};
		
		// On ajoute les pièces à la maison
		for (Room room : roomsToAdd) {
			try {
				house.addRoom(room);
			} catch (Exception err) {
				DisplayUtils.displayErr(err);
			}
		}
			
		// Un controle est fait si jamais la pièce est égale à null
		try {
			house.addRoom(null);
		} catch (Exception err) {
			DisplayUtils.displayErr(err);
		}
		
		//ou bien sa superficie est négative
		try {
			house.addRoom(new Room(RoomType.LIVING_ROOM, 0, -10));
		} catch (Exception err) {
			DisplayUtils.displayErr(err);
		}
		
		// On affiche ensuite la superficie du rez de chaussée de la maison
		DisplayUtils.display(house.getAreaOfFloor(0) + " m²");
		
		// La superficie du 1er étage
		DisplayUtils.display(house.getAreaOfFloor(1) + " m²");
		
		// La superficie totale de la maison
		DisplayUtils.display(house.getTotalArea() + " m²");
		
		// Le nombre de cuisines dans la maison
		DisplayUtils.display(house.countRoomType(RoomType.KITCHEN));
		
		// La superficie totale de toutes les chambres de la maison
		DisplayUtils.display(house.getTotalAreaOfRoomType(RoomType.BEDROOM) + " m²");
		
	}
	
}
