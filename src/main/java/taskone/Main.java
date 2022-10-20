package taskone;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/resources/classrooms.json");
        ClassRoom roomSix = new ClassRoom(34, 55, true, "Den här salen är bäst, ingen protest");
        ClassRoom roomThree = new ClassRoom(0, 3, false, "Bra att inte ha några skärmar tycker vi");

        List<ClassRoom> classRoomList = new ArrayList<>();
        classRoomList.add(roomThree);
        classRoomList.add(roomSix);

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(path.toFile(), classRoomList);


        List<ClassRoom> classRooms = List.of(mapper.readValue(path.toFile(), ClassRoom[].class));

        for (ClassRoom classRoom : classRooms) {
            System.out.println(classRoom.getNumberOfScreens());
        }

    }
}
