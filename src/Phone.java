public class Phone {
    String touchscreen;
    String storage;
    String unlock;
    String transferdata;
    String music;
    String virtualassistant;
    String videodefinition;
    String photos;
    String operatingsystem;





    //Methods


    void determineTouchscreen()
    {
        System.out.println("Determined TouchScreen");
    }
    void changeStorage()
    {
        System.out.println("Storage Changed");
    }
    public Phone (String touchscreen,String storage,String unlock,String transferdata,String music,
                             String virtualassistant,String videodefinition,String photos, String operatingsystem)
    {
        this.touchscreen="touchscreen";
        this.storage="icloud";
        this.unlock="slide";
        this.transferdata="airdrop";
        this.music="applemusic";
        this.virtualassistant="siri";
        this.videodefinition="HD";
        this.photos="livephotos";
        this.operatingsystem="ios";
    }
    void changeUnlock()
    {
        System.out.println("Unlock Changed");
    }
    void changeTransferData()
    {
        System.out.println("TransferData Changed");
    }
    void determineMusic()
    {
        System.out.println("Determined Music");
    }
    void changeVirtualAssistant()
    {
    }
    void determineVideoDefenition()
    {
    }
    void determinePhotos()
    {
    }
    void determineOperatingSystem()
    {
    }


}
















