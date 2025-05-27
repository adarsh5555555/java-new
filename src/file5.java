public class file5 {
    int noOfPersons;

    @Override
    public String toString() {
        return "file5{" +
                "noOfPersons=" + noOfPersons +
                '}';
    }

    public int getNoOfPersons() {
        return noOfPersons;
    }

    public void setNoOfPersons(int noOfPersons) {
        this.noOfPersons = noOfPersons;
    }
    public void manypersons(){
        if(this.noOfPersons>=5){
            System.out.println("yess there are many persons");
        }else{
            System.out.println("no there are less persons");
        }
    }
}
