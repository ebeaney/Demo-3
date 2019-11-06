import java.util.Date;

public class Match {
    private User whiteUser;
    private User blackUser;

    //0 black win, 1 white win
    private int result;
    private Date startTime;
    private Date endTime;

    public Match( User blackUser,User whiteUser) {
        this.whiteUser = whiteUser;
        this.blackUser = blackUser;
    }

    public User getWhiteUser() {
        return whiteUser;
    }

    public User getBlackUser() {
        return blackUser;
    }

    public void record(){
        // BlackUser  WhiteUser   result
    }
}
