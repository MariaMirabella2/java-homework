package Tema4;

public class VideoStoreLauncher {
    public static  void main(String[] args) {

        VideoStore.addVideo("The Matrix");
        VideoStore.addVideo("Cable Girls");
        VideoStore.addVideo("The Good Place");
        VideoStore.checkOut("The Good Place");
        VideoStore.recieveRating("Cable Girls", 10);
        VideoStore.recieveRating("Cable Girls", 4);
        VideoStore.listInventory();
        VideoStore.returnVideo("The Good Place");
        VideoStore.listInventory();
    }
}
