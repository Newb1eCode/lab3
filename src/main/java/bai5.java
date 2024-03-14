public class bai5 {
    private String username;
    public bai5(String username) {
        this.username = username;
    }
    public String getUser(){
        if(username.equals("")||username == null){
            throw new NullPointerException();
        }
        return username;
    }

}
