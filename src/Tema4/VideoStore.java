package Tema4;

public abstract class VideoStore {
    private static Video[] arr= new Video[10];
    private static int cnt=0;
    public static void addVideo(String title){
        arr[++cnt]=new Video(title);
    }
    public static void checkOut(String title) {
        for(int i=1;i<=cnt;i++){
            if(arr[i].getTitle().equals(title)) {
                arr[i].Is_or_not();
            }
        }
    }
    public static void returnVideo(String title){
        for(int i=1;i<=cnt;i++){
            if(arr[i].getTitle().equals(title)) {
                arr[i].Is_or_not();
            }
        }
    }
    public static void recieveRating(String title, int rating){
        for(int i=1;i<=cnt;i++){
            if(arr[i].getTitle().equals(title)) {
                arr[i].setRating(rating);
            }
        }
    }
    public static void listInventory(){
        for(int i=1;i<=cnt;i++){
            if(arr[i].getIs_or_not()==true) {
                System.out.println(arr[i].getTitle()+" "+arr[i].getRating());
            }
        }
    }

}
