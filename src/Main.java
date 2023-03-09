public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Phone p1=new Phone("feathertouch","icloud","slide","airdrop",
                "applemusic","siri","HD","livephotos","ios");

        Phone p2=new Phone("singletouch","drive","facerecognition","bluetooth",
                "samsungmusic","google","4k","3D","android");

        Phone p3=new Phone("feathertouch","myphone","numberlock","apps",
                "youtube","siri","HD","portrait","ios");

        Phone p4=new Phone("feathertouch","icloud","slide","airdrop",
                "applemusic","siri","HD","livephotos","ios");

        Phone p5=new Phone("singletouch","drive","facerecognition","bluetooth",
                "spotify","google","4k","vertical","android");

        Phone p6=new Phone("feathertouch","myphone","pattern","bluetooth",
                "spotify","google","4k","vertical","android");

        Phone p7=new Phone("singletouch","drive","facerecognition","bluetooth",
                "spotify","google","HD","livephotos","android");

        Phone p8=new Phone("singletouch","drive","button","bluetooth",
                "spotify","google","4k","vertical","android");

        Phone p9=new Phone("feathertouch","icloud","number","airdrop",
                "applemusic","siri","HD","livephotos","ios");

        //Assign values to properties
        //<object-name>,<property-name>=<value>;


        p1.touchscreen="feathertouch";
        p2.storage="icloud";
        p3.unlock="slide";
        p4.transferdata="airdrop";
        p5.music="applemusic";
        p6.virtualassistant="siri";
        p7.videodefinition="HD";
        p8.photos="livephotos";
        p9.operatingsystem="ios";

        //<object-name>.<method-name>();

        p1.determineTouchscreen();
        p2.changeStorage();
        p3.changeUnlock();
        p4.changeTransferData();
        p5.determineMusic();
        p6.changeVirtualAssistant();
        p7.determineVideoDefenition();
        p8.determinePhotos();
        p9.determineOperatingSystem();


    }
}