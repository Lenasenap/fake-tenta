package taskone;

public class ClassRoom {
    private int numberOfScreens;
    private int classRoomNumber;
    private boolean hasFan;
    private String description;

    public ClassRoom(int numberOfScreens, int classRoomNumber, boolean hasFan, String description) {
        this.numberOfScreens = numberOfScreens;
        this.classRoomNumber = classRoomNumber;
        this.hasFan = hasFan;
        this.description = description;
    }

    public ClassRoom() {
    }

    public int getNumberOfScreens() {
        return numberOfScreens;
    }

    public void setNumberOfScreens(int numberOfScreens) {
        this.numberOfScreens = numberOfScreens;
    }

    public int getClassRoomNumber() {
        return classRoomNumber;
    }

    public void setClassRoomNumber(int classRoomNumber) {
        this.classRoomNumber = classRoomNumber;
    }

    public boolean isHasFan() {
        return hasFan;
    }

    public void setHasFan(boolean hasFan) {
        this.hasFan = hasFan;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
